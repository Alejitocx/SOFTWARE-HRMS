/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gestionrecursoshumanos.Vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author alejo
 */
public class Administradors extends javax.swing.JPanel {

    /**
     * Creates new form Administradors
     */
    public Administradors() {
        initComponents();
    }
    private void MostrarPaneles(JPanel p){
        p.setSize(1100, 834);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        appName1 = new javax.swing.JLabel();
        btn_lends2 = new javax.swing.JButton();
        btn_lends3 = new javax.swing.JButton();
        btn_lends4 = new javax.swing.JButton();
        btn_lends5 = new javax.swing.JButton();
        btn_lends6 = new javax.swing.JButton();
        btn_lends8 = new javax.swing.JButton();
        btn_lends7 = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(153, 153, 153));
        content.setForeground(new java.awt.Color(153, 153, 153));
        content.setMaximumSize(new java.awt.Dimension(100, 634));
        content.setMinimumSize(new java.awt.Dimension(100, 634));
        content.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        content.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1161, 816));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 634));
        jPanel2.setName(""); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/SKilgram.png"))); // NOI18N

        jLabel3.setText("jLabel3");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("¡Bienvenido a SkillStream!");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("\"SkillStream: Simplificando la gestión, potenciando el talento.\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(338, 338, 338))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(385, 385, 385))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(369, 369, 369))
        );

        content.add(jPanel2, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(165, 26, 26));
        menu.setForeground(new java.awt.Color(153, 153, 153));
        menu.setMaximumSize(new java.awt.Dimension(100, 634));
        menu.setMinimumSize(new java.awt.Dimension(100, 634));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        appName1.setBackground(new java.awt.Color(102, 0, 0));
        appName1.setForeground(new java.awt.Color(153, 0, 0));
        appName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/D1N.png"))); // NOI18N
        appName1.setToolTipText("");
        appName1.setMaximumSize(new java.awt.Dimension(20, 20));
        appName1.setMinimumSize(new java.awt.Dimension(20, 20));
        appName1.setPreferredSize(new java.awt.Dimension(624, 624));

        btn_lends2.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends2.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/reloj-circular.png"))); // NOI18N
        btn_lends2.setText("HORAS TRABAJADAS");
        btn_lends2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends2.setBorderPainted(false);
        btn_lends2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends2.setIconTextGap(13);
        btn_lends2.setInheritsPopupMenu(true);
        btn_lends2.setOpaque(false);
        btn_lends2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends2ActionPerformed(evt);
            }
        });

        btn_lends3.setBackground(new java.awt.Color(153, 0, 0));
        btn_lends3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends3.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/usuario.png"))); // NOI18N
        btn_lends3.setText("REGISTRO ASPIRANTE");
        btn_lends3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends3.setBorderPainted(false);
        btn_lends3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends3.setIconTextGap(13);
        btn_lends3.setInheritsPopupMenu(true);
        btn_lends3.setOpaque(false);
        btn_lends3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends3ActionPerformed(evt);
            }
        });

        btn_lends4.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends4.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/el-verano.png"))); // NOI18N
        btn_lends4.setText("SALIDA EMPLEADO");
        btn_lends4.setToolTipText("");
        btn_lends4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends4.setBorderPainted(false);
        btn_lends4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends4.setIconTextGap(13);
        btn_lends4.setInheritsPopupMenu(true);
        btn_lends4.setOpaque(false);
        btn_lends4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends4ActionPerformed(evt);
            }
        });

        btn_lends5.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends5.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends5.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/evaluacion.png"))); // NOI18N
        btn_lends5.setText("MODULO DE CALIFICACION ");
        btn_lends5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends5.setBorderPainted(false);
        btn_lends5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends5.setIconTextGap(13);
        btn_lends5.setInheritsPopupMenu(true);
        btn_lends5.setOpaque(false);
        btn_lends5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends5ActionPerformed(evt);
            }
        });

        btn_lends6.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends6.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends6.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/solicitud.png"))); // NOI18N
        btn_lends6.setText("PROCESO DE SELECCION");
        btn_lends6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends6.setBorderPainted(false);
        btn_lends6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends6.setIconTextGap(13);
        btn_lends6.setInheritsPopupMenu(true);
        btn_lends6.setOpaque(false);
        btn_lends6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends6ActionPerformed(evt);
            }
        });

        btn_lends8.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends8.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends8.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/presupuesto (1).png"))); // NOI18N
        btn_lends8.setText("NOMINA");
        btn_lends8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends8.setBorderPainted(false);
        btn_lends8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends8.setIconTextGap(13);
        btn_lends8.setInheritsPopupMenu(true);
        btn_lends8.setOpaque(false);
        btn_lends8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends8ActionPerformed(evt);
            }
        });

        btn_lends7.setBackground(new java.awt.Color(0, 0, 0));
        btn_lends7.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        btn_lends7.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionrecursoshumanos/Img/llave.png"))); // NOI18N
        btn_lends7.setText("FINALIZACION DE CONTRATO");
        btn_lends7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends7.setBorderPainted(false);
        btn_lends7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends7.setIconTextGap(13);
        btn_lends7.setInheritsPopupMenu(true);
        btn_lends7.setOpaque(false);
        btn_lends7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lends7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_lends3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lends2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lends4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lends6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lends5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(btn_lends8, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_lends7, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(appName1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(appName1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lends3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lends2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_lends4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lends5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_lends6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lends8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lends7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lends2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends2ActionPerformed
       AdminHoras p2 = new AdminHoras();
        MostrarPaneles(p2);
    }//GEN-LAST:event_btn_lends2ActionPerformed

    private void btn_lends3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends3ActionPerformed
      AdminCrear P1 = new AdminCrear();
        MostrarPaneles(P1);
    }//GEN-LAST:event_btn_lends3ActionPerformed

    private void btn_lends4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends4ActionPerformed
        AdminSalida P3 = new AdminSalida();
        MostrarPaneles(P3);    }//GEN-LAST:event_btn_lends4ActionPerformed

    private void btn_lends5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends5ActionPerformed
        AdminCali P4 = new AdminCali();
        MostrarPaneles(P4); 
    }//GEN-LAST:event_btn_lends5ActionPerformed

    private void btn_lends6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends6ActionPerformed
        AdminSelec P5 = new AdminSelec();
        MostrarPaneles(P5); 
    }//GEN-LAST:event_btn_lends6ActionPerformed

    private void btn_lends8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends8ActionPerformed
        AdminNomi P6 = new AdminNomi();
        MostrarPaneles(P6);
    }//GEN-LAST:event_btn_lends8ActionPerformed

    private void btn_lends7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lends7ActionPerformed
       AdminFinali P7 = new AdminFinali();
       MostrarPaneles(P7);
    }//GEN-LAST:event_btn_lends7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName1;
    private javax.swing.JButton btn_lends2;
    private javax.swing.JButton btn_lends3;
    private javax.swing.JButton btn_lends4;
    private javax.swing.JButton btn_lends5;
    private javax.swing.JButton btn_lends6;
    private javax.swing.JButton btn_lends7;
    private javax.swing.JButton btn_lends8;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}