/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestionrecursoshumanos.Vista;

import gestionrecursoshumanos.Modelo.Cargo;
import gestionrecursoshumanos.Modelo.CargoDao;
import gestionrecursoshumanos.Modelo.Contrato;
import gestionrecursoshumanos.Modelo.ContratoDao;
import gestionrecursoshumanos.Modelo.DescuentoLey;
import gestionrecursoshumanos.Modelo.DescuentoLeyDAO;
import gestionrecursoshumanos.Modelo.HorasTrabajadasDAO;
import gestionrecursoshumanos.Modelo.Nomina;
import gestionrecursoshumanos.Modelo.NominaDAO;
import gestionrecursoshumanos.Modelo.ProcesoPersona;
import gestionrecursoshumanos.Modelo.ProcesoPersonaDAO;
import gestionrecursoshumanos.Modelo.ProcesoSeleccion;
import gestionrecursoshumanos.Modelo.Salida;
import gestionrecursoshumanos.Modelo.SalidaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejo
 */
public class AdminNomi extends javax.swing.JPanel {

    /**
     * Creates new form AdminNomi
     */
    public AdminNomi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TXT1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1097, 817));
        jPanel2.setMinimumSize(new java.awt.Dimension(1097, 817));

        jLabel3.setText("jLabel3");

        TXT1.setBackground(new java.awt.Color(255, 255, 255));
        TXT1.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        TXT1.setForeground(new java.awt.Color(0, 0, 0));
        TXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("IDENTIFICACION DEL EMPLEADO");
        jLabel4.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GENERAR NOMINA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GENERACION NOMINA ESPECIFICA DE EMPLEADO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID DE NOMINA", "PAGO DE LA NOMINA", "HORAS DE TRABAO", "SALIDA", "EMPLEADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(1050, 1050, 1050))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(317, 317, 317)
                                    .addComponent(jButton1))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try {
    int idProcesoPersona = Integer.parseInt(TXT1.getText().trim());
    int idNomina = idProcesoPersona;

    // Buscar ProcesoPersona por ID
    ProcesoPersona procesoPersona = new ProcesoPersonaDAO().buscarProcesoPersonaPorId(idProcesoPersona);
    if (procesoPersona != null) {
        ProcesoSeleccion seleccion = procesoPersona.getSeleccion();
        if (seleccion != null) {
            Cargo cargo = seleccion.getFuncion();
            if (cargo != null) {
                float salario = cargo.getSalario();

                // Buscar Descuento de Ley por ID 1
                DescuentoLey descuentoLey = new DescuentoLeyDAO().buscarDescuentoLeyPorId(1);
                if (descuentoLey != null) {
                    float porcentajeDescuento = descuentoLey.getPorcentaje();

                    // Calcular salario neto
                    float salarioNeto = salario - (salario * (porcentajeDescuento / 100));

                    // Redondear el salario neto
                    salarioNeto = Math.round(salarioNeto * 100.0f) / 100.0f;

                    // Obtener horas totales por contrato usando el ID del JTextField como ID_CONTRATO
                    int horasTotales = new HorasTrabajadasDAO().obtenerHorasTotalesPorContrato(idProcesoPersona);

                    // Buscar el tipo de salida usando el ID del JTextField como ID_SALIDA
                    Salida salida = new SalidaDAO().findById(idProcesoPersona);
                    if (salida != null) {
                        // Buscar el contrato usando el ID ingresado
                        Contrato contrato = new ContratoDao().buscarConvenioPorId(idProcesoPersona);
                        if (contrato != null) {
                            // Crear objeto Nomina con los datos obtenidos
                            Nomina nomina = new Nomina(idNomina, salarioNeto, horasTotales, salida, contrato);

                            // Guardar Nomina en la base de datos
                             // Guardar Nomina en la base de datos
            boolean creado = new NominaDAO().crearNomina(nomina);
            if (creado) {
                // Recuperar todas las nominas
                List<Nomina> nominas = new NominaDAO().obtenerTodasLasNominas();

                // Crear un DefaultTableModel para almacenar los datos de la tabla Nomina
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Pago Nomina");
                model.addColumn("Horas Trabajo");
                model.addColumn("Motivo Salida");
                model.addColumn("Convenio");

                // Llenar el modelo con los datos de las nominas
                for (Nomina n : nominas) {
                    model.addRow(new Object[]{n.getIdNomina(), n.getPagoNomina(), n.getHorasTrabajo(), n.getMotivoSalida(), n.getConvenio()});
                }

                // Establecer el modelo en el JTable
                jTable1.setModel(model);
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear la Nomina.", "Error", JOptionPane.ERROR_MESSAGE);
            }
  
                            if (creado) {
                                JOptionPane.showMessageDialog(null, "Nomina creada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al crear la Nomina.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Contrato no encontrado para id_contrato: " + idProcesoPersona, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Salida no encontrada para id_salida: " + idProcesoPersona, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Descuento de Ley no encontrado para id_descuento: 1", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cargo no encontrado para id_cargo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ProcesoSeleccion no encontrado para ProcesoPersona.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "ProcesoPersona no encontrado para id_procesoPersona: " + idProcesoPersona, "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero válido en el campo de texto.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
