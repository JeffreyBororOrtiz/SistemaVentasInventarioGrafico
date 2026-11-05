package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Tienda;
import modelo.Cliente;
import modelo.DetalleProducto;
import modelo.OrdenCompra;
import modelo.Producto;

public class PanelOrdenes extends javax.swing.JPanel {

    private Tienda tienda;
    private ArrayList<DetalleProducto> carrito;
    private DefaultTableModel modeloCarrito;
    private DefaultTableModel modeloOrdenes;

    public PanelOrdenes(Tienda tienda) {
        initComponents();
        this.tienda = tienda;
        carrito = new ArrayList<DetalleProducto>();
        modeloCarrito = (DefaultTableModel) tablaCarrito.getModel();
        modeloOrdenes = (DefaultTableModel) tablaOrdenes.getModel();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelFormulario = new javax.swing.JPanel();
        lblFormulario = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        lblProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        panelCarrito = new javax.swing.JPanel();
        lblCarrito = new javax.swing.JLabel();
        scrollCarrito = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        panelOrdenes = new javax.swing.JPanel();
        lblOrdenes = new javax.swing.JLabel();
        scrollOrdenes = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        btnCompletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 240, 243));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(new java.awt.Color(44, 62, 80));
        lblTitulo.setText("Ordenes de compra");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblSubtitulo.setForeground(new java.awt.Color(120, 133, 145));
        lblSubtitulo.setText("Arme la venta, registrela y luego completela para descontar el stock");

        lblFormulario.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblFormulario.setForeground(new java.awt.Color(44, 62, 80));
        lblFormulario.setText("Nueva orden");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblCliente.setForeground(new java.awt.Color(44, 62, 80));
        lblCliente.setText("Cliente");

        cmbCliente.setBackground(new java.awt.Color(255, 255, 255));
        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 13));

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblProducto.setForeground(new java.awt.Color(44, 62, 80));
        lblProducto.setText("Producto");

        cmbProducto.setBackground(new java.awt.Color(255, 255, 255));
        cmbProducto.setFont(new java.awt.Font("Segoe UI", 0, 13));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblCantidad.setForeground(new java.awt.Color(44, 62, 80));
        lblCantidad.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 13));

        btnAgregar.setBackground(new java.awt.Color(41, 128, 185));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("+ Agregar producto");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblTotal.setForeground(new java.awt.Color(0, 150, 136));
        lblTotal.setText("Total: Q 0.00");

        btnRegistrar.setBackground(new java.awt.Color(0, 150, 136));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar orden");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(149, 165, 166));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblCarrito.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblCarrito.setForeground(new java.awt.Color(44, 62, 80));
        lblCarrito.setText("Productos de la orden nueva");

        tablaCarrito.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCarrito.setFillsViewportHeight(true);
        tablaCarrito.setGridColor(new java.awt.Color(214, 220, 226));
        tablaCarrito.setRowHeight(28);
        tablaCarrito.setSelectionBackground(new java.awt.Color(178, 223, 219));
        tablaCarrito.setSelectionForeground(new java.awt.Color(44, 62, 80));
        tablaCarrito.setShowVerticalLines(false);

        scrollCarrito.setViewportView(tablaCarrito);

        panelCarrito.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelCarritoLayout = new javax.swing.GroupLayout(panelCarrito);
        panelCarrito.setLayout(panelCarritoLayout);
        panelCarritoLayout.setHorizontalGroup(
            panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarritoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelCarritoLayout.setVerticalGroup(
            panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarritoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        lblOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblOrdenes.setForeground(new java.awt.Color(44, 62, 80));
        lblOrdenes.setText("Ordenes registradas (seleccione una)");

        tablaOrdenes.setFont(new java.awt.Font("Segoe UI", 0, 13));
        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. orden", "Fecha", "Cliente", "Total", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOrdenes.setFillsViewportHeight(true);
        tablaOrdenes.setGridColor(new java.awt.Color(214, 220, 226));
        tablaOrdenes.setRowHeight(28);
        tablaOrdenes.setSelectionBackground(new java.awt.Color(178, 223, 219));
        tablaOrdenes.setSelectionForeground(new java.awt.Color(44, 62, 80));
        tablaOrdenes.setShowVerticalLines(false);

        scrollOrdenes.setViewportView(tablaOrdenes);

        btnCompletar.setBackground(new java.awt.Color(0, 150, 136));
        btnCompletar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnCompletar.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletar.setText("Completar venta");
        btnCompletar.setBorderPainted(false);
        btnCompletar.setFocusPainted(false);
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(211, 84, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar orden");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDetalle.setBackground(new java.awt.Color(41, 128, 185));
        btnDetalle.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btnDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalle.setText("Ver detalle");
        btnDetalle.setBorderPainted(false);
        btnDetalle.setFocusPainted(false);
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        panelOrdenes.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelOrdenesLayout = new javax.swing.GroupLayout(panelOrdenes);
        panelOrdenes.setLayout(panelOrdenesLayout);
        panelOrdenesLayout.setHorizontalGroup(
            panelOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(panelOrdenesLayout.createSequentialGroup()
                        .addComponent(btnCompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panelOrdenesLayout.setVerticalGroup(
            panelOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scrollOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(panelOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                            .addComponent(panelOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int posicionProducto = cmbProducto.getSelectedIndex();
        if (posicionProducto == -1) {
            JOptionPane.showMessageDialog(this, "Primero registre productos.");
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

        Producto producto = tienda.getProductos().get(posicionProducto);
        carrito.add(new DetalleProducto(producto, cantidad));
        txtCantidad.setText("");
        mostrarCarrito();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int posicionCliente = cmbCliente.getSelectedIndex();
        if (posicionCliente == -1) {
            JOptionPane.showMessageDialog(this, "Primero registre clientes.");
            return;
        }
        if (carrito.size() == 0) {
            JOptionPane.showMessageDialog(this, "La orden debe tener al menos un producto.");
            return;
        }

        Cliente cliente = tienda.getClientes().get(posicionCliente);
        OrdenCompra orden = new OrdenCompra(tienda.generarIdOrden(), cliente, tienda.fechaDeHoy());
        for (int i = 0; i < carrito.size(); i++) {
            orden.agregarProducto(carrito.get(i).getProducto(), carrito.get(i).getCantidad());
        }
        tienda.agregarOrden(orden);

        JOptionPane.showMessageDialog(this, "Orden " + orden.getIdOrden() + " registrada como Pendiente.\n"
                + "Total: " + dinero(orden.getTotal()));
        limpiar();
        actualizar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        OrdenCompra orden = ordenSeleccionada();
        if (orden == null) {
            return;
        }
        if (!orden.getEstado().equals("Pendiente")) {
            JOptionPane.showMessageDialog(this, "Solo se pueden completar ordenes Pendientes.");
            return;
        }

        String productoFaltante = tienda.productoSinStock(orden);
        if (productoFaltante != null) {
            JOptionPane.showMessageDialog(this, "No hay stock suficiente de: " + productoFaltante);
            return;
        }

        tienda.completarOrden(orden);
        JOptionPane.showMessageDialog(this, "Venta completada. Se desconto el stock del inventario.");
        actualizar();
    }//GEN-LAST:event_btnCompletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        OrdenCompra orden = ordenSeleccionada();
        if (orden == null) {
            return;
        }
        if (!orden.getEstado().equals("Pendiente")) {
            JOptionPane.showMessageDialog(this, "Solo se pueden cancelar ordenes Pendientes.");
            return;
        }
        tienda.cancelarOrden(orden);
        JOptionPane.showMessageDialog(this, "Orden cancelada.");
        actualizar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        OrdenCompra orden = ordenSeleccionada();
        if (orden == null) {
            return;
        }
        String texto = "Orden: " + orden.getIdOrden() + "\n"
                + "Fecha: " + orden.getFecha() + "\n"
                + "Cliente: " + orden.getCliente().getNombre() + "\n"
                + "Estado: " + orden.getEstado() + "\n\n";
        for (int i = 0; i < orden.getProductos().size(); i++) {
            DetalleProducto d = orden.getProductos().get(i);
            texto = texto + d.getCantidad() + " x " + d.getProducto().getNombre()
                    + " = " + dinero(d.getSubtotal()) + "\n";
        }
        texto = texto + "\nTotal: " + dinero(orden.getTotal());
        JOptionPane.showMessageDialog(this, texto);
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void limpiar() {
        carrito.clear();
        txtCantidad.setText("");
        mostrarCarrito();
    }

    private void mostrarCarrito() {
        double total = 0;
        modeloCarrito.setRowCount(0);
        for (int i = 0; i < carrito.size(); i++) {
            DetalleProducto d = carrito.get(i);
            modeloCarrito.addRow(new Object[]{d.getProducto().getCodigo(), d.getProducto().getNombre(),
                d.getCantidad(), dinero(d.getProducto().getPrecio()), dinero(d.getSubtotal())});
            total = total + d.getSubtotal();
        }
        lblTotal.setText("Total: " + dinero(total));
    }

    private OrdenCompra ordenSeleccionada() {
        int fila = tablaOrdenes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una orden en la tabla.");
            return null;
        }
        return tienda.getOrdenes().get(fila);
    }

    public void actualizar() {
        cmbCliente.removeAllItems();
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            Cliente c = tienda.getClientes().get(i);
            cmbCliente.addItem(c.getNombre() + " (" + c.getDpi() + ")");
        }

        cmbProducto.removeAllItems();
        for (int i = 0; i < tienda.getProductos().size(); i++) {
            Producto p = tienda.getProductos().get(i);
            cmbProducto.addItem(p.getCodigo() + " - " + p.getNombre() + " (stock: "
                    + tienda.stockTotal(p.getCodigo()) + ")");
        }

        modeloOrdenes.setRowCount(0);
        for (int i = 0; i < tienda.getOrdenes().size(); i++) {
            OrdenCompra o = tienda.getOrdenes().get(i);
            modeloOrdenes.addRow(new Object[]{o.getIdOrden(), o.getFecha(), o.getCliente().getNombre(),
                dinero(o.getTotal()), o.getEstado()});
        }
        mostrarCarrito();
    }

    private String dinero(double cantidad) {
        return "Q " + String.format("%.2f", cantidad);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFormulario;
    private javax.swing.JLabel lblOrdenes;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelCarrito;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelOrdenes;
    private javax.swing.JScrollPane scrollCarrito;
    private javax.swing.JScrollPane scrollOrdenes;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaOrdenes;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
