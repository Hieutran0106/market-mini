
package GUI.ManageGroup.ManageItem.ManagerPanel;

import BUS.BusAccessor.HoaDonBUS;
import BUS.BusAccessor.PhieuHuyBUS;
import BUS.BusAccessor.PhieuNhapBUS;
import BUS.BusAccessor.ThongKeBUS;
import BUS.SaleServices.Money;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.NhanVien;
import DTO.PhieuHuy;
import DTO.PhieuNhap;
import DTO.SanPham;
import GUI.ManageGroup.Theme.NhapHuyPanel;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JOptionPane;

public class ThongKePanel extends javax.swing.JPanel {
    private final PhieuNhapBUS nhapBUS = new PhieuNhapBUS();
    private final PhieuHuyBUS huyBUS = new PhieuHuyBUS();
    private final HoaDonBUS hdBUS = new HoaDonBUS();
    private final ThongKeBUS tkBus = new ThongKeBUS();
    /**
     * Creates new form ThongKePanel
     */
    public ThongKePanel() {
        NhapHuyPanel.setup();
        initComponents();
        startDay = new DateChooser();
        startDay.setForeground(Color.decode("#59ABE3"));
        endDay = new DateChooser();
        endDay.setForeground(Color.decode("#59ABE3"));
        startDay.setTextRefernce(jTextField1);
        endDay.setTextRefernce(jTextField2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel31 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        button20 = new GUI.SaleGroup.LoginGui.Component.Button();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(119, 176, 210));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(43, 133, 161));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel37.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, -1));

        jLabel57.setBackground(new java.awt.Color(119, 176, 210));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 153, 204));
        jLabel57.setText("NHÂN VIÊN");
        jPanel37.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 233, 50));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("BÁN NHIỀU ĐƠN NHẤT");
        jPanel37.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 56, 176, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("DOANH THU CAO NHẤT");
        jPanel37.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 204, 176, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Trong");
        jPanel37.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Mã nhân viên:");
        jPanel37.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("0");
        jPanel37.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 30, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Mã nhân viên:");
        jPanel37.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("0");
        jPanel37.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 20, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Trong");
        jPanel37.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 60));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 136, -1, -1));

        jPanel34.setBackground(new java.awt.Color(119, 176, 210));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 204, 153));
        jLabel58.setText("HÓA ĐƠN");
        jPanel29.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 228, 50));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("<html> KHÁCH HÀNG ĐEM LẠI DOANH THU CAO NHẤT");
        jPanel29.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 180, 40));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("SỐ LƯỢNG HÓA ĐƠN");
        jPanel29.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 30));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("<html>TỔNG SỐ ĐƠN");
        jPanel29.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, 50));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("<html> KHÁCH HÀNG MUA NHIỀU HÓA ĐƠN NHẤT");
        jPanel29.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 170, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("0");
        jPanel29.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");
        jPanel29.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 120, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");
        jPanel29.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0");
        jPanel29.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 50));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 156, -1, -1));

        jPanel28.setBackground(new java.awt.Color(119, 176, 210));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, -1));

        jLabel55.setBackground(new java.awt.Color(153, 153, 153));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 102));
        jLabel55.setText("DOANH THU");
        jPanel33.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("DOANH THU");
        jPanel33.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 56, 177, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("SẢN PHẨM BÁN ĐƯỢC");
        jPanel33.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 177, 30));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("TỔNG SẢN PHẨM BÁN");
        jPanel33.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 177, 30));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("TỔNG DOANH THU");
        jPanel33.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 177, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        jPanel33.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 120, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        jPanel33.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0");
        jPanel33.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        jPanel33.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 50));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 185, -1, -1));

        jPanel36.setBackground(new java.awt.Color(119, 176, 210));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(255, 204, 0));
        jPanel39.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 204, 0));
        jLabel56.setText("NHẬP HỦY KHO");
        jPanel38.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 269, 44));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("TỔNG SẢN PHẨM NHẬP");
        jPanel38.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 56, 210, 30));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("SẢN PHẨM HỦY NHIỀU NHẤT");
        jPanel38.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 30));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("TỔNG SẢN PHẨM HỦY");
        jPanel38.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, 30));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("SẢN PHẨM NHẬP NHIỀU NHẤT");
        jPanel38.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 218, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("0");
        jPanel38.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");
        jPanel38.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 90));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("0");
        jPanel38.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 90));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("0");
        jPanel38.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 130, 50));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 209, 265, -1));

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(42, 148, 208));
        jLabel122.setText("THỐNG KÊ");
        add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        button20.setBackground(new java.awt.Color(118, 199, 150));
        button20.setForeground(new java.awt.Color(255, 255, 255));
        button20.setText("XUẤT EXCEL");
        button20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 150, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Tháng :");
        add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(-63, 0, -1, 40));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 210, 40));

        jTextField2.setText("jTextField2");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 210, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("TỪ NGÀY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("ĐẾN NGÀY");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jPanel6.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thống kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SelectedDate selectStart = startDay.getSelectedDate();
        SelectedDate selectEnd = endDay.getSelectedDate();
        String bd = selectStart.getYear() +"-"+selectStart.getMonth()+"-"+selectStart.getDay();
        String kt = selectEnd.getYear() +"-"+selectEnd.getMonth()+"-"+selectEnd.getDay();
        Timestamp bdTs = Timestamp.valueOf(bd+" 00:00:00");
        Timestamp ktTs = Timestamp.valueOf(kt+" 00:00:00");
        if (bdTs.compareTo(ktTs)>0) JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu","Thời gian lọc sai",JOptionPane.OK_OPTION);
        List<PhieuNhap> listNhap = nhapBUS.getPhieuNhapInTime(bd, kt);
        List<PhieuHuy> listHuy = huyBUS.getPhieuHuyInTime(bd, kt);
        List<HoaDon> listHoaDon = hdBUS.getHoaDonFromTo(bd, kt);
        xuLyDuLieu(listNhap, listHuy, listHoaDon);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void xuLyDuLieu(List<PhieuNhap> listNhap, List<PhieuHuy> listHuy, List<HoaDon> listHoaDon){
        NhanVien nvBanNhieuDon = tkBus.getNhanVienBanNhieuDonNhat(listHoaDon);
        if (nvBanNhieuDon != null){
            jLabel7.setText(nvBanNhieuDon.getMaNV()+"");
            jLabel8.setText("<html>"+nvBanNhieuDon.getTenNV());
        } else {
            jLabel7.setText("null");
            jLabel8.setText("Không có nhân viên");
        }

        NhanVien nvBanDoanhThuCao = tkBus.getNhanVienCoDoanhThuCaoNhat(listHoaDon);
        if (nvBanDoanhThuCao != null){
            jLabel5.setText(nvBanDoanhThuCao.getMaNV()+"");
            jLabel3.setText("<html>"+nvBanDoanhThuCao.getTenNV());
        } else {
            jLabel5.setText("null");
            jLabel3.setText("Không có nhân viên");
        }
        
        int soLuongHoaDon = tkBus.getSoLuongHoaDon(listHoaDon);
        jLabel13.setText(soLuongHoaDon+"");
        int tongSoLuongHoaDon = tkBus.getTongSoHoaDon();
        jLabel11.setText(tongSoLuongHoaDon+"");
        KhachHang khMuaNhieuDon = tkBus.getKhachHangMuaNhieuDon(listHoaDon);
        if (khMuaNhieuDon != null){
            jLabel12.setText("<html>"+khMuaNhieuDon.getTenKH()+" (Mã KH: "+khMuaNhieuDon.getMaKH()+")");
        } else {
            jLabel12.setText("Không có nhân viên");
        }
        KhachHang khDoanhThuCao = tkBus.getKhachHangDoanhThuCaoNhat(listHoaDon);
        if (khDoanhThuCao != null){
            jLabel9.setText("<html>"+khDoanhThuCao.getTenKH()+" (Mã KH: "+khDoanhThuCao.getMaKH()+")");
        } else {
            jLabel9.setText("Không có nhân viên");
        }
        int sanPhamDaBan = tkBus.getTongSanPhamBanDuoc(listHoaDon);
        jLabel15.setText(sanPhamDaBan+"");
        Long doanhThuThang = tkBus.getDoanhThuThang(listHoaDon);
        jLabel14.setText(Money.format(doanhThuThang));
        Long toanDoanhThu = tkBus.getTongDoanhThu();
        jLabel16.setText(Money.format(toanDoanhThu));
        int tongSanPhamDaBan = tkBus.getTongSanPhamDaBan();
        jLabel10.setText(tongSanPhamDaBan+"");
        int tongSanPhamNhap = tkBus.getTongSanPhamNhap(listNhap);
        jLabel18.setText(tongSanPhamNhap+"");
        SanPham spNhapNhieu = tkBus.getSanPhamNhapNhieuNhat(listNhap);
        if (spNhapNhieu != null){
            jLabel19.setText(spNhapNhieu.getTenSP()+ " (Mã SP: " +spNhapNhieu.getMaSP()+")");
        } else {
            jLabel19.setText("Không có sản phẩm");
        }
        int tongSanPhamHuy = tkBus.getTongSanPhamHuy(listHuy);
        jLabel21.setText(tongSanPhamHuy+"");
        SanPham spHuyNhieu = tkBus.getSanPhamHuyNhieuNhat(listHuy);
        if (spHuyNhieu != null){
            jLabel20.setText(spHuyNhieu.getTenSP()+ " (Mã SP: " +spHuyNhieu.getMaSP()+")");
        } else {
            jLabel20.setText("Không có sản phẩm");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button20;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private DateChooser startDay;
    private DateChooser endDay;
}
