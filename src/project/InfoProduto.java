/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class InfoProduto extends javax.swing.JFrame {

    /**
     * Creates new form ProductInformation
     */
    static String seletorCategoria="";
    
    public InfoProduto() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        productImagem = new javax.swing.JLabel();
        productInfoBrand = new javax.swing.JLabel();
        productInfoBrand1 = new javax.swing.JLabel();
        productInfoBrand2 = new javax.swing.JLabel();
        productInfoBrand3 = new javax.swing.JLabel();
        productInfoBrand4 = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        productInfoMarca = new javax.swing.JLabel();
        productInfoModelo = new javax.swing.JLabel();
        productInfoPreco = new javax.swing.JLabel();
        productInfoEstoque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productInfoDescricao = new javax.swing.JTextArea();
        productInfoBrand5 = new javax.swing.JLabel();
        productQtyField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 25, 112));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informações do Produto");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Info_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        productImagem.setBackground(new java.awt.Color(255, 255, 255));
        productImagem.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        productImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));

        productInfoBrand.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        productInfoBrand.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand.setText("Marca :");
        productInfoBrand.setToolTipText("");

        productInfoBrand1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        productInfoBrand1.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand1.setText("Preço :");

        productInfoBrand2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        productInfoBrand2.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand2.setText("Em estoque :");

        productInfoBrand3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        productInfoBrand3.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand3.setText("Modelo :");

        productInfoBrand4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        productInfoBrand4.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand4.setText("Características do produto :");

        addToCart.setBackground(new java.awt.Color(25, 25, 112));
        addToCart.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Shopping_Cart_24px.png"))); // NOI18N
        addToCart.setText("Adicionar ao carrinho");
        addToCart.setBorder(null);
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        productInfoMarca.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        productInfoMarca.setForeground(new java.awt.Color(25, 25, 112));

        productInfoModelo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        productInfoModelo.setForeground(new java.awt.Color(25, 25, 112));

        productInfoPreco.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        productInfoPreco.setForeground(new java.awt.Color(25, 25, 112));

        productInfoEstoque.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        productInfoEstoque.setForeground(new java.awt.Color(25, 25, 112));

        productInfoDescricao.setEditable(false);
        productInfoDescricao.setColumns(20);
        productInfoDescricao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        productInfoDescricao.setLineWrap(true);
        productInfoDescricao.setRows(5);
        productInfoDescricao.setBorder(null);
        productInfoDescricao.setFocusable(false);
        productInfoDescricao.setRequestFocusEnabled(false);
        productInfoDescricao.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(productInfoDescricao);

        productInfoBrand5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        productInfoBrand5.setForeground(new java.awt.Color(25, 25, 112));
        productInfoBrand5.setText("Qtde :");
        productInfoBrand5.setToolTipText("");

        productQtyField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        productQtyField.setText("1");
        productQtyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        productQtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQtyFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(productInfoBrand)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(productInfoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(productInfoBrand1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productInfoBrand3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(productInfoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productInfoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(productInfoBrand2)
                        .addGap(18, 18, 18)
                        .addComponent(productInfoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productInfoBrand4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(productInfoBrand5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productInfoBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productInfoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productInfoBrand3)
                            .addComponent(productInfoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productInfoBrand1)
                            .addComponent(productInfoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productInfoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productInfoBrand2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(productInfoBrand4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(productImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productInfoBrand5)
                    .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1130, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked
    
    public static ArrayList<ProductList> itemCarrinho = new ArrayList();
    
    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        
        if(Integer.parseInt(this.productInfoEstoque.getText())<Integer.parseInt(this.productQtyField.getText())){
            JOptionPane.showMessageDialog(null, "Não temos este produto em estoque!");
        }
        else{
            int qty = Integer.parseInt(this.productQtyField.getText());
            ProductList p = new ProductList(this.productInfoMarca.getText(), this.productInfoModelo.getText(), qty*Integer.parseInt(this.productInfoPreco.getText()), 
                                                Integer.parseInt(this.productQtyField.getText()), null, null, null);
            itemCarrinho.add(p);
            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!");
   
            int qtyTester = Integer.parseInt(this.productInfoEstoque.getText())-Integer.parseInt(this.productQtyField.getText());
            
            if(seletorCategoria.equals("hidraulica"))
                    HidraulicaDAO.atualizarHidraulica(this.productInfoModelo.getText(), qtyTester);
            else if(seletorCategoria.equals("eletro"))
                    EletroDAO.atualizarEletro(this.productInfoModelo.getText(), qtyTester);
            else if(seletorCategoria.equals("iluminacao"))
                    IluminacaoDAO.atualizarIluminacao(this.productInfoModelo.getText(), qtyTester);
            
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void productQtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQtyFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel productImagem;
    private javax.swing.JLabel productInfoBrand;
    private javax.swing.JLabel productInfoBrand1;
    private javax.swing.JLabel productInfoBrand2;
    private javax.swing.JLabel productInfoBrand3;
    private javax.swing.JLabel productInfoBrand4;
    private javax.swing.JLabel productInfoBrand5;
    public javax.swing.JTextArea productInfoDescricao;
    public javax.swing.JLabel productInfoEstoque;
    public javax.swing.JLabel productInfoMarca;
    public javax.swing.JLabel productInfoModelo;
    public javax.swing.JLabel productInfoPreco;
    private javax.swing.JTextField productQtyField;
    // End of variables declaration//GEN-END:variables
}
