package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Tienda;
import modelo.Bodega;
import modelo.DetalleProducto;
import modelo.Inventario;
import modelo.Producto;

public class PanelInventario extends javax.swing.JPanel {

    private Tienda tienda;
    private DefaultTableModel modelo;

    public PanelInventario(Tienda tienda) {
        initComponents();
        this.tienda = tienda;
        modelo = (DefaultTableModel) tablaInventario.getModel();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelFormulario = new javax.swing.JPanel();
        lblFormulario = new javax.swing.JLabel();
        lblBodega = new javax.swing.JLabel();
        cmbBodega = new javax.swing.JComboBox<>();
        lblProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        scrollInventario = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();

        setBackground(new java.awt.Color(236, 240, 243));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(new java.awt.Color(44, 62, 80));
        lblTitulo.setText("Inventario");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblSubtitulo.setForeground(new java.awt.Color(120, 133, 145));
        lblSubtitulo.setText("Cantidad de cada producto guardada en cada bodega");

        lblFormulario.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblFormulario.setForeground(new java.awt.Color(44, 62, 80));
        lblFormulario.setText("Ingresar mercaderia");

        lblBodega.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblBodega.setForeground(new java.awt.Color(44, 62, 80));
        lblBodega.setText("Bodega");

        cmbBodega.setBackground(new java.awt.Color(255, 255, 255));
        cmbBodega.setFont(new java.awt.Font("Segoe UI", 0, 13));

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblProducto.setForeground(new java.awt.Color(44, 62, 80));
        lblProducto.setText("Producto");

        cmbProducto.setBackground(new java.awt.Color(255, 255, 255));
        cmbProducto.setFont(new java.awt.Font("Segoe UI", 0, 13));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblCantidad.setForeground(new java.awt.Color(44, 62, 80));
        lblCantidad.setText("Cantidad a ingresar");

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 13));

        btnAgregar.setBackground(new java.awt.Color(0, 150, 136));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar al inventario");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBodega, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblInventario.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblInventario.setForeground(new java.awt.Color(44, 62, 80));
        lblInventario.setText("Inventario actual");

        tablaInventario.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inventario", "Bodega", "Codigo", "Producto", "Cantidad (stock)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInventario.setFillsViewportHeight(true);
        tablaInventario.setGridColor(new java.awt.Color(214, 220, 226));
        tablaInventario.setRowHeight(28);
        tablaInventario.setSelectionBackground(new java.awt.Color(178, 223, 219));
        tablaInventario.setSelectionForeground(new java.awt.Color(44, 62, 80));
        tablaInventario.setShowVerticalLines(false);

        scrollInventario.setViewportView(tablaInventario);

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int posicionBodega = cmbBodega.getSelectedIndex();
        int posicionProducto = cmbProducto.getSelectedIndex();

        if (posicionBodega == -1 || posicionProducto == -1) {
            JOptionPane.showMessageDialog(this, "Primero registre bodegas y productos.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(txtCantidad.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero entero.");
            return;
        }
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero.");
            return;
        }

        Bodega bodega = tienda.getBodegas().get(posicionBodega);
        Producto producto = tienda.getProductos().get(posicionProducto);

        if (cantidad > tienda.espacioDisponible(bodega)) {
            JOptionPane.showMessageDialog(this, "No hay espacio suficiente en la bodega. Espacio disponible: "
                    + tienda.espacioDisponible(bodega));
            return;
        }

        tienda.agregarAInventario(bodega, producto, cantidad);
        JOptionPane.showMessageDialog(this, "Productos agregados al inventario.");
        txtCantidad.setText("");
        actualizar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void actualizar() {
        cmbBodega.removeAllItems();
        for (int i = 0; i < tienda.getBodegas().size(); i++) {
            Bodega b = tienda.getBodegas().get(i);
            cmbBodega.addItem(b.getIdBodega() + " - " + b.getDireccion());
        }

        cmbProducto.removeAllItems();
        for (int i = 0; i < tienda.getProductos().size(); i++) {
            Producto p = tienda.getProductos().get(i);
            cmbProducto.addItem(p.getCodigo() + " - " + p.getNombre());
        }

        modelo.setRowCount(0);
        for (int i = 0; i < tienda.getInventarios().size(); i++) {
            Inventario inv = tienda.getInventarios().get(i);
            for (int j = 0; j < inv.getProductos().size(); j++) {
                DetalleProducto d = inv.getProductos().get(j);
                modelo.addRow(new Object[]{inv.getIdInventario(), inv.getBodega().getIdBodega(),
                    d.getProducto().getCodigo(), d.getProducto().getNombre(), d.getCantidad()});
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbBodega;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel lblBodega;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFormulario;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JScrollPane scrollInventario;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
