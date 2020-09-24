/*
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila.
 */
package taller.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import taller.logica.Persona;
import taller.logica.Servicio;
import taller.logica.Taller;
import taller.logica.TipoVehiculo;
import taller.logica.Vehiculo;

/**
 *
 * @author 57312
 */
public class IngresoVehiculoUI extends javax.swing.JInternalFrame {

    private Taller taller;

    public IngresoVehiculoUI(Taller taller) throws Exception {

        initComponents();
        this.taller = taller;
        buttonRegistrarVehiculo.addActionListener(new SaveListener());
        buttonCancel.addActionListener(new CancelListener());
        buttonSearch.addActionListener(new SearchListener());

        // Creacion de objetos para los Servicios del taller a la hora de ingresar vehículo.
        // Servicios asimilados con la lubricación de los vehículos:
        Servicio s01 = new Servicio(01, "[LUBRICACIÓN] Cambio de Aceite", 10000);
        Servicio s02 = new Servicio(02, "[LUBRICACIÓN] Cambio de Filtro", 10000);
        // Servicios asimilados con la electricidad de los vehículos:
        Servicio s03 = new Servicio(11, "[ELECTRICIDAD] Arranques", 12000);
        Servicio s04 = new Servicio(12, "[ELECTRICIDAD] Alternadores", 12000);
        Servicio s05 = new Servicio(13, "[ELECTRICIDAD] Encendido", 12000);
        Servicio s06 = new Servicio(14, "[ELECTRICIDAD] Electro ventiladores", 12000);
        Servicio s07 = new Servicio(15, "[ELECTRICIDAD] Afinación completa", 12000);
        Servicio s08 = new Servicio(16, "[ELECTRICIDAD] Bujías", 12000);
        Servicio s09 = new Servicio(17, "[ELECTRICIDAD] Cables", 12000);
        Servicio s10 = new Servicio(18, "[ELECTRICIDAD] Problemas de temperatura", 12000);
        // Servicios asimilados con la reparación de chapa y pintura:
        Servicio s11 = new Servicio(21, "[CHAPA - PINTURA] Reparación de Chapa", 50000);
        Servicio s12 = new Servicio(22, "[CHAPA - PINTURA] Pintura del vehículo", 50000);
        Servicio s13 = new Servicio(23, "[CHAPA - PINTURA] Toques de mantenimiento", 50000);
        // Servicios asimilados con la inyección electrónica y mecánica:
        Servicio s14 = new Servicio(31, "[INYECCIÓN] Electrónica y Mecánica", 20000);
        Servicio s15 = new Servicio(32, "[INYECCIÓN] Reparación y carga de aire acondicionado", 20000);
        Servicio s16 = new Servicio(33, "[INYECCIÓN] Tren delantero", 20000);
        Servicio s17 = new Servicio(34, "[INYECCIÓN] Frenos", 20000);
        Servicio s18 = new Servicio(35, "[INYECCIÓN] Carburación", 20000);
        Servicio s19 = new Servicio(36, "[INYECCIÓN] Cajas de velocidades", 20000);
        Servicio s20 = new Servicio(37, "[INYECCIÓN] Embragues", 20000);
        Servicio s21 = new Servicio(38, "[INYECCIÓN] Suspensión, alineación y balanceo", 20000);
        Servicio s22 = new Servicio(39, "[INYECCIÓN] Apuesta a punto electrónica", 20000);
        Servicio s23 = new Servicio(391, "[INYECCIÓN] Reperación y rectificación de motores", 20000);
        Servicio s24 = new Servicio(392, "[INYECCIÓN] Cambio de Correas de distribución", 20000);
        Servicio s25 = new Servicio(393, "[INYECCIÓN] Limpieza y calibrado de inyectores electrónicos", 20000);

        // Agregar los servicios creados anteriormente al objeto taller.
        taller.agregarServicio(s01);
        taller.agregarServicio(s02);
        taller.agregarServicio(s03);
        taller.agregarServicio(s04);
        taller.agregarServicio(s05);
        taller.agregarServicio(s06);
        taller.agregarServicio(s07);
        taller.agregarServicio(s08);
        taller.agregarServicio(s09);
        taller.agregarServicio(s10);
        taller.agregarServicio(s11);
        taller.agregarServicio(s12);
        taller.agregarServicio(s13);
        taller.agregarServicio(s14);
        taller.agregarServicio(s15);
        taller.agregarServicio(s16);
        taller.agregarServicio(s17);
        taller.agregarServicio(s18);
        taller.agregarServicio(s19);
        taller.agregarServicio(s20);
        taller.agregarServicio(s21);
        taller.agregarServicio(s22);
        taller.agregarServicio(s23);
        taller.agregarServicio(s24);
        taller.agregarServicio(s25);

        // Agregar los Servicios al JComboBox de los servicios solicitados.
        jcbServicioSolicitado.addItem(s01.toString());
        jcbServicioSolicitado.addItem(s02.toString());
        jcbServicioSolicitado.addItem(s03.toString());
        jcbServicioSolicitado.addItem(s04.toString());
        jcbServicioSolicitado.addItem(s05.toString());
        jcbServicioSolicitado.addItem(s06.toString());
        jcbServicioSolicitado.addItem(s07.toString());
        jcbServicioSolicitado.addItem(s08.toString());
        jcbServicioSolicitado.addItem(s09.toString());
        jcbServicioSolicitado.addItem(s10.toString());
        jcbServicioSolicitado.addItem(s11.toString());
        jcbServicioSolicitado.addItem(s12.toString());
        jcbServicioSolicitado.addItem(s13.toString());
        jcbServicioSolicitado.addItem(s14.toString());
        jcbServicioSolicitado.addItem(s15.toString());
        jcbServicioSolicitado.addItem(s16.toString());
        jcbServicioSolicitado.addItem(s17.toString());
        jcbServicioSolicitado.addItem(s18.toString());
        jcbServicioSolicitado.addItem(s19.toString());
        jcbServicioSolicitado.addItem(s20.toString());
        jcbServicioSolicitado.addItem(s21.toString());
        jcbServicioSolicitado.addItem(s22.toString());
        jcbServicioSolicitado.addItem(s23.toString());
        jcbServicioSolicitado.addItem(s24.toString());
        jcbServicioSolicitado.addItem(s25.toString());
    }

    IngresoVehiculoUI() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxfPlaca = new javax.swing.JTextField();
        jtxfLinea = new javax.swing.JTextField();
        jtxfModelo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxfNUIP = new javax.swing.JTextField();
        jtxfApellidos = new javax.swing.JTextField();
        jtxfNombres = new javax.swing.JTextField();
        jtxfTelefono = new javax.swing.JTextField();
        buttonRegistrarVehiculo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jcbServicioSolicitado = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListServicios = new javax.swing.JList<>();
        buttonIngresarVehiculo = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jcbMarca = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox(TipoVehiculo.values());
        buttonSearch = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de Vehículos");

        jLabel2.setText("Vehículo");

        jLabel3.setText("Placa:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Linea:");

        jLabel7.setText("Modelo:");

        jtxfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPlacaActionPerformed(evt);
            }
        });

        jtxfLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfLineaActionPerformed(evt);
            }
        });

        jLabel8.setText("Propietario");

        jLabel9.setText("NUIP:");

        jLabel10.setText("Nombre(s);");

        jLabel11.setText("Apellido(s):");

        jLabel12.setText("Teléfono:");

        buttonRegistrarVehiculo.setText("Registrar Vehículo");
        buttonRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxfNUIP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jtxfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRegistrarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxfNUIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRegistrarVehiculo)
                .addContainerGap())
        );

        jLabel13.setText("Servicio(s) Solicitado(s)");

        buttonAdd.setText("Agregar");

        jListServicios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListServicios);

        buttonIngresarVehiculo.setText("Ingresar Vehículo");
        buttonIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarVehiculoActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancelar");

        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOYOTA", "NISSAN", "SUBARU", "HONDA", "ISUZU", "M. BENZ", "SUZUKI", "MITSUBISHI", "DATSUN", "DAIHATSU", "HIUNDAY", "KIA", "ZX AUTO", "GELY", "MAZDA", "CHEVROLETH", "FORD", "CHRYSLER", "JEEP", "VW", "VOLVO", "AUDI", "BMW", "PEUGEUT", "RENAULT", "FIAT", "ALFA ROMEO", "SKODA", "LAMBIRGINI" }));

        buttonSearch.setText("...");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfLinea)
                                    .addComponent(jtxfModelo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbServicioSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtxfLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbServicioSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIngresarVehiculo)
                    .addComponent(buttonCancel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegistrarVehiculoActionPerformed

    private void buttonIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIngresarVehiculoActionPerformed

    private void jtxfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPlacaActionPerformed

    private void jtxfLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfLineaActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonIngresarVehiculo;
    private javax.swing.JButton buttonRegistrarVehiculo;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListServicios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbServicioSolicitado;
    private javax.swing.JComboBox<TipoVehiculo> jcbTipo;
    private javax.swing.JTextField jtxfApellidos;
    private javax.swing.JTextField jtxfLinea;
    private javax.swing.JTextField jtxfModelo;
    private javax.swing.JTextField jtxfNUIP;
    private javax.swing.JTextField jtxfNombres;
    private javax.swing.JTextField jtxfPlaca;
    private javax.swing.JTextField jtxfTelefono;
    // End of variables declaration//GEN-END:variables

    public class SaveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                //Obtener información obtenida en los campos de texto.
                //Vehiculo
                String placa = jtxfPlaca.getText();
                String marca = jcbMarca.getSelectedItem().toString();
                String tipo = jcbTipo.getSelectedItem().toString();
                String linea = jtxfLinea.getText();
                String modelo = jtxfModelo.getText();

                //Propietario
                long nuip = Long.parseLong(jtxfNUIP.getText());
                String nombres = jtxfNombres.getText();
                String apellidos = jtxfApellidos.getText();
                long telefono = Long.parseLong(jtxfTelefono.getText());

                //Creación de objetos
                //Vehiculo veh = new Vehiculo(marca, placa, linea, null, new Persona((long) nuip, nombres, apellidos, (long) telefono));
                Vehiculo veh = new Vehiculo(marca, placa, linea, modelo, TipoVehiculo.valueOf(tipo), new Persona(nuip, nombres, apellidos, telefono));

                // Agregar el Vehiculo al objeto de tipo Taller.
                taller.registrarVehiculo(veh);

                // Limpiar formulario, al igual que CancelListener.
                jtxfPlaca.setText("");
                jtxfLinea.setText("");
                jtxfModelo.setText("");
                jtxfNUIP.setText("");
                jtxfNombres.setText("");
                jtxfApellidos.setText("");
                jtxfTelefono.setText("");

                //Mostrar mensajes de confirmación
                JOptionPane.showMessageDialog(IngresoVehiculoUI.this, "Información almacenada satisfactoriamente.");
            } catch (Exception ex) {
                Logger.getLogger(IngresoVehiculoUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class CancelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            jtxfPlaca.setText("");
            jtxfLinea.setText("");
            jtxfModelo.setText("");
            jtxfNUIP.setText("");
            jtxfNombres.setText("");
            jtxfApellidos.setText("");
            jtxfTelefono.setText("");
        }

    }

    public class SearchListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String placa = jtxfPlaca.getText();
            try {
                taller.buscarVehiculo(placa);
                JOptionPane.showMessageDialog(null, "Información del Vehículo registrado:\n\n" + taller.buscarVehiculo(placa).toString(), "Buscador de Vehículos", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(IngresoVehiculoUI.this, ex.getMessage());
                Logger.getLogger(IngresoVehiculoUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class addService implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }

    }

}
