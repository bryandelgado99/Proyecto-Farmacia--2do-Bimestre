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
public class Home_Admin extends javax.swing.JFrame {

    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";
    
    /**
     * Creates new form Home_Admin
     */
    public Home_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Home | Gestion Administrativa de ESFOT-Care+");
        
        
        
        // Llama al método getCodAdm para obtener el código del administrador
        String codigoAdmin = Vista.Login.getCod_adm();
        System.out.println("Código del administrador: " + codigoAdmin);
            
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM administradores WHERE codigo_admin = ?";
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setString(1, codigoAdmin);
            ResultSet rs = stmt.executeQuery();
            
            
            //prueba conexion
            if (rs.next()) {
                String nombre = rs.getString("nombre_admin");
                String apellido = rs.getString("apellido_admin");
                String ci = rs.getString("ci_admin");
                
                jLabelNombreAdmin.setText("Nombre completo: " + nombre + " " +  apellido);
                jLabelCiAdmin.setText("CI: " + ci);
            }
            
            //logica para poder mostrar la tabla de notificaciones
            String QueryNoti = "SELECT * FROM Productos WHERE stock_prod <= 6";
            PreparedStatement stmtNoti = conn.prepareStatement(QueryNoti);
            ResultSet rsNoti = stmtNoti.executeQuery();
            int row = 0;
            notifTable.getModel();
            while (rsNoti.next()){
                String codigo = rsNoti.getString("codigo_prod");
                String nombre = rsNoti.getString("nombre_prod");
                String gramaje = rsNoti.getString("gramaje_prod");
                String presentacion = rsNoti.getString("presentacion_prod");
                String categoria = rsNoti.getString("categoria_prod");
                int stock = rsNoti.getInt("stock_prod");
                
                notifTable.setValueAt(codigo, row, 0);
                notifTable.setValueAt(nombre + " " + gramaje + " " + presentacion + " " + categoria, row, 1);
                notifTable.setValueAt("#Stock: " + stock + " | Stock bajo", row, 2);
                
                row++;
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
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

        notifPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notifTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mensajeUsuario = new javax.swing.JLabel();
        jLabelNombreAdmin = new javax.swing.JLabel();
        jLabelCiAdmin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreAdmin1 = new javax.swing.JLabel();
        jLabelNombreAdmin2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        empleadosMenu = new javax.swing.JMenu();
        inventarioMenu = new javax.swing.JMenu();
        reportesMenu = new javax.swing.JMenu();
        reporteStock = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        logoutButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notifPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Alertas y Notificaciones ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        notifTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod. Prod.", "Descripción", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(notifTable);
        if (notifTable.getColumnModel().getColumnCount() > 0) {
            notifTable.getColumnModel().getColumn(0).setMaxWidth(80);
            notifTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout notifPanelLayout = new javax.swing.GroupLayout(notifPanel);
        notifPanel.setLayout(notifPanelLayout);
        notifPanelLayout.setHorizontalGroup(
            notifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        notifPanelLayout.setVerticalGroup(
            notifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(notifPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 560, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 260, 290));

        mensajeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mensajeUsuario.setText("Bievenido, AdminJava...!");
        getContentPane().add(mensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 40));

        jLabelNombreAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombreAdmin.setText("Nombre completo:");
        getContentPane().add(jLabelNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabelCiAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCiAdmin.setText("CI:");
        getContentPane().add(jLabelCiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/radiant-gradient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        jLabelNombreAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreAdmin1.setText("-----");
        getContentPane().add(jLabelNombreAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 100, -1));

        jLabelNombreAdmin2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreAdmin2.setText("-----");
        getContentPane().add(jLabelNombreAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 100, -1));

        homeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        homeMenu.setText("Inicio");
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

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sign-out-alt.png"))); // NOI18N
        logoutButton.setText("Cerrar Sesión");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutButton);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reporteStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteStockActionPerformed

    private void inventarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioMenuActionPerformed
        
    }//GEN-LAST:event_inventarioMenuActionPerformed

    private void inventarioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMenuMouseClicked
       Inventario inventario = new Inventario();
       this.setVisible(false);
       inventario.setVisible(true);
    }//GEN-LAST:event_inventarioMenuMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
       this.setVisible(false);
       Login login = new Login();
       login.setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void empleadosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMenuMouseClicked
        Lista_Empleado lista = new Lista_Empleado();
        lista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empleadosMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu empleadosMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JMenu inventarioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCiAdmin;
    private javax.swing.JLabel jLabelNombreAdmin;
    private javax.swing.JLabel jLabelNombreAdmin1;
    private javax.swing.JLabel jLabelNombreAdmin2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JLabel mensajeUsuario;
    private javax.swing.JPanel notifPanel;
    private javax.swing.JTable notifTable;
    private javax.swing.JMenuItem reporteStock;
    private javax.swing.JMenu reportesMenu;
    // End of variables declaration//GEN-END:variables
}
