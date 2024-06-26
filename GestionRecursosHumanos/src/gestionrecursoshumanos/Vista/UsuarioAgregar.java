/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestionrecursoshumanos.Vista;

import gestionrecursoshumanos.Modelo.Contrato;
import gestionrecursoshumanos.Modelo.ContratoDao;
import gestionrecursoshumanos.Modelo.HorasTrabajadas;
import gestionrecursoshumanos.Modelo.HorasTrabajadasDAO;
import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alejo
 */
public class UsuarioAgregar extends javax.swing.JPanel {

    /**
     * Creates new form UsuarioAgregar
     */
    public UsuarioAgregar() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtCONT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtHoras = new javax.swing.JTextField();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 817));
        jPanel4.setMinimumSize(new java.awt.Dimension(1000, 817));
        jPanel4.setRequestFocusEnabled(false);

        jLabel22.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR LAS HORAS TRABAJADAS");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR HORAS LABORADAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtCONT.setBackground(new java.awt.Color(255, 255, 255));
        TxtCONT.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtCONT.setForeground(new java.awt.Color(0, 0, 0));
        TxtCONT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCONTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESE EL NUMERO DE CONTRATO:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INGRESE HORAS TOTALES DE TRABAJO DIARIO:");
        jLabel5.setToolTipText("");

        TxtHoras.setBackground(new java.awt.Color(255, 255, 255));
        TxtHoras.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        TxtHoras.setForeground(new java.awt.Color(0, 0, 0));
        TxtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCONT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(177, 177, 177))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCONT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener el ID del contrato ingresado por el usuario en el JTextField
        String idContratoStr = TxtCONT.getText().trim();
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
        String horasStr = TxtHoras.getText().trim();
        if (horasStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el número de horas trabajadas.");
            return;
        }
        int horas;
        try {
            horas = Integer.parseInt(horasStr);
            if (horas <= 0 || horas > 8) {
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

    private void TxtCONTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCONTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCONTActionPerformed

    private void TxtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHorasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCONT;
    private javax.swing.JTextField TxtHoras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
