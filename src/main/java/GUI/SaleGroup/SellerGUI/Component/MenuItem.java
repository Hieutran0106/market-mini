
package GUI.SaleGroup.SellerGUI.Component;

import BUS.SaleServices.Money;
import DTO.SanPham;
import javax.swing.JButton;

public class MenuItem extends RoundPanel{
    private SanPham sp;

    public MenuItem() {
        initComponents();
    }
    
    public MenuItem(SanPham sp){
        this.sp = sp;
        initComponents();
        setGuiText(this.sp);
        
    }
    
    private void setGuiText(SanPham sanpham){
        this.productName.setText("<html>"+sanpham.getTenSP());
        this.lbPrice.setText(Money.format(sanpham.getGiaTien()));
        this.productImage.setImagePath(sanpham.getHinhAnh());
        this.productImage.setToolTipText("<html><p width=\"300\">"+sanpham.getMoTa()+"</p></html>");
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
        setGuiText(this.sp);
    }

    public int getMaSP() {
        return sp.getMaSP();
    }
    
    public JButton getButtonAdd(){
        return btnAdd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new GUI.SaleGroup.SellerGUI.Component.ImagePanel();
        productImage = new GUI.SaleGroup.SellerGUI.Component.ImagePanel();
        productName = new javax.swing.JLabel();
        lbTextGiaTien = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lbPrice = new javax.swing.JLabel();

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(205, 108));

        productImage.setBackground(new java.awt.Color(255, 255, 255));
        productImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/Assets/Image/mitrontrungxucxich.png"))); // NOI18N

        javax.swing.GroupLayout productImageLayout = new javax.swing.GroupLayout(productImage);
        productImage.setLayout(productImageLayout);
        productImageLayout.setHorizontalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        productImageLayout.setVerticalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        productName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productName.setForeground(new java.awt.Color(29, 186, 218));
        productName.setText("<html>Nước ngọt cocacola 500ml + ly đá");

        lbTextGiaTien.setForeground(new java.awt.Color(29, 186, 218));
        lbTextGiaTien.setText("Giá tiền:");

        btnAdd.setBackground(new java.awt.Color(29, 186, 218));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.setBorder(null);

        lbPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(29, 186, 218));
        lbPrice.setText("12.000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTextGiaTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrice))
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTextGiaTien)
                    .addComponent(lbPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private GUI.SaleGroup.SellerGUI.Component.ImagePanel imagePanel1;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbTextGiaTien;
    private GUI.SaleGroup.SellerGUI.Component.ImagePanel productImage;
    private javax.swing.JLabel productName;
    // End of variables declaration//GEN-END:variables

}
