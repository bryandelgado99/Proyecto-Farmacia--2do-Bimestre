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
public class Eliminar_cajero extends javax.swing.JFrame {

    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";
    
    /**
     * Creates new form Cajero
     */
    public Eliminar_cajero() {
        initComponents();
        nomCajeroLabel.setVisible(false);
        cicajeroLabel.setVisible(false);
        jLabel2.setVisible(false);
        jLabel9.setVisible(false);
        this.setLocationRelativeTo(null);
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
        codCajero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eliminarcajeroButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nomCajeroLabel = new javax.swing.JLabel();
        cicajeroLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonBusqueda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        codCajero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codCajeroMouseClicked(evt);
            }
        });
        codCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCajeroActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setText("Eliminar Cajero");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("Código Asignado:");

        eliminarcajeroButton.setBackground(new java.awt.Color(255, 204, 255));
        eliminarcajeroButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarcajeroButton.setText("Eliminar Cajero");
        eliminarcajeroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarcajeroButtonMouseClicked(evt);
            }
        });
        eliminarcajeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcajeroButtonActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(255, 153, 153));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Cédula:");

        nomCajeroLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomCajeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cicajeroLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cicajeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("¿Desea elminar el siguiente empleado?");

        jButtonBusqueda.setText("Buscar");
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarcajeroButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel2)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomCajeroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(cicajeroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelarButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(codCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBusqueda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomCajeroLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cicajeroLabel))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarcajeroButton)
                    .addComponent(cancelarButton))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codCajeroMouseClicked
      nomCajeroLabel.setVisible(true);
      cicajeroLabel.setVisible(true);
      jLabel2.setVisible(true);
      jLabel9.setVisible(true);
    }//GEN-LAST:event_codCajeroMouseClicked

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void eliminarcajeroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcajeroButtonMouseClicked
       //
       String cod = codCajero.getText();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String DELETE_QUERY = "DELETE FROM cajeros WHERE codigo_caj = ?";

            conn.setAutoCommit(false);

            PreparedStatement deleteStmt = conn.prepareStatement(DELETE_QUERY);
            deleteStmt.setString(1, cod);

            int rowsAffected = deleteStmt.executeUpdate();

            if (rowsAffected > 0) {
                conn.commit();
                JOptionPane.showMessageDialog(null, "Cajero eliminado exitosamente");
                this.setVisible(false);
            } else {
                conn.rollback();
                JOptionPane.showMessageDialog(null, "Error al eliminar el cajero");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }

    }//GEN-LAST:event_eliminarcajeroButtonMouseClicked

    private void eliminarcajeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcajeroButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_eliminarcajeroButtonActionPerformed

    private void codCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codCajeroActionPerformed

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        // TODO add your handling code here:
        //Logica para mostrar el usuario que va a eliminar
        
        String cod = codCajero.getText();
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
        String Query = "SELECT * FROM cajeros WHERE codigo_caj = ?";
        PreparedStatement stmt = conn.prepareStatement(Query);
        stmt.setString(1, cod);

        ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre_caj");
                String apellido = rs.getString("apellido_caj");
                String ci = rs.getString("ci_caj");

                nomCajeroLabel.setText(nombre + " " + apellido);
                cicajeroLabel.setText(ci);
            } else {
                nomCajeroLabel.setText("Cajero no encontrado");
                cicajeroLabel.setText("");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel cicajeroLabel;
    private javax.swing.JTextField codCajero;
    private javax.swing.JButton eliminarcajeroButton;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomCajeroLabel;
    // End of variables declaration//GEN-END:variables
}
