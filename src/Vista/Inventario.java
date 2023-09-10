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
public class Inventario extends javax.swing.JFrame {

    //variables para mysql
    public static final String DB_URL = "jdbc:mysql://localhost/esfot-care";
    public static final String USER = "root";
    public static final String PASSWORD = "root2023";
    
    /**
     * Creates new form Inventario
     */
    
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario | Gestion Administrativa de ESFOT-Care+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jButtonDesplegarpProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quitarProducto1 = new javax.swing.JButton();
        jButtonBuscarProdCod = new javax.swing.JButton();
        buscarProdInput = new javax.swing.JTextField();
        quitarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        agregarProducto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        empleadosMenu = new javax.swing.JMenu();
        inventarioMenu = new javax.swing.JMenu();
        reportesMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jButtonDesplegarpProducto.setText("Desplegar todo");
        jButtonDesplegarpProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesplegarpProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesplegarpProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box-open-full.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Inventario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Buscar por Código de producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        quitarProducto1.setBackground(new java.awt.Color(204, 255, 255));
        quitarProducto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quitarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse-alt.png"))); // NOI18N
        quitarProducto1.setText(" Modificar Stock");
        quitarProducto1.setActionCommand("  Agregar Producto");
        quitarProducto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitarProducto1MouseClicked(evt);
            }
        });
        quitarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarProducto1ActionPerformed(evt);
            }
        });
        getContentPane().add(quitarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 200, -1));

        jButtonBuscarProdCod.setText("Buscar");
        jButtonBuscarProdCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProdCodActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarProdCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        buscarProdInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buscarProdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdInputActionPerformed(evt);
            }
        });
        getContentPane().add(buscarProdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 240, 30));

        quitarProducto.setBackground(new java.awt.Color(255, 153, 153));
        quitarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quitarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layer-minus.png"))); // NOI18N
        quitarProducto.setText("  Eliminar Producto");
        quitarProducto.setActionCommand("  Agregar Producto");
        quitarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitarProductoMouseClicked(evt);
            }
        });
        quitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(quitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 200, -1));

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Producto", "Nom. Producto", "Gramaje", "Presentacion", "Categoria", "Stock", "Valor de Compra", "Valor de Venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1140, 410));

        agregarProducto1.setBackground(new java.awt.Color(204, 255, 204));
        agregarProducto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layer-plus.png"))); // NOI18N
        agregarProducto1.setText("   Agregar Producto");
        agregarProducto1.setActionCommand("  Agregar Producto");
        agregarProducto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProducto1MouseClicked(evt);
            }
        });
        agregarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProducto1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 200, -1));

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
        inventarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(inventarioMenu);

        reportesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        reportesMenu.setText("Reportes");
        reportesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesMenuMouseClicked(evt);
            }
        });
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

    private void inventarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioMenuActionPerformed

    }//GEN-LAST:event_inventarioMenuActionPerformed

    private void buscarProdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarProdInputActionPerformed

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        this.setVisible(false);
        Home_Admin homin = new Home_Admin();
        homin.setVisible(true);
    }//GEN-LAST:event_homeMenuMouseClicked

    private void quitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitarProductoActionPerformed

    private void agregarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarProducto1ActionPerformed

    private void quitarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitarProducto1ActionPerformed

    private void agregarProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProducto1MouseClicked
       Agregar_producto agprod = new Agregar_producto();
       agprod.setVisible(true);
    }//GEN-LAST:event_agregarProducto1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void quitarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarProductoMouseClicked
       Eliminar_producto deleteprod = new Eliminar_producto();
       deleteprod.setVisible(true);
    }//GEN-LAST:event_quitarProductoMouseClicked

    private void quitarProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarProducto1MouseClicked
        Modificar_Stock modify = new Modificar_Stock();
        modify.setVisible(true);
    }//GEN-LAST:event_quitarProducto1MouseClicked

    private void empleadosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMenuMouseClicked
    Lista_Empleado lista = new Lista_Empleado();
    lista.setVisible(true);
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_empleadosMenuMouseClicked

    private void jButtonDesplegarpProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesplegarpProductoActionPerformed
        // TODO add your handling code here:
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM Productos";
            PreparedStatement stmt = conn.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();
            
            
            prodTable.getModel();
           
            int row = 0;
            
            //prueba conexion
            while (rs.next()) {
                
            String codigo = rs.getString("codigo_prod");
            String nombre = rs.getString("nombre_prod");
            String gramaje = rs.getString("gramaje_prod");
            String presentacion = rs.getString("presentacion_prod");
            String categoria = rs.getString("categoria_prod");
            int stock = rs.getInt("stock_prod");
            double valcompra = rs.getDouble("valcompra_prod");
            double valventa = rs.getDouble("valventa_prod");
            
            
            prodTable.setValueAt(codigo, row, 0);
            prodTable.setValueAt(nombre, row, 1);
            prodTable.setValueAt(gramaje, row, 2);
            prodTable.setValueAt(presentacion, row, 3);
            prodTable.setValueAt(categoria, row, 4);
            prodTable.setValueAt(stock, row, 5);
            prodTable.setValueAt(valcompra, row, 6);
            prodTable.setValueAt(valventa, row, 7);
                        
            row++;
            
            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonDesplegarpProductoActionPerformed

    private void jButtonBuscarProdCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProdCodActionPerformed
        // TODO add your handling code here:
        String codigoinput = buscarProdInput.getText();
        
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            String Query = "SELECT * FROM productos WHERE codigo_prod = ?";
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setString(1, codigoinput);
            ResultSet rs = stmt.executeQuery();
            
           
            
            prodTable.getModel();
            
            //Logica para busqueda
            int row = 0;
            
            if (rs.next()) {
                
                int rowCount = prodTable.getRowCount();
                    for (int i = 1; i < rowCount; i++) {
                        for (int j = 0; j < 8; j++) {
                            prodTable.setValueAt("", i, j);
                        }
                    }
                    
                String codigo = rs.getString("codigo_prod");
                String nombre = rs.getString("nombre_prod");
                String gramaje = rs.getString("gramaje_prod");
                String presentacion = rs.getString("presentacion_prod");
                String categoria = rs.getString("categoria_prod");
                int stock = rs.getInt("stock_prod");
                String valcompra = rs.getString("valcompra_prod");
                String valventa = rs.getString("valventa_prod");
                
                System.out.println(valcompra);
                System.out.println(valventa);
                
                prodTable.setValueAt(codigo, row, 0);
                prodTable.setValueAt(nombre, row, 1);
                prodTable.setValueAt(gramaje, row, 2);
                prodTable.setValueAt(presentacion, row, 3);
                prodTable.setValueAt(categoria, row, 4);
                prodTable.setValueAt(stock, row, 5);
                prodTable.setValueAt(valcompra, row, 6);
                prodTable.setValueAt(valventa, row, 7);

            }
        } catch (SQLException x) {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButtonBuscarProdCodActionPerformed

    private void reportesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMenuMouseClicked
       Reportes reporte = new Reportes();
       this.setVisible(false);
       reporte.setVisible(true);

    }//GEN-LAST:event_reportesMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProducto1;
    private javax.swing.JTextField buscarProdInput;
    private javax.swing.JMenu empleadosMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JMenu inventarioMenu;
    private javax.swing.JButton jButtonBuscarProdCod;
    private javax.swing.JButton jButtonDesplegarpProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prodTable;
    private javax.swing.JButton quitarProducto;
    private javax.swing.JButton quitarProducto1;
    private javax.swing.JMenu reportesMenu;
    // End of variables declaration//GEN-END:variables
}
