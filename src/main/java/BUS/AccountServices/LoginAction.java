package BUS.AccountServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.TaiKhoanDAO;
import DTO.ChucVu;
import DTO.LoginDetail;
import DTO.NhanVien;
import DTO.TaiKhoan;
import GUI.ManageGroup.ManageItem.ManageFrame.ManageFrame;
import GUI.ManageGroup.ManageItem.ManagerPanel.NhapXuatPanel;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import GUI.SaleGroup.SellerGUI.SellerMainFrame;
//import com.formdev.flatlaf.FlatLightLaf;

import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class LoginAction{
    private final TaiKhoanDAO taiKhoanDAO;
    private final LoginDetailDAO loginDetailDAO;
    private final NhanVienDAO nhanVienDAO;
    private LoginDetail loginDetail;
    private final int AUTH_KEY_EXPIRE_TIME = 1000*60*60*2; // 2 hours // Thời gian hết hạn account
    private int soTK;
    private boolean rememberMe;
    private SellerMainFrame sell;
    private ManageFrame manager;
    
    public LoginAction() {
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }
    
    public LoginAction(SellerMainFrame sell, ManageFrame manager){
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
        this.sell = sell;
        this.manager = manager;
    }

    //Hàm này sẽ được gọi khi click đăng nhập ở form đăng nhập
    public boolean loginInput(String username, String password, boolean rememberMe){
        this.rememberMe = rememberMe;
        TaiKhoan tk = taiKhoanDAO.selectByTenTK(username);
        if (tk == null)
            return false;
        if (!tk.getMatKhau().equals(password)){
            setWrongPasswordTime(tk.getSoTK(),tk,tk.getSoLanSai()+1);
            return false;
        }
        soTK = tk.getSoTK();
        setWrongPasswordTime(tk.getSoTK(),tk,0);
        storeLoginAuth(rememberMe);

        return true;
    }

    //Kiểm tra file lưu auth key có tồn tại hay không và trả về kết quả kiểm tra
    public boolean checkAuthKey(){
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.readFromFile();
        if (authKey == null)
            return false;
        loginDetail = loginDetailDAO.selectByAuthKey(authKey);
        if (loginDetail == null){
            //Trường hợp này là thời gian duy trì đăng nhập đã hết
            LogoutAction.logout();
            return false;
        }
        
        this.rememberMe = true;
        //Dòng này để tăng thời gian hết hạn sau khi vào lại chương trình
        loginDetail.setLogoutTime(new Timestamp(System.currentTimeMillis() + AUTH_KEY_EXPIRE_TIME));
        soTK = loginDetail.getSoTK();
        loginDetailDAO.update(loginDetail.getLoginId(), loginDetail);
        
        return true;
    }

    //Lấy chức vụ ng dùng từ số tài khoản
    public int getChucVuNguoiDung(int soTK) {
        TaiKhoan taiKhoan = taiKhoanDAO.select(soTK);
        NhanVien nhanVien = nhanVienDAO.select(taiKhoan.getMaNV());
        return nhanVien.getMaChucVu();
    }

    //Khởi tạo frame khi login thành công
    public void showFrame(){
        int maChucVu = getChucVuNguoiDung(soTK);
        if (maChucVu == ChucVu.NHANVIENBANHANG){
            System.out.println("Khoi tao frame nhan vien ban hang");
//            JOptionPane.showMessageDialog(null,"Hiểm thị form nhân viên bán hàng","Auto login success",JOptionPane.CLOSED_OPTION);
            SellerMainFrame.maNV = taiKhoanDAO.select(soTK).getMaNV();
            sell.setVisible(true);
        }

        else if (maChucVu == ChucVu.NHANVIENQUANLY){
            System.out.println("Khoi tao frame nhan vien quan ly");
//            JOptionPane.showMessageDialog(null, "Hiển thị form nhân viên quản lý", "Auto login success", JOptionPane.CLOSED_OPTION);
            ManageFrame.maNV = taiKhoanDAO.select(soTK).getMaNV();
            NhapXuatPanel.maNhanVien = ManageFrame.maNV;
            manager.setVisible(true);
        }

    }


    
    protected void storeLoginAuth(boolean remember){
        
        if(remember){
            //Generate auth key and store it to file
            LoginFile loginFile = new LoginFile();
            String authKey = loginFile.createAuthKey(50);
            System.out.println("AuthKey: " + authKey);
            loginFile.setAuthKey(authKey);
            loginFile.writeToFile();
            loginDetail = new LoginDetail(0,authKey,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()+AUTH_KEY_EXPIRE_TIME),soTK);
        }else{ 
            loginDetail = new LoginDetail(0,null,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),soTK);
        }
        //Store to database
        loginDetailDAO.insert(loginDetail);
    }
    

    public void initLogin(){
        if (checkAuthKey())
            showFrame();
        else{
            System.out.println("Hien thi form dang nhap!");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginGui().setVisible(true);
                }
            });
        }

    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public LoginDetail getLoginDetail() {
        return loginDetail;
    }

    public void setLoginDetail(LoginDetail loginDetail) {
        this.loginDetail = loginDetail;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    
    //Tang so lan password nhap sai
    public void setWrongPasswordTime(int soTK, TaiKhoan tk,int times){
        tk.setSoLanSai(times);
        taiKhoanDAO.update(soTK, tk);
    }

    public static void main(String[] args){

          LoginAction logAct = new LoginAction();
          logAct.initLogin();
    }
}
