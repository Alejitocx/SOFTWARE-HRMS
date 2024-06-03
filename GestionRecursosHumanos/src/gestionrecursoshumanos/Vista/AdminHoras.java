/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestionrecursoshumanos.Vista;

import gestionrecursoshumanos.Modelo.Contrato;
import gestionrecursoshumanos.Modelo.ContratoDao;
import gestionrecursoshumanos.Modelo.Evaluacion;
import gestionrecursoshumanos.Modelo.EvaluacionDao;
import gestionrecursoshumanos.Modelo.HorasTrabajadas;
import gestionrecursoshumanos.Modelo.HorasTrabajadasDAO;
import gestionrecursoshumanos.Vista.AdminSalida.NonEditableTableModel;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alejo
 */
public class AdminHoras extends javax.swing.JPanel {
 
    /**
     * Creates new form AdminHoras
     */
    public AdminHoras() {
        initComponents();
    }
       private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtCON = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtH1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtCONT1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtHoras1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXTIDH = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1097, 817));
        jPanel2.setMinimumSize(new java.awt.Dimension(1097, 817));

        jLabel3.setText("jLabel3");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR HORAS LABORADAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INSPECCION DE HORAS LABORADAS");

        TxtCON.setBackground(new java.awt.Color(255, 255, 255));
        TxtCON.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtCON.setForeground(new java.awt.Color(0, 0, 0));
        TxtCON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCONActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRATO:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INGRESE HORAS TOTALES DE TRABAJO DIARIO:");
        jLabel5.setToolTipText("");

        TxtH1.setBackground(new java.awt.Color(255, 255, 255));
        TxtH1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtH1.setForeground(new java.awt.Color(0, 0, 0));
        TxtH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtH1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID DE LA HORA", "CONTRATO", "HORAS DIARIAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INSERCION DE HORAS LABORADAS");

        jButton2.setText("LLENAR TABLA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INGRESE EL NUMERO DE CONTRATO:");
        jLabel6.setToolTipText("");

        TxtCONT1.setBackground(new java.awt.Color(255, 255, 255));
        TxtCONT1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtCONT1.setForeground(new java.awt.Color(0, 0, 0));
        TxtCONT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCONT1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText(" HORAS TOTALES DE TRABAJO");
        jLabel9.setToolTipText("");

        TxtHoras1.setBackground(new java.awt.Color(255, 255, 255));
        TxtHoras1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtHoras1.setForeground(new java.awt.Color(0, 0, 0));
        TxtHoras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoras1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID DE HORA");
        jLabel10.setToolTipText("");

        TXTIDH.setBackground(new java.awt.Color(255, 255, 255));
        TXTIDH.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TXTIDH.setForeground(new java.awt.Color(0, 0, 0));
        TXTIDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDHActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("EDITAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(190, 190, 190)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(TXTIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(TxtCON, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(121, 121, 121)
                            .addComponent(TxtH1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(599, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(504, Short.MAX_VALUE)
                    .addComponent(TxtCONT1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(425, 425, 425)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(504, Short.MAX_VALUE)
                    .addComponent(TxtHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(450, 450, 450)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(654, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(TxtCONT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(661, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(TxtHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(588, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Obtener el ID del contrato ingresado por el usuario en el JTextField
String idContratoStr = TxtCON.getText().trim();
if (idContratoStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID para el contrato.");
    return;
}
int idContrato;
try {
    idContrato = Integer.parseInt(idContratoStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el ID del contrato.");
    return;
}

// Verificar si el contrato existe en la base de datos
ContratoDao contratoDao = new ContratoDao();
Contrato contrato = contratoDao.buscarConvenioPorId(idContrato);
if (contrato == null) {
    JOptionPane.showMessageDialog(null, "El contrato no fue encontrado en la base de datos.");
    return;
}

// Obtener el número de horas ingresado por el usuario
String horasStr = TxtH1.getText().trim();
if (horasStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese el número de horas trabajadas.");
    return;
}
int horas;
try {
    horas = Integer.parseInt(horasStr);
    if (horas <= 0 || horas > 12) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido de horas (entre 1 y 12).");
        return;
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para las horas trabajadas.");
    return;
}

// Generar un valor aleatorio para id_horasTrabajadas
Random rand = new Random();
int idHorasTrabajadas = rand.nextInt(Integer.MAX_VALUE);

// Crear objeto HorasTrabajadas y realizar la inserción en la base de datos
HorasTrabajadas horasTrabajadas = new HorasTrabajadas(idHorasTrabajadas,contrato,horas);
HorasTrabajadasDAO horasTrabajadasDao = new HorasTrabajadasDAO();
horasTrabajadasDao.insert(horasTrabajadas);
JOptionPane.showMessageDialog(null, "HORAS AGREGADAS CORRECTAMENTE");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtCONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCONActionPerformed

    private void TxtH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtH1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   // Obtener todas las horas trabajadas
List<HorasTrabajadas> horasTrabajadasList = new HorasTrabajadasDAO().getAll();

// Verificar si hay horas trabajadas
if (horasTrabajadasList.isEmpty()) {
    JOptionPane.showMessageDialog(null, "No se encontraron horas trabajadas.");
} else {
    // Convertir la lista de horas trabajadas a un formato adecuado para JTable
    String[] columnNames = {"ID Horas Trabajadas", "Horas Totales", "ID Contrato"};
    Object[][] data = new Object[horasTrabajadasList.size()][3];
    for (int i = 0; i < horasTrabajadasList.size(); i++) {
        HorasTrabajadas horasTrabajadas = horasTrabajadasList.get(i);
        data[i][0] = horasTrabajadas.getIdHorasTrabajadas();
        data[i][1] = horasTrabajadas.getHorasTotales();
        data[i][2] = horasTrabajadas.getContrato().getIdContrato();
    }
    // Crear el modelo de la tabla no editable y actualizar el JTable
    DefaultTableModel model = new DefaultTableModel(data, columnNames) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas sean no editables
        }
    };
    jTable1.setModel(model);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtCONT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCONT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCONT1ActionPerformed

    private void TxtHoras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoras1ActionPerformed

    private void TXTIDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDHActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String idHorasTrabajadasStr = TXTIDH.getText().trim();
        String idContratoStr = TxtCON.getText().trim();
        String horasTotalesStr = TxtH1.getText().trim();

        if (!isNumeric(idHorasTrabajadasStr) || !isNumeric(idContratoStr) || !isNumeric(horasTotalesStr)) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser números válidos.");
            return;
        }

        int idHorasTrabajadas = Integer.parseInt(idHorasTrabajadasStr);
        int idContrato = Integer.parseInt(idContratoStr);
        int horasTotales = Integer.parseInt(horasTotalesStr);

        // Buscar si existen los registros
        HorasTrabajadasDAO horasTrabajadasDAO = new HorasTrabajadasDAO();
        HorasTrabajadas horasTrabajadas = horasTrabajadasDAO.findById(idHorasTrabajadas);

        if (horasTrabajadas != null) {
            // Actualizar los datos
            ContratoDao contratoDAO = new ContratoDao();
            Contrato contrato = contratoDAO.buscarConvenioPorId(idContrato);
            if (contrato != null) {
                horasTrabajadas.setHorasTotales(horasTotales);
                horasTrabajadas.setContrato(contrato);
                horasTrabajadasDAO.update(horasTrabajadas);
            } else {
                JOptionPane.showMessageDialog(null, "Contrato no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Horas Trabajadas no encontradas.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTIDH;
    private javax.swing.JTextField TxtCON;
    private javax.swing.JTextField TxtCONT1;
    private javax.swing.JTextField TxtH1;
    private javax.swing.JTextField TxtHoras1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
