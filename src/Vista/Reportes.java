/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import java.sql.*;
/**
 *
 * @author bryan
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";

    
    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Reportes de Venta | Gestion Administrativa de ESFOT-Care+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajeroTable = new javax.swing.JTable();
        fechaBusInput = new javax.swing.JTextField();
        jButtonBuscarCajeroCod = new javax.swing.JButton();
        reporteCajeroBtn = new javax.swing.JButton();
        reporteGeneralBtn = new javax.swing.JButton();
        jButtonDesplegarCajeros = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        codfactInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        empleadosMenu = new javax.swing.JMenu();
        inventarioMenu = new javax.swing.JMenu();
        reportesMenu = new javax.swing.JMenu();
        reporteVentaField = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Buscar por fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cajeroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num Fact.", "Nombre del Cajero", "Cod. Cajero", "Fecha Emi.", "CI Cliente", "Total Vendido", "Ganancias obtenidas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cajeroTable);
        if (cajeroTable.getColumnModel().getColumnCount() > 0) {
            cajeroTable.getColumnModel().getColumn(0).setResizable(false);
            cajeroTable.getColumnModel().getColumn(1).setResizable(false);
            cajeroTable.getColumnModel().getColumn(2).setResizable(false);
            cajeroTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 1130, 390));

        fechaBusInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fechaBusInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaBusInputActionPerformed(evt);
            }
        });
        getContentPane().add(fechaBusInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 30));

        jButtonBuscarCajeroCod.setText("Buscar");
        jButtonBuscarCajeroCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCajeroCodActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCajeroCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 90, 30));

        reporteCajeroBtn.setBackground(new java.awt.Color(204, 255, 204));
        reporteCajeroBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reporteCajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-alt.png"))); // NOI18N
        reporteCajeroBtn.setText("   Generar reporte por cajero");
        reporteCajeroBtn.setActionCommand("  Agregar Producto");
        reporteCajeroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCajeroBtnMouseClicked(evt);
            }
        });
        reporteCajeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteCajeroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reporteCajeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 270, -1));

        reporteGeneralBtn.setBackground(new java.awt.Color(255, 153, 153));
        reporteGeneralBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reporteGeneralBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report_1.png"))); // NOI18N
        reporteGeneralBtn.setText("   Generar reporte general de ventas");
        reporteGeneralBtn.setActionCommand("  Agregar Producto");
        reporteGeneralBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteGeneralBtnMouseClicked(evt);
            }
        });
        reporteGeneralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteGeneralBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reporteGeneralBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 310, -1));

        jButtonDesplegarCajeros.setText("Desplegar todo");
        jButtonDesplegarCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesplegarCajerosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesplegarCajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Buscar por código de factura:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        codfactInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codfactInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codfactInputActionPerformed(evt);
            }
        });
        getContentPane().add(codfactInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setText("Reportes de Ventas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/radiant-gradient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1200, 680));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        homeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        homeMenu.setText("Inicio");
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homeMenu);

        empleadosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-alt.png"))); // NOI18N
        empleadosMenu.setText("Empleados");
        empleadosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(empleadosMenu);

        inventarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box-open-full.png"))); // NOI18N
        inventarioMenu.setText("Inventario");
        inventarioMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioMenuMouseClicked(evt);
            }
        });
        inventarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(inventarioMenu);

        reportesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        reportesMenu.setText("Reportes");

        reporteVentaField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report_2.png"))); // NOI18N
        reporteVentaField.setText("Reporte de Venta");
        reporteVentaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVentaFieldActionPerformed(evt);
            }
        });
        reportesMenu.add(reporteVentaField);
        reportesMenu.add(jSeparator1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file.png"))); // NOI18N
        jMenuItem3.setText("Reporte de Stock");
        reportesMenu.add(jMenuItem3);

        jMenuBar1.add(reportesMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sign-out-alt.png"))); // NOI18N
        jMenu1.setText("Cerrar Sesión");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        this.setVisible(false);
        Home_Admin homin = new Home_Admin();
        homin.setVisible(true);
    }//GEN-LAST:event_homeMenuMouseClicked

    private void empleadosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMenuMouseClicked

    }//GEN-LAST:event_empleadosMenuMouseClicked

    private void inventarioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMenuMouseClicked
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventarioMenuMouseClicked

    private void inventarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioMenuActionPerformed

    }//GEN-LAST:event_inventarioMenuActionPerformed

    private void reporteVentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteVentaFieldActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void fechaBusInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaBusInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaBusInputActionPerformed

    private void jButtonBuscarCajeroCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCajeroCodActionPerformed
        // TODO add your handling code here:
        String codigoinput = fechaBusInput.getText();

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM cajeros WHERE codigo_caj = ?";
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setString(1, codigoinput);
            ResultSet rs = stmt.executeQuery();

            cajeroTable.getModel();

            //Logica para busqueda
            int row = 0;

            if (rs.next()) {

                /*
                int rowc = 1;
                while(rowc > 10 ){
                    cajeroTable.setValueAt("", rowc, 0);
                    cajeroTable.setValueAt("", rowc, 1);
                    cajeroTable.setValueAt("", rowc, 2);
                    cajeroTable.setValueAt("", rowc, 3);
                    cajeroTable.setValueAt("", rowc, 4);
                    rowc++;
                }
                */

                int rowCount = cajeroTable.getRowCount();
                for (int i = 1; i < rowCount; i++) {
                    for (int j = 0; j < 5; j++) {
                        cajeroTable.setValueAt("", i, j);
                    }
                }

                String codigo = rs.getString("codigo_caj");
                String nombre = rs.getString("nombre_caj");
                String apellido = rs.getString("apellido_caj");
                String ci = rs.getString("ci_caj");
                String telefono = rs.getString("telefono_caj");
                String email = rs.getString("email_caj");
                String direccion = rs.getString("direccion_caj");
                String password = rs.getString("password_caj");
                String codigoAdmin = rs.getString("Administradores_codigo_admin");

                cajeroTable.setValueAt(codigo, row, 0);
                cajeroTable.setValueAt(nombre + " " + apellido, row, 1);
                cajeroTable.setValueAt(ci, row, 2);
                cajeroTable.setValueAt(telefono, row, 3);
                cajeroTable.setValueAt(direccion, row, 4);

                //prueba de conexion
                System.out.println("Código: " + codigo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("CI: " + ci);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Email: " + email);
                System.out.println("Dirección: " + direccion);
                System.out.println("Password: " + password);
                System.out.println("Código de Admin: " + codigoAdmin);
                System.out.println("----------");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonBuscarCajeroCodActionPerformed

    private void jButtonDesplegarCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesplegarCajerosActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM cajeros";
            PreparedStatement stmt = conn.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();

            cajeroTable.getModel();

            int row = 0;

            //prueba conexion
            while (rs.next()) {

                cajeroTable.setValueAt("", row, 0);
                cajeroTable.setValueAt("", row, 1);
                cajeroTable.setValueAt("", row, 2);
                cajeroTable.setValueAt("", row, 3);
                cajeroTable.setValueAt("", row, 4);

                String codigo = rs.getString("codigo_caj");
                String nombre = rs.getString("nombre_caj");
                String apellido = rs.getString("apellido_caj");
                String ci = rs.getString("ci_caj");
                String telefono = rs.getString("telefono_caj");
                String email = rs.getString("email_caj");
                String direccion = rs.getString("direccion_caj");
                String password = rs.getString("password_caj");
                String codigoAdmin = rs.getString("Administradores_codigo_admin");

                cajeroTable.setValueAt(codigo, row, 0);
                cajeroTable.setValueAt(nombre + " " + apellido, row, 1);
                cajeroTable.setValueAt(ci, row, 2);
                cajeroTable.setValueAt(telefono, row, 3);
                cajeroTable.setValueAt(direccion, row, 4);

                row++;

                //prueba de conexion
                System.out.println("Código: " + codigo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("CI: " + ci);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Email: " + email);
                System.out.println("Dirección: " + direccion);
                System.out.println("Password: " + password);
                System.out.println("Código de Admin: " + codigoAdmin);
                System.out.println("----------");
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonDesplegarCajerosActionPerformed

    private void codfactInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codfactInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codfactInputActionPerformed

    private void reporteCajeroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCajeroBtnMouseClicked
        
    }//GEN-LAST:event_reporteCajeroBtnMouseClicked

    private void reporteCajeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteCajeroBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteCajeroBtnActionPerformed

    private void reporteGeneralBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteGeneralBtnMouseClicked
        
    }//GEN-LAST:event_reporteGeneralBtnMouseClicked

    private void reporteGeneralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteGeneralBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteGeneralBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cajeroTable;
    private javax.swing.JTextField codfactInput;
    private javax.swing.JMenu empleadosMenu;
    private javax.swing.JTextField fechaBusInput;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JMenu inventarioMenu;
    private javax.swing.JButton jButtonBuscarCajeroCod;
    private javax.swing.JButton jButtonDesplegarCajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton reporteCajeroBtn;
    private javax.swing.JButton reporteGeneralBtn;
    private javax.swing.JMenuItem reporteVentaField;
    private javax.swing.JMenu reportesMenu;
    // End of variables declaration//GEN-END:variables
}
