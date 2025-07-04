
package GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd;

import BUS.BusAccessor.GiamGiaSPBUS;
import BUS.BusAccessor.SanPhamBUS;
import BUS.SaleServices.CheckInfoSale;
import DTO.GiamGiaSP;
import DTO.SanPham;
import GUI.ManageGroup.Theme.NhapXuatTheme;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GiamGiaSanPhamAdd extends javax.swing.JFrame {
    private int maKM;
    private boolean isInsert;
    public GiamGiaSanPhamAdd() {
        initComponents();
    }
    
    public GiamGiaSanPhamAdd(String title, int maKM, boolean Insert){
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabel1.setText(title);
        this.maKM = maKM;
        this.isInsert = Insert;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        giamGiaSanPhamAddBackground3 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.GiamGiaSanPhamAddBackground();
        jLabel1 = new javax.swing.JLabel();
        imagePanel1 = new GUI.ManageGroup.ComponentPanel.ImagePanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        txtPtGiam = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        shape1 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel6 = new javax.swing.JLabel();
        shape2 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giamGiaSanPhamAddBackground3.setBackground(new java.awt.Color(0, 204, 255));
        giamGiaSanPhamAddBackground3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM GIẢM GIÁ SẢN PHẨM");
        giamGiaSanPhamAddBackground3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 310, -1));

        imagePanel1.setBackground(new java.awt.Color(0, 204, 255));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManageItem/FrameAdd/ComponentFrameAdd/icons8-voucher-64.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        giamGiaSanPhamAddBackground3.add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ngày bắt đầu");
        giamGiaSanPhamAddBackground3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ngày kết thúc");
        giamGiaSanPhamAddBackground3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("% Giảm");
        giamGiaSanPhamAddBackground3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mã sản phẩm");
        giamGiaSanPhamAddBackground3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, -1));

        txtNgayBD.setBackground(new java.awt.Color(255, 255, 255));
        giamGiaSanPhamAddBackground3.add(txtNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, -1));

        txtNgayKT.setBackground(new java.awt.Color(255, 255, 255));
        giamGiaSanPhamAddBackground3.add(txtNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, -1));

        txtPtGiam.setBackground(new java.awt.Color(255, 255, 255));
        giamGiaSanPhamAddBackground3.add(txtPtGiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, -1));

        txtMaSP.setBackground(new java.awt.Color(255, 255, 255));
        giamGiaSanPhamAddBackground3.add(txtMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 280, -1));

        shape1.setBackground(new java.awt.Color(0, 204, 255));
        shape1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shape1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Xác nhận");

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        giamGiaSanPhamAddBackground3.add(shape1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 100, 60));

        shape2.setBackground(new java.awt.Color(246, 228, 146));
        shape2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shape2MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hủy");

        javax.swing.GroupLayout shape2Layout = new javax.swing.GroupLayout(shape2);
        shape2.setLayout(shape2Layout);
        shape2Layout.setHorizontalGroup(
            shape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        shape2Layout.setVerticalGroup(
            shape2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        giamGiaSanPhamAddBackground3.add(shape2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giamGiaSanPhamAddBackground3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 20));

        getContentPane().add(giamGiaSanPhamAddBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shape1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape1MouseClicked
        // TODO add your handling code here:
        boolean check = isValidDate(txtNgayBD.getText(), txtNgayKT.getText()) && checkPtGiam(txtPtGiam.getText()) && hasProductId(txtMaSP.getText());
        if(check){
            if(isInsert){
                giamGiaSP.setSoPhieu(0);
                giamGiaSP.setIsDeleted(false);
                giamGiaSPBUS.add(giamGiaSP);
                JOptionPane.showConfirmDialog(this, "Inserted successfully!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
                
            }else{
                giamGiaSP.setSoPhieu(maKM);
                giamGiaSP.setIsDeleted(false);
                giamGiaSPBUS.edit(maKM, giamGiaSP);
                JOptionPane.showConfirmDialog(this, "Updated successfully!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
            }
            this.dispose();
        }
    }//GEN-LAST:event_shape1MouseClicked

    private void shape2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_shape2MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiamGiaSanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiamGiaSanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiamGiaSanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiamGiaSanPhamAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiamGiaSanPhamAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.GiamGiaSanPhamAddBackground giamGiaSanPhamAddBackground3;
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape1;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape2;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtPtGiam;
    // End of variables declaration//GEN-END:variables
    private final CheckInfoSale checkInfo = new CheckInfoSale();
    private final GiamGiaSPBUS giamGiaSPBUS = new GiamGiaSPBUS(); 
    private final SanPhamBUS sanPhamBus = new SanPhamBUS();
    private SanPham sanPham = new SanPham();
    private GiamGiaSP giamGiaSP = new GiamGiaSP();
    private final SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public boolean checkPtGiam(String ptGiam){
        int giam;
        try{
            giam = Integer.parseInt(ptGiam);
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập số phần trăm giảm cho sản phẩm!!!", "Chú ý!", JOptionPane.CLOSED_OPTION);
            return false;
        }
        if(giam < 0){
            JOptionPane.showConfirmDialog(this, "Phần trăm giảm không thể là số âm!!!", "Chú ý!", JOptionPane.CLOSED_OPTION);
            return false;
        }
        giamGiaSP.setPtGiam(giam);
        return true;
    }
    
    public boolean hasProductId(String productId){
        int id;
        try{
            id = Integer.parseInt(productId);
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập một con số là mã cho sản phẩm!!!", "Chú ý!", JOptionPane.CLOSED_OPTION);
            return false;
        }
        
        if(!checkInfo.isProductExsist(id)){
            JOptionPane.showConfirmDialog(this, "Sản phẩm chưa tồn tại!!!", "Chú ý!", JOptionPane.CLOSED_OPTION);
            return false;
        }
        
        giamGiaSP.setMaSP(id);
        return true;
    }
    
    public boolean isValidDate(String startDay, String endDay){
        try {
            Date startTime = new SimpleDateFormat("dd-MM-yyyy").parse(startDay);
            Timestamp ngayBatDau = new Timestamp(startTime.getTime());
            giamGiaSP.setNgayBD(ngayBatDau);
            Date endTime = new SimpleDateFormat("dd-MM-yyyy").parse(endDay);
            Timestamp ngayKetThuc = new Timestamp(endTime.getTime());
            if(ngayKetThuc.before(ngayBatDau)){
                JOptionPane.showConfirmDialog(this, "Ngày kết thúc phải sau ngày bắt đầu", "Chú ý!", JOptionPane.CLOSED_OPTION);
                return false;
            }
            giamGiaSP.setNgayKT(ngayKetThuc);
            return true;
        } catch (ParseException ex) {
           JOptionPane.showConfirmDialog(this, "Ngày bắt đầu không hợp lệ", "Chú ý!", JOptionPane.CLOSED_OPTION);
           return false;
        }
    }
    
    private void init(){
        this.txtMaSP.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                getAndSetImage(txtMaSP.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getAndSetImage(txtMaSP.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getAndSetImage(txtMaSP.getText());
            }
            
        });
        
        
        if(!isInsert){
            giamGiaSP = giamGiaSPBUS.get(maKM);
            this.txtNgayBD.setText(df.format(giamGiaSP.getNgayBD()));
            this.txtNgayKT.setText(df.format(giamGiaSP.getNgayKT()));
            this.txtPtGiam.setText(giamGiaSP.getPtGiam()+"");
            this.txtMaSP.setText(giamGiaSP.getMaSP()+"");
            this.imagePanel1.setPath(sanPhamBus.get(giamGiaSP.getMaSP()).getHinhAnh());
        }
    }
    
    private void getAndSetImage(String maSP){
        int maSPNumber;
        try{
            maSPNumber = Integer.parseInt(maSP);
            sanPham = sanPhamBus.get(maSPNumber);
            if(sanPham != null){
                this.imagePanel1.setPath(sanPham.getHinhAnh());
                this.jLabel8.setText(sanPham.getTenSP());
                return;
            }
            this.imagePanel1.setPath("no-product");
            this.jLabel8.setText("");
        }catch(NumberFormatException e){
            this.imagePanel1.setPath("no-product");
            this.jLabel8.setText("");
          
        }
        
    }

}
