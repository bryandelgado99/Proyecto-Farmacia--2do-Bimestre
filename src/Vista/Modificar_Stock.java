/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import java.sql.*;

import javax.swing.JOptionPane;



/**
 *
 * @author bryan
 */
public class Modificar_Stock extends javax.swing.JFrame {

    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";
    
    /**
     * Creates new form Modificar_Stock
     */
    public Modificar_Stock() {
        initComponents();
        this.setLocationRelativeTo(null);
        desTitle.setVisible(false);
        descriptLabel.setVisible(false);
        desTitle1.setVisible(false);
        stockLabel1.setVisible(false);
        titLabel.setVisible(false);
        newstockInput.setVisible(false);
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
        codprodInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        desTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modstockButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        descriptLabel = new javax.swing.JLabel();
        desTitle1 = new javax.swing.JLabel();
        stockLabel1 = new javax.swing.JLabel();
        titLabel = new javax.swing.JLabel();
        newstockInput = new javax.swing.JTextField();
        jButtonBuscarActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        codprodInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codprodInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codprodInputMouseClicked(evt);
            }
        });
        codprodInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codprodInputActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box-open-full.png"))); // NOI18N

        desTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        desTitle.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setText("Modificar Stock");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("Código del producto:");

        modstockButton.setBackground(new java.awt.Color(153, 255, 153));
        modstockButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modstockButton.setText("Modificar Stock");
        modstockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modstockButtonMouseClicked(evt);
            }
        });
        modstockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modstockButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 204, 204));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        descriptLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        descriptLabel.setText("----");

        desTitle1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        desTitle1.setText("Stock Actual:");

        stockLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stockLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stockLabel1.setText("----");

        titLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titLabel.setText("Nuevo Stock:");

        newstockInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonBuscarActualizar.setText("Buscar");
        jButtonBuscarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(desTitle)
                                .addGap(18, 18, 18)
                                .addComponent(descriptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(desTitle1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stockLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(modstockButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codprodInput, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarActualizar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(titLabel)
                .addGap(29, 29, 29)
                .addComponent(newstockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codprodInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarActualizar))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desTitle)
                    .addComponent(descriptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desTitle1)
                    .addComponent(stockLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titLabel)
                    .addComponent(newstockInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modstockButton)
                    .addComponent(cancelButton))
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codprodInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codprodInputMouseClicked
        desTitle.setVisible(true);
        descriptLabel.setVisible(true);
        desTitle1.setVisible(true);
        stockLabel1.setVisible(true);
        titLabel.setVisible(true);
        newstockInput.setVisible(true);
    }//GEN-LAST:event_codprodInputMouseClicked

    private void codprodInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprodInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codprodInputActionPerformed

    private void modstockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modstockButtonMouseClicked
        
        
    }//GEN-LAST:event_modstockButtonMouseClicked

    private void modstockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modstockButtonActionPerformed
        
        String cod = codprodInput.getText();
        String newstock = this.newstockInput.getText();
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "UPDATE `esfot-care`.`productos` SET `stock_prod` = ? WHERE `codigo_prod` = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newstock);
            stmt.setString(2, cod);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Producto actualizado.");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "No existe este producto, ingrese el código correcto.");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_modstockButtonActionPerformed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jButtonBuscarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActualizarActionPerformed
        // TODO add your handling code here:
        String cod = codprodInput.getText();
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
        String Query = "SELECT * FROM productos WHERE codigo_prod = ?";
        PreparedStatement stmt = conn.prepareStatement(Query);
        stmt.setString(1, cod);

        ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombreProd = rs.getString("nombre_prod");
                String stock = rs.getString("stock_prod");
                
                descriptLabel.setText(nombreProd);
                stockLabel1.setText(stock);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe este producto, ingrese el cosigo correcto.");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonBuscarActualizarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField codprodInput;
    private javax.swing.JLabel desTitle;
    private javax.swing.JLabel desTitle1;
    private javax.swing.JLabel descriptLabel;
    private javax.swing.JButton jButtonBuscarActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modstockButton;
    private javax.swing.JTextField newstockInput;
    private javax.swing.JLabel stockLabel1;
    private javax.swing.JLabel titLabel;
    // End of variables declaration//GEN-END:variables
}
