/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

// importacion libreria para sql
import java.sql.*;

/**
 *
 * @author bryan
 */
public class Lista_Empleado extends javax.swing.JFrame {
    
    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "edu1751395623";

    /**
     * Creates new form Lista_Empleado
     */
    public Lista_Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Lista de Empleados | Gestion Administrativa de ESFOT-Care+");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajerocodInput = new javax.swing.JTextField();
        jButtonBuscarCajero = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajeroTable = new javax.swing.JTable();
        agregarCajero = new javax.swing.JButton();
        eliminarCajero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        empleadosMenu = new javax.swing.JMenu();
        inventarioMenu = new javax.swing.JMenu();
        reportesMenu = new javax.swing.JMenu();
        reporteStock = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-alt.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setText("Lista de Empleados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Buscar por Código de cajero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cajerocodInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajerocodInput.setText("----");
        cajerocodInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajerocodInputActionPerformed(evt);
            }
        });
        getContentPane().add(cajerocodInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 240, 30));

        jButtonBuscarCajero.setText("Buscar");
        jButtonBuscarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCajeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        cajeroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Códifo Cajero", "Nombre Completo", "Cédula", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cajeroTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1140, 410));

        agregarCajero.setBackground(new java.awt.Color(204, 255, 204));
        agregarCajero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarCajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layer-plus.png"))); // NOI18N
        agregarCajero.setText("   Agregar Cajero");
        agregarCajero.setActionCommand("  Agregar Producto");
        agregarCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarCajeroMouseClicked(evt);
            }
        });
        agregarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCajeroActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 200, -1));

        eliminarCajero.setBackground(new java.awt.Color(255, 153, 153));
        eliminarCajero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarCajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layer-minus.png"))); // NOI18N
        eliminarCajero.setText("Eliminar Cajero");
        eliminarCajero.setActionCommand("  Agregar Producto");
        eliminarCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarCajeroMouseClicked(evt);
            }
        });
        eliminarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCajeroActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/radiant-gradient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1200, 720));

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

        reporteStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report_2.png"))); // NOI18N
        reporteStock.setText("Reporte de Venta");
        reporteStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteStockActionPerformed(evt);
            }
        });
        reportesMenu.add(reporteStock);
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

    private void inventarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioMenuActionPerformed

    }//GEN-LAST:event_inventarioMenuActionPerformed

    private void reporteStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteStockActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cajerocodInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajerocodInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajerocodInputActionPerformed

    private void agregarCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarCajeroMouseClicked
        Agregar_cajero agcaj = new Agregar_cajero();
        agcaj.setVisible(true);
    }//GEN-LAST:event_agregarCajeroMouseClicked

    private void agregarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarCajeroActionPerformed

    private void eliminarCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarCajeroMouseClicked
        Eliminar_cajero elimcaj = new Eliminar_cajero();
        elimcaj.setVisible(true);
    }//GEN-LAST:event_eliminarCajeroMouseClicked

    private void eliminarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarCajeroActionPerformed

    private void empleadosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMenuMouseClicked
        
    }//GEN-LAST:event_empleadosMenuMouseClicked

    private void inventarioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMenuMouseClicked
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventarioMenuMouseClicked

    private void jButtonBuscarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCajeroActionPerformed
        // TODO add your handling code here:
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM cajeros";
            PreparedStatement stmt = conn.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();
            
            //prueba conexion
            while (rs.next()) {
            String codigo = rs.getString("codigo_caj");
            String nombre = rs.getString("nombre_caj");
            String apellido = rs.getString("apellido_caj");
            String ci = rs.getString("ci_caj");
            String telefono = rs.getString("telefono_caj");
            String email = rs.getString("email_caj");
            String direccion = rs.getString("direccion_caj");
            String password = rs.getString("password_caj");
            String codigoAdmin = rs.getString("Administradores_codigo_admin");

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
    }//GEN-LAST:event_jButtonBuscarCajeroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCajero;
    private javax.swing.JTable cajeroTable;
    private javax.swing.JTextField cajerocodInput;
    private javax.swing.JButton eliminarCajero;
    private javax.swing.JMenu empleadosMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JMenu inventarioMenu;
    private javax.swing.JButton jButtonBuscarCajero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem reporteStock;
    private javax.swing.JMenu reportesMenu;
    // End of variables declaration//GEN-END:variables
}
