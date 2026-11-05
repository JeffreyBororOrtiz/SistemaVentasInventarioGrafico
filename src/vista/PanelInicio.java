package vista;

import logica.Tienda;

public class PanelInicio extends javax.swing.JPanel {

    private Tienda tienda;

    public PanelInicio(Tienda tienda) {
        initComponents();
        this.tienda = tienda;
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelTarjeta1 = new javax.swing.JPanel();
        panelFranja1 = new javax.swing.JPanel();
        lblNumero1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        panelTarjeta2 = new javax.swing.JPanel();
        panelFranja2 = new javax.swing.JPanel();
        lblNumero2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        panelTarjeta3 = new javax.swing.JPanel();
        panelFranja3 = new javax.swing.JPanel();
        lblNumero3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        panelTarjeta4 = new javax.swing.JPanel();
        panelFranja4 = new javax.swing.JPanel();
        lblNumero4 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        panelPasos = new javax.swing.JPanel();
        lblComoUsar = new javax.swing.JLabel();
        lblPaso1 = new javax.swing.JLabel();
        lblPaso2 = new javax.swing.JLabel();
        lblPaso3 = new javax.swing.JLabel();
        lblPaso4 = new javax.swing.JLabel();
        lblPaso5 = new javax.swing.JLabel();
        lblPaso6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 240, 243));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(new java.awt.Color(44, 62, 80));
        lblTitulo.setText("Bienvenido");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblSubtitulo.setForeground(new java.awt.Color(120, 133, 145));
        lblSubtitulo.setText("Resumen general de la tienda");

        panelFranja1.setBackground(new java.awt.Color(41, 128, 185));
        javax.swing.GroupLayout panelFranja1Layout = new javax.swing.GroupLayout(panelFranja1);
        panelFranja1.setLayout(panelFranja1Layout);
        panelFranja1Layout.setHorizontalGroup(
            panelFranja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFranja1Layout.setVerticalGroup(
            panelFranja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        lblNumero1.setFont(new java.awt.Font("Segoe UI", 1, 34));
        lblNumero1.setForeground(new java.awt.Color(41, 128, 185));
        lblNumero1.setText("0");

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblNombre1.setForeground(new java.awt.Color(120, 133, 145));
        lblNombre1.setText("Productos");

        panelTarjeta1.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelTarjeta1Layout = new javax.swing.GroupLayout(panelTarjeta1);
        panelTarjeta1.setLayout(panelTarjeta1Layout);
        panelTarjeta1Layout.setHorizontalGroup(
            panelTarjeta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarjeta1Layout.createSequentialGroup()
                .addComponent(panelFranja1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTarjeta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelTarjeta1Layout.setVerticalGroup(
            panelTarjeta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFranja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTarjeta1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelFranja2.setBackground(new java.awt.Color(0, 150, 136));
        javax.swing.GroupLayout panelFranja2Layout = new javax.swing.GroupLayout(panelFranja2);
        panelFranja2.setLayout(panelFranja2Layout);
        panelFranja2Layout.setHorizontalGroup(
            panelFranja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFranja2Layout.setVerticalGroup(
            panelFranja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        lblNumero2.setFont(new java.awt.Font("Segoe UI", 1, 34));
        lblNumero2.setForeground(new java.awt.Color(0, 150, 136));
        lblNumero2.setText("0");

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblNombre2.setForeground(new java.awt.Color(120, 133, 145));
        lblNombre2.setText("Clientes");

        panelTarjeta2.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelTarjeta2Layout = new javax.swing.GroupLayout(panelTarjeta2);
        panelTarjeta2.setLayout(panelTarjeta2Layout);
        panelTarjeta2Layout.setHorizontalGroup(
            panelTarjeta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarjeta2Layout.createSequentialGroup()
                .addComponent(panelFranja2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTarjeta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelTarjeta2Layout.setVerticalGroup(
            panelTarjeta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFranja2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTarjeta2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelFranja3.setBackground(new java.awt.Color(142, 68, 173));
        javax.swing.GroupLayout panelFranja3Layout = new javax.swing.GroupLayout(panelFranja3);
        panelFranja3.setLayout(panelFranja3Layout);
        panelFranja3Layout.setHorizontalGroup(
            panelFranja3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFranja3Layout.setVerticalGroup(
            panelFranja3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        lblNumero3.setFont(new java.awt.Font("Segoe UI", 1, 34));
        lblNumero3.setForeground(new java.awt.Color(142, 68, 173));
        lblNumero3.setText("0");

        lblNombre3.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblNombre3.setForeground(new java.awt.Color(120, 133, 145));
        lblNombre3.setText("Bodegas");

        panelTarjeta3.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelTarjeta3Layout = new javax.swing.GroupLayout(panelTarjeta3);
        panelTarjeta3.setLayout(panelTarjeta3Layout);
        panelTarjeta3Layout.setHorizontalGroup(
            panelTarjeta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarjeta3Layout.createSequentialGroup()
                .addComponent(panelFranja3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTarjeta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelTarjeta3Layout.setVerticalGroup(
            panelTarjeta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFranja3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTarjeta3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelFranja4.setBackground(new java.awt.Color(211, 84, 0));
        javax.swing.GroupLayout panelFranja4Layout = new javax.swing.GroupLayout(panelFranja4);
        panelFranja4.setLayout(panelFranja4Layout);
        panelFranja4Layout.setHorizontalGroup(
            panelFranja4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFranja4Layout.setVerticalGroup(
            panelFranja4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        lblNumero4.setFont(new java.awt.Font("Segoe UI", 1, 34));
        lblNumero4.setForeground(new java.awt.Color(211, 84, 0));
        lblNumero4.setText("0");

        lblNombre4.setFont(new java.awt.Font("Segoe UI", 1, 13));
        lblNombre4.setForeground(new java.awt.Color(120, 133, 145));
        lblNombre4.setText("Ordenes pendientes");

        panelTarjeta4.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelTarjeta4Layout = new javax.swing.GroupLayout(panelTarjeta4);
        panelTarjeta4.setLayout(panelTarjeta4Layout);
        panelTarjeta4Layout.setHorizontalGroup(
            panelTarjeta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarjeta4Layout.createSequentialGroup()
                .addComponent(panelFranja4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTarjeta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelTarjeta4Layout.setVerticalGroup(
            panelTarjeta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFranja4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTarjeta4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        lblComoUsar.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblComoUsar.setForeground(new java.awt.Color(44, 62, 80));
        lblComoUsar.setText("Como usar el sistema");

        lblPaso1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso1.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso1.setText("1.  Registre sus productos y empleados.");

        lblPaso2.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso2.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso2.setText("2.  Cree las bodegas y asigne un empleado encargado a cada una.");

        lblPaso3.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso3.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso3.setText("3.  En Inventario, ingrese cuantas unidades hay de cada producto.");

        lblPaso4.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso4.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso4.setText("4.  Registre a sus clientes.");

        lblPaso5.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso5.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso5.setText("5.  En Ordenes, arme la venta y luego presione Completar venta.");

        lblPaso6.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblPaso6.setForeground(new java.awt.Color(44, 62, 80));
        lblPaso6.setText("     Al completarla se descuenta el stock automaticamente.");

        panelPasos.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelPasosLayout = new javax.swing.GroupLayout(panelPasos);
        panelPasos.setLayout(panelPasosLayout);
        panelPasosLayout.setHorizontalGroup(
            panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComoUsar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaso6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        panelPasosLayout.setVerticalGroup(
            panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblComoUsar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPaso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblPaso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblPaso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblPaso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblPaso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblPaso6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(panelTarjeta1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTarjeta2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTarjeta3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTarjeta4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(panelPasos, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
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
                    .addComponent(panelTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTarjeta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTarjeta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelPasos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void actualizar() {
        int pendientes = 0;
        for (int i = 0; i < tienda.getOrdenes().size(); i++) {
            if (tienda.getOrdenes().get(i).getEstado().equals("Pendiente")) {
                pendientes = pendientes + 1;
            }
        }
        lblNumero1.setText("" + tienda.getProductos().size());
        lblNumero2.setText("" + tienda.getClientes().size());
        lblNumero3.setText("" + tienda.getBodegas().size());
        lblNumero4.setText("" + pendientes);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblComoUsar;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblPaso1;
    private javax.swing.JLabel lblPaso2;
    private javax.swing.JLabel lblPaso3;
    private javax.swing.JLabel lblPaso4;
    private javax.swing.JLabel lblPaso5;
    private javax.swing.JLabel lblPaso6;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelFranja1;
    private javax.swing.JPanel panelFranja2;
    private javax.swing.JPanel panelFranja3;
    private javax.swing.JPanel panelFranja4;
    private javax.swing.JPanel panelPasos;
    private javax.swing.JPanel panelTarjeta1;
    private javax.swing.JPanel panelTarjeta2;
    private javax.swing.JPanel panelTarjeta3;
    private javax.swing.JPanel panelTarjeta4;
    // End of variables declaration//GEN-END:variables
}
