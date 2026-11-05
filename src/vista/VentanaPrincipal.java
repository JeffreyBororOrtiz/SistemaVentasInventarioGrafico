package vista;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import logica.Tienda;

public class VentanaPrincipal extends javax.swing.JFrame {

    private PanelInicio panelInicio;
    private PanelProductos panelProductos;
    private PanelClientes panelClientes;
    private PanelEmpleados panelEmpleados;
    private PanelBodegas panelBodegas;
    private PanelInventario panelInventario;
    private PanelOrdenes panelOrdenes;

    public VentanaPrincipal(Tienda tienda) {
        initComponents();

        panelInicio = new PanelInicio(tienda);
        panelProductos = new PanelProductos(tienda);
        panelClientes = new PanelClientes(tienda);
        panelEmpleados = new PanelEmpleados(tienda);
        panelBodegas = new PanelBodegas(tienda);
        panelInventario = new PanelInventario(tienda);
        panelOrdenes = new PanelOrdenes(tienda);

        panelContenido.add(panelInicio, "inicio");
        panelContenido.add(panelProductos, "productos");
        panelContenido.add(panelClientes, "clientes");
        panelContenido.add(panelEmpleados, "empleados");
        panelContenido.add(panelBodegas, "bodegas");
        panelContenido.add(panelInventario, "inventario");
        panelContenido.add(panelOrdenes, "ordenes");

        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        mostrarPantalla("inicio", btnInicio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnBodegas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnOrdenes = new javax.swing.JButton();
        lblAutor = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas e Inventario");
        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setText("<html>Sistema de<br>Ventas e Inventario</html>");

        btnInicio.setBackground(new java.awt.Color(28, 37, 54));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("   Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(28, 37, 54));
        btnProductos.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("   Productos");
        btnProductos.setBorderPainted(false);
        btnProductos.setFocusPainted(false);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(28, 37, 54));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("   Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(28, 37, 54));
        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("   Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setFocusPainted(false);
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnBodegas.setBackground(new java.awt.Color(28, 37, 54));
        btnBodegas.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnBodegas.setForeground(new java.awt.Color(255, 255, 255));
        btnBodegas.setText("   Bodegas");
        btnBodegas.setBorderPainted(false);
        btnBodegas.setFocusPainted(false);
        btnBodegas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBodegasActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(28, 37, 54));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("   Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setFocusPainted(false);
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnOrdenes.setBackground(new java.awt.Color(28, 37, 54));
        btnOrdenes.setFont(new java.awt.Font("Segoe UI", 0, 15));
        btnOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenes.setText("   Ordenes de compra");
        btnOrdenes.setBorderPainted(false);
        btnOrdenes.setFocusPainted(false);
        btnOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenesActionPerformed(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblAutor.setForeground(new java.awt.Color(149, 165, 166));
        lblAutor.setText("<html>Jeffrey Anderson<br>Boror Ortiz</html>");

        panelMenu.setBackground(new java.awt.Color(28, 37, 54));
        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnBodegas, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnBodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelContenido.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicio.actualizar();
        mostrarPantalla("inicio", btnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        panelProductos.actualizar();
        mostrarPantalla("productos", btnProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        panelClientes.actualizar();
        mostrarPantalla("clientes", btnClientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        panelEmpleados.actualizar();
        mostrarPantalla("empleados", btnEmpleados);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnBodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBodegasActionPerformed
        panelBodegas.actualizar();
        mostrarPantalla("bodegas", btnBodegas);
    }//GEN-LAST:event_btnBodegasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        panelInventario.actualizar();
        mostrarPantalla("inventario", btnInventario);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenesActionPerformed
        panelOrdenes.actualizar();
        mostrarPantalla("ordenes", btnOrdenes);
    }//GEN-LAST:event_btnOrdenesActionPerformed

    private void mostrarPantalla(String nombre, JButton boton) {
        CardLayout cartas = (CardLayout) panelContenido.getLayout();
        cartas.show(panelContenido, nombre);

        JButton[] botones = {btnInicio, btnProductos, btnClientes, btnEmpleados,
            btnBodegas, btnInventario, btnOrdenes};
        for (int i = 0; i < botones.length; i++) {
            if (botones[i] == boton) {
                botones[i].setBackground(new java.awt.Color(0, 150, 136));
            } else {
                botones[i].setBackground(new java.awt.Color(28, 37, 54));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBodegas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
