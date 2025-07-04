/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import BUS.BusAccessor.SanPhamBUS;
import DTO.SanPham;
import GUI.ManageGroup.Theme.TimKiemNangCaoTheme;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JOptionPane;

public class SearchAndFilter extends javax.swing.JFrame {

    
    private SanPhamBUS spBUS = new SanPhamBUS();
    private MenuPanel menu;
    
    public SearchAndFilter(MenuPanel menu) {
        initComponents();
        this.menu = menu;
        NumberFormat numberFormatter = new DecimalFormat("#,###,###");
        String formattedNumber = numberFormatter.format(10000000);
        jFormattedTextField2.setValue(10000000);
        jFormattedTextField2.setText(formattedNumber);
        jFormattedTextField3.setValue(0);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        myLoaiSPComboBox1.getLoaiSPFromDatabase();
        nhaCungCapComboBox1.getNCCFromDatabase();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roundPanel1 = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myLoaiSPComboBox1 = new GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nhaCungCapComboBox1 = new GUI.SaleGroup.SellerGUI.Component.NhaCungCapComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("TÌM KIẾM NÂNG CAO");

        roundPanel1.setBackground(new java.awt.Color(243, 243, 243));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 30));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField2.setText("10000000");
        roundPanel1.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đóng ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 30));

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        jFormattedTextField3.setText("0");
        roundPanel1.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Giá tối đa:");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Tên sản phẩm, mô tả");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 30));

        myLoaiSPComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLoaiSPComboBox1ActionPerformed(evt);
            }
        });
        roundPanel1.add(myLoaiSPComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Nhà cung cấp:");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Giá tối thiểu:");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Loại sản phẩm:");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 30));
        roundPanel1.add(nhaCungCapComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myLoaiSPComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLoaiSPComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myLoaiSPComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Long max = Long.parseLong(jFormattedTextField2.getValue()+""); 
        Long min = Long.parseLong(jFormattedTextField3.getValue()+""); 
        if (min <0 || max <0 || (max < min)){
            JOptionPane.showMessageDialog(this, "Giá tiền không hợp lệ", "Wrong price", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int maNCC = nhaCungCapComboBox1.getSelectedItem().getMaNCC();
        String strNCC = maNCC+"";
        if ( maNCC == 0){
            strNCC = "";
        }
        List<SanPham> list = spBUS.advancedFilter(jTextField2.getText(), Long.toString(min), Long.toString(max), 
                myLoaiSPComboBox1.getSelectedItem().getMaLoai(), strNCC);
        this.menu.addToPanel(list);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SearchAndFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAndFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAndFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAndFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        TimKiemNangCaoTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAndFilter(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    private GUI.SaleGroup.SellerGUI.Component.MyLoaiSPComboBox myLoaiSPComboBox1;
    private GUI.SaleGroup.SellerGUI.Component.NhaCungCapComboBox nhaCungCapComboBox1;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
