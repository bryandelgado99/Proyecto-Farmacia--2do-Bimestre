/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComboBox;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryan
 */
public class Home_Cajero extends javax.swing.JFrame {

    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";

    /**
     * Creates new form Home_Cajero
     */
    public Home_Cajero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Gestión de Caja - ESFOT-Care+");
        String cod_caj = Vista.Login.getCod_caj();
        System.out.println("Código del cajero: " + cod_caj);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String Query = "SELECT * FROM cajeros WHERE codigo_caj = ?";
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setString(1, cod_caj);
            ResultSet rs = stmt.executeQuery();

            //prueba conexion
            if (rs.next()) {
                String nombre = rs.getString("nombre_caj");
                String apellido = rs.getString("apellido_caj");
                String cod = rs.getString("codigo_caj");

                cajeroName.setText(nombre + " " + apellido);
                cajeroCode.setText(cod);
            }
            num_factura();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        fechaEmi.setText(sdf.format(fecha));

    }

    private void num_factura() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String Query = "SELECT num_factura FROM cabecera_fac";
            PreparedStatement stmt = conn.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int numFac = rs.getInt("num_factura");
                String numFacString = Integer.toString(numFac);
                numFactLabel.setText(numFacString);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CajeroData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajeroName = new javax.swing.JLabel();
        cajeroCode = new javax.swing.JLabel();
        ClienteData = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cliMail = new javax.swing.JTextField();
        cliTelef = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        clienteDireccion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        numFactLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaEmi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        ivaLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellProdTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        anularventaButton = new javax.swing.JButton();
        finventaButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ProductBox = new javax.swing.JComboBox<>();
        cantidadField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CajeroData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del cajero/a:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Código de empleado:");

        cajeroName.setText("cajeroName");

        cajeroCode.setText("cajeroCode");

        javax.swing.GroupLayout CajeroDataLayout = new javax.swing.GroupLayout(CajeroData);
        CajeroData.setLayout(CajeroDataLayout);
        CajeroDataLayout.setHorizontalGroup(
            CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CajeroDataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CajeroDataLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cajeroName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CajeroDataLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cajeroCode, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        CajeroDataLayout.setVerticalGroup(
            CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CajeroDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CajeroDataLayout.createSequentialGroup()
                        .addGroup(CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cajeroName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CajeroDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajeroCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CajeroDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(10, Short.MAX_VALUE))))
        );

        getContentPane().add(CajeroData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 80));

        ClienteData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("CI/RUC:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nombre cliente:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("E-Mail:");

        jTextField1.setText("17xxxxxxx");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("cliName");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        cliMail.setText("xxx@xxxx");
        cliMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliMailActionPerformed(evt);
            }
        });

        cliTelef.setText("099xxxx");
        cliTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliTelefActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Dirección:");

        javax.swing.GroupLayout ClienteDataLayout = new javax.swing.GroupLayout(ClienteData);
        ClienteData.setLayout(ClienteDataLayout);
        ClienteDataLayout.setHorizontalGroup(
            ClienteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ClienteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ClienteDataLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliMail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClienteDataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteDireccion)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ClienteDataLayout.setVerticalGroup(
            ClienteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(clienteDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(ClienteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cliTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(ClienteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 680, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sign-out-alt.png"))); // NOI18N
        logoutButton.setText("Cerrar Sesion");
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusPainted(false);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        numFactLabel.setText("codVenta");
        numFactLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                numFactLabelComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Num. Fact.:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha:");

        fechaEmi.setText("dd/mm/aa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(fechaEmi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numFactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(numFactLabel))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(fechaEmi))
            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Subtotal:");

        jLabel12.setText("IVA (12%):");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Total a pagar:");

        subtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotalLabel.setText("-------");

        ivaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ivaLabel.setText("-------");

        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalLabel.setText("--------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(subtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ivaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(subtotalLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ivaLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(totalLabel))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 360, 110));

        sellProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Producto", "Nombre del producto", "Categoria Producto", "Cantidad", "Valor Unitario", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellProdTable);
        if (sellProdTable.getColumnModel().getColumnCount() > 0) {
            sellProdTable.getColumnModel().getColumn(0).setResizable(false);
            sellProdTable.getColumnModel().getColumn(2).setResizable(false);
            sellProdTable.getColumnModel().getColumn(3).setResizable(false);
            sellProdTable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1080, 260));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 270, 110));

        anularventaButton.setBackground(new java.awt.Color(255, 153, 153));
        anularventaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        anularventaButton.setText("Anular Venta");
        anularventaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anularventaButtonMouseClicked(evt);
            }
        });
        anularventaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularventaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anularventaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 130, 40));

        finventaButton.setBackground(new java.awt.Color(204, 255, 204));
        finventaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finventaButton.setText("Finalizar Venta");
        finventaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finventaButtonMouseClicked(evt);
            }
        });
        finventaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finventaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(finventaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 130, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Ingresar cantidad:");

        ProductBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------------" }));
        ProductBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductBoxActionPerformed(evt);
            }
        });

        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Seleccione el producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(35, 35, 35)
                .addComponent(ProductBox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ProductBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel15))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1080, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/radiant-gradient.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void numFactLabelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_numFactLabelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_numFactLabelComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cliTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliTelefActionPerformed

    private void cliMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliMailActionPerformed

    private void anularventaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularventaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anularventaButtonActionPerformed

    private void finventaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finventaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finventaButtonActionPerformed

    private void anularventaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anularventaButtonMouseClicked
        Cancelar_venta window = new Cancelar_venta();
        window.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_anularventaButtonMouseClicked

    private void finventaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finventaButtonMouseClicked
        Metodo_pago metodo = new Metodo_pago();
        metodo.setVisible(true);
    }//GEN-LAST:event_finventaButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void cantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFieldActionPerformed

    }//GEN-LAST:event_cantidadFieldActionPerformed

    private void ProductBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductBoxActionPerformed
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String query = "SELECT nombre_prod FROM productos";

            List<String> nombresProductos = new ArrayList<>();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                nombresProductos.add(resultSet.getString("nombre_prod"));
            }

            JComboBox<String> productBox = ProductBox;
            for (String nombreProducto : nombresProductos) {
                productBox.addItem(nombreProducto);
            }

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_ProductBoxActionPerformed

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
        if (!"".equals(cantidadField.getText())) {
            String producto = (String) ProductBox.getSelectedItem();
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

                String query = "SELECT * FROM productos WHERE nombre_prod = ?";

                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, producto);
                ResultSet resultSet = preparedStatement.executeQuery();
                DefaultTableModel model = (DefaultTableModel) sellProdTable.getModel();
                int rowCount = model.getRowCount();
                int currentRow = rowCount;

                boolean isDuplicate = false;

                for (int i = 0; i < rowCount; i++) {
                    String nombreExistente = (String) model.getValueAt(i, 1);
                    if (nombreExistente.equals(producto)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    while (resultSet.next()) {
                        model.addRow(new Object[7]);

                        String codigo = resultSet.getString("codigo_prod");
                        String nombre = resultSet.getString("nombre_prod");
                        String categoria = resultSet.getString("categoria_prod");
                        String cantidad = cantidadField.getText();
                        int cantidadInt = Integer.parseInt(cantidad);
                        int stock = Integer.parseInt(resultSet.getString("stock_prod"));
                        double valorU = Double.parseDouble(resultSet.getString("valventa_prod"));
                        double valorT = valorU * cantidadInt;

                        if (stock >= cantidadInt) {
                            sellProdTable.setValueAt(codigo, currentRow, 0);
                            sellProdTable.setValueAt(nombre, currentRow, 1);
                            sellProdTable.setValueAt(categoria, currentRow, 2);
                            sellProdTable.setValueAt(cantidadInt, currentRow, 3);
                            sellProdTable.setValueAt(valorU, currentRow, 4);
                            sellProdTable.setValueAt(valorT, currentRow, 5);

                            currentRow++;
                            cantidadField.setText("");
                            ProductBox.setSelectedIndex(0);

                            double total = 0.0;
                            double iva = 0.12;
                            for (int i = 0; i < model.getRowCount(); i++) {
                                double valorTotalFila = (double) model.getValueAt(i, 5); // Valor de la columna valorT
                                total += valorTotalFila;
                            }
                            String formattedSubTotal = String.format("%.2f", total);
                            String formattedIva = String.format("%.2f", iva);
                            double TotalT = (total * iva) + total;
                            String formattedTotalT = String.format("%.2f", TotalT);
                            subtotalLabel.setText(formattedSubTotal);
                            ivaLabel.setText(formattedIva);
                            totalLabel.setText(formattedTotalT);
                        } else {
                            JOptionPane.showMessageDialog(null, "Stock no disponible");
                            cantidadField.setText("");
                            model.removeRow(currentRow);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Producto ya ha sido agregado");
                }

                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad");
        }
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void Totalpagar() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CajeroData;
    private javax.swing.JPanel ClienteData;
    private javax.swing.JComboBox<String> ProductBox;
    private javax.swing.JButton anularventaButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cajeroCode;
    private javax.swing.JLabel cajeroName;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JTextField cliMail;
    private javax.swing.JTextField cliTelef;
    private javax.swing.JTextField clienteDireccion;
    private javax.swing.JLabel fechaEmi;
    private javax.swing.JButton finventaButton;
    private javax.swing.JLabel ivaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel numFactLabel;
    private javax.swing.JTable sellProdTable;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    private String StringValueof(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
