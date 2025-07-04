package GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd;

import BUS.BusAccessor.NhanVienBUS;
import GUI.ManageGroup.Handle.NhanVienHandle.NhanVienToData;
import GUI.ManageGroup.Handle.NhanVienHandle.NhanVienValidate;
import DTO.NhanVien;
import GUI.ManageGroup.ManageItem.ManagerPanel.NhanVienPanel;
import GUI.ManageGroup.Theme.NhanVienAddTheme;
import GUI.ManageGroup.Theme.NhapHuyPanel;
import com.formdev.flatlaf.FlatLightLaf;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.Dates;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class NhanVienAdd extends javax.swing.JFrame {
    private final NhanVienValidate nhanvienValidate = new NhanVienValidate();
    private boolean isAdd;
    private final NhanVienBUS nvBUS = new NhanVienBUS();
    private NhanVien nv = null;
    private DateChooser dateChooserNhapNgaySinh;
    private DateChooser dateChooserNhapNgayThamGia;

    /**
     * Creates new form NhanVienAdd
     */
    public NhanVienAdd(boolean isAddFrame, int maNV) {
        initComponents();
        this.isAdd = isAddFrame;
        setUpPanel();
        if (!this.isAdd) {
            nv = nvBUS.get(maNV);
            if (nv != null) {
                loadDuLieuNhanVien(nv);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với mã: " + maNV, "Lỗi", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        }
    }

    private void setUpPanel() {
        dateChooserNhapNgaySinh = new DateChooser();
        dateChooserNhapNgaySinh.setForeground(Color.decode("#59ABE3"));
        dateChooserNhapNgayThamGia = new DateChooser();
        dateChooserNhapNgayThamGia.setForeground(Color.decode("#59ABE3"));
        dateChooserNhapNgaySinh.setTextRefernce(jTextField4);
        dateChooserNhapNgayThamGia.setTextRefernce(jTextField7);
    }

    private void loadDuLieuNhanVien(NhanVien nv) {
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "Dữ liệu nhân viên bị thiếu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jTextField1.setText(nv.getTenNV());
        jTextField3.setText(nv.getSoDienThoai());
        jTextField2.setText(nv.getCmnd());
        jComboBox1.setSelectedIndex(!nv.isGioiTinh() ? 0 : 1);
        dateChooserNhapNgaySinh.setSelectedDate(nv.getNgaySinh());
        dateChooserNhapNgayThamGia.setSelectedDate(nv.getNgayThamGia());
        jTextField5.setText(nv.getEmail());
        jTextField6.setText(nv.getDiaChi());
        jComboBox2.setSelectedIndex(nv.getMaChucVu() == 1 ? 0 : 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sanPhamAddBackground1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        imagePanel1 = new GUI.ManageGroup.ComponentPanel.ImagePanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        roundButton1 = new GUI.SaleGroup.SellerGUI.Component.RoundButton();
        roundButton2 = new GUI.SaleGroup.SellerGUI.Component.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sanPhamAddBackground1.setBackground(new java.awt.Color(0, 204, 255));
        sanPhamAddBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Tên nhân viên");
        sanPhamAddBackground1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 111, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("Giới tính");
        sanPhamAddBackground1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("CMND");
        sanPhamAddBackground1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Số điện thoại");
        sanPhamAddBackground1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Email");
        sanPhamAddBackground1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 255));
        jLabel7.setText("Ngày tham gia");
        sanPhamAddBackground1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nhân viên");
        sanPhamAddBackground1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 360, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        sanPhamAddBackground1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setText("Mã chức vụ");
        sanPhamAddBackground1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 91, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 255));
        jLabel11.setText("Địa chỉ");
        sanPhamAddBackground1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 91, 30));

        imagePanel1.setBackground(new java.awt.Color(0, 204, 255));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/staff.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        sanPhamAddBackground1.add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, 80));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 255));
        jLabel12.setText("Ngày sinh");
        sanPhamAddBackground1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 20));
        sanPhamAddBackground1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, -1));
        sanPhamAddBackground1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 130, -1));
        sanPhamAddBackground1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, -1));
        sanPhamAddBackground1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 130, -1));
        sanPhamAddBackground1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 290, -1));
        sanPhamAddBackground1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 290, -1));
        sanPhamAddBackground1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên bán hàng", "Quản lý cửa hàng" }));
        sanPhamAddBackground1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 130, 30));

        roundButton1.setBackground(new java.awt.Color(255, 153, 153));
        roundButton1.setForeground(new java.awt.Color(255, 255, 255));
        roundButton1.setText("Hủy");
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(roundButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 130, 40));

        roundButton2.setBackground(new java.awt.Color(119, 224, 161));
        roundButton2.setForeground(new java.awt.Color(255, 255, 255));
        roundButton2.setText("Xác nhận");
        roundButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton2ActionPerformed(evt);
            }
        });
        sanPhamAddBackground1.add(roundButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 130, 40));

        getContentPane().add(sanPhamAddBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_roundButton1ActionPerformed

    private void roundButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton2ActionPerformed
        if (isAdd) {
            addNhanVienAction();
        } else {
            editNhanVien();
        }
    }//GEN-LAST:event_roundButton2ActionPerformed

    public static void main(String args[]) {
        NhapHuyPanel.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Khi Thêm
                new NhanVienAdd(true, 0).setVisible(true);
                // Khi Sửa (ví dụ sửa nhân viên mã 3)
                // new NhanVienAdd(false, 3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private GUI.SaleGroup.SellerGUI.Component.RoundButton roundButton1;
    private GUI.SaleGroup.SellerGUI.Component.RoundButton roundButton2;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.SanPhamAddBackground sanPhamAddBackground1;
    // End of variables declaration//GEN-END:variables

    public void addNhanVienAction() {
        NhanVien nhanVien = kiemTraVaTraDuLieu(0);
        if (nhanVien != null) {
            nvBUS.add(nhanVien);
            dispose();
        }
    }

    public void editNhanVien() {
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "Không có nhân viên để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        NhanVien nhanVien = kiemTraVaTraDuLieu(nv.getMaNV());
        if (nhanVien != null) {
            nvBUS.edit(nv.getMaNV(), nhanVien);
            dispose();
        }
    }

    public NhanVien kiemTraVaTraDuLieu(int maNV) {
        String tenNhanVien = jTextField1.getText();
        String soDienThoai = jTextField3.getText();
        String cmnd = jTextField2.getText();
        boolean gioiTinh = jComboBox1.getSelectedIndex() == 0 ? false : true;
        String email = jTextField5.getText();
        String diachi = jTextField6.getText();
        int maChucVu = jComboBox2.getSelectedIndex() + 1;

        SelectedDate nhapNgaySinh = dateChooserNhapNgaySinh.getSelectedDate();
        SelectedDate nhapNgayThamGia = dateChooserNhapNgayThamGia.getSelectedDate();

        if (nhapNgaySinh == null || nhapNgayThamGia == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày sinh và ngày tham gia!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // Kiểm tra ngày nhập không lớn hơn ngày hiện tại
        LocalDate now = LocalDate.now();

        LocalDate ngaySinh = LocalDate.of(nhapNgaySinh.getYear(), nhapNgaySinh.getMonth(), nhapNgaySinh.getDay());
        LocalDate ngayThamGia = LocalDate.of(nhapNgayThamGia.getYear(), nhapNgayThamGia.getMonth(), nhapNgayThamGia.getDay());

        if (ngaySinh.isAfter(now)) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được lớn hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (ngayThamGia.isAfter(now)) {
            JOptionPane.showMessageDialog(this, "Ngày tham gia không được lớn hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String bd = nhapNgaySinh.getYear() + "-" + nhapNgaySinh.getMonth() + "-" + nhapNgaySinh.getDay();
        String kt = nhapNgayThamGia.getYear() + "-" + nhapNgayThamGia.getMonth() + "-" + nhapNgayThamGia.getDay();
        Timestamp bdTs = Timestamp.valueOf(bd + " 00:00:00");
        Date date = new Date(bdTs.getTime());
        Timestamp ktTs = Timestamp.valueOf(kt + " 00:00:00");
        Date date1 = new Date(ktTs.getTime());

        if (!nhanvienValidate.validateAll(tenNhanVien, soDienThoai, cmnd, diachi, email)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        } else {
            // (int maNV, String tenNV, boolean gioiTinh, String cmnd, Date ngaySinh, String soDienThoai, String email, String diaChi, Date ngayThamGia, int maChucVu, boolean isDeleted)
            NhanVien nhanVien = new NhanVien(maNV, tenNhanVien, gioiTinh, cmnd, date, soDienThoai, email, diachi, date1, maChucVu, false);
            return nhanVien;
        }
    }
}