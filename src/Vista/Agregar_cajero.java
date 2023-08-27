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
public class Agregar_cajero extends javax.swing.JFrame {
    
    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";

    /**
     * Creates new form Agregar_cajero
     */
    public Agregar_cajero() {
        initComponents();
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

        agregarcajeroButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codCajero = new javax.swing.JTextField();
        ccCajeroInput = new javax.swing.JTextField();
        telefonoCajero = new javax.swing.JTextField();
        nomcajeroInput = new javax.swing.JTextField();
        dirCajero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        emailCajero1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordCajero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        apellidoInputCaj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarcajeroButton.setBackground(new java.awt.Color(255, 255, 255));
        agregarcajeroButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setText("Nuevo Cajero");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("Código Asignado:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel9.setText("Cédula:");

        codCajero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCajeroActionPerformed(evt);
            }
        });

        ccCajeroInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ccCajeroInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccCajeroInputActionPerformed(evt);
            }
        });

        telefonoCajero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        telefonoCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoCajeroActionPerformed(evt);
            }
        });

        nomcajeroInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dirCajero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dirCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirCajeroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Agregar Cajero");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setText("Dirección:");

        emailCajero1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        emailCajero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCajero1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel10.setText("Password:");

        passwordCajero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        passwordCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCajeroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel11.setText("Apellido");

        apellidoInputCaj.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        apellidoInputCaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoInputCajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarcajeroButtonLayout = new javax.swing.GroupLayout(agregarcajeroButton);
        agregarcajeroButton.setLayout(agregarcajeroButtonLayout);
        agregarcajeroButtonLayout.setHorizontalGroup(
            agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(codCajero))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, agregarcajeroButtonLayout.createSequentialGroup()
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(emailCajero1)
                            .addComponent(telefonoCajero)
                            .addComponent(dirCajero)
                            .addComponent(nomcajeroInput)
                            .addComponent(apellidoInputCaj)
                            .addComponent(ccCajeroInput, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(30, 30, 30))
            .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(100, 100, 100)
                .addComponent(cancelarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarcajeroButtonLayout.setVerticalGroup(
            agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(codCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarcajeroButtonLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(31, 31, 31)
                .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomcajeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(apellidoInputCaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ccCajeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(telefonoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(dirCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailCajero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(agregarcajeroButtonLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(passwordCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(agregarcajeroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(cancelarButton))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarcajeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarcajeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codCajeroActionPerformed

    private void ccCajeroInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccCajeroInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccCajeroInputActionPerformed

    private void telefonoCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCajeroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //logica agregacion de usuario
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String INSERT_PROVIDER_QUERY = "INSERT INTO cajeros "
                    + "(codigo_caj, nombre_caj, apellido_caj, ci_caj, telefono_caj, email_caj, direccion_caj"
                    + ", password_caj, Administradores_codigo_admin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            conn.setAutoCommit(false);

            String codigo = codCajero.getText();
            String nombre = nomcajeroInput.getText();
            String apellido = apellidoInputCaj.getText();
            String ci = ccCajeroInput.getText();
            String telefono = telefonoCajero.getText();
            String email = emailCajero1.getText();
            String direccion = dirCajero.getText();
            String password = passwordCajero.getText();

            PreparedStatement insertProviderStmt = conn.prepareStatement(INSERT_PROVIDER_QUERY, Statement.RETURN_GENERATED_KEYS);
            insertProviderStmt.setString(1, codigo);
            insertProviderStmt.setString(2, nombre);
            insertProviderStmt.setString(3, apellido);
            insertProviderStmt.setString(4, ci);
            insertProviderStmt.setString(5, telefono);
            insertProviderStmt.setString(6, email);
            insertProviderStmt.setString(7, direccion);
            insertProviderStmt.setString(8, password);
            insertProviderStmt.setString(9, "L4X315");

            int rowsAffected = insertProviderStmt.executeUpdate();

            if (rowsAffected > 0) {
                conn.commit();
                JOptionPane.showMessageDialog(null, "Cajero añadido exitosamente");
                this.setVisible(false);
            } else {
                conn.rollback();
                JOptionPane.showMessageDialog(null, "Error al agregar el cajero");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.setVisible(false);        
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void dirCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirCajeroActionPerformed

    private void emailCajero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCajero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCajero1ActionPerformed

    private void passwordCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordCajeroActionPerformed

    private void apellidoInputCajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoInputCajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoInputCajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarcajeroButton;
    private javax.swing.JTextField apellidoInputCaj;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField ccCajeroInput;
    private javax.swing.JTextField codCajero;
    private javax.swing.JTextField dirCajero;
    private javax.swing.JTextField emailCajero1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomcajeroInput;
    private javax.swing.JTextField passwordCajero;
    private javax.swing.JTextField telefonoCajero;
    // End of variables declaration//GEN-END:variables
}
