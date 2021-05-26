/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfd;

/**
 *
 * @author nacho
 */

import BD.Conexion;
import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
public class Principal extends javax.swing.JFrame {

    AltaContratacion altaCon;
    Contrataciones con;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Conexion.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContrataciones = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnNuevoTrabajo = new javax.swing.JButton();
        btnSerEve = new javax.swing.JButton();
        ifPane = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnContrataciones.setText("Contrataciones");
        btnContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratacionesActionPerformed(evt);
            }
        });

        jButton2.setText("Clientes y Empleados");

        btnNuevoTrabajo.setText("Nuevo trabajo");
        btnNuevoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTrabajoActionPerformed(evt);
            }
        });

        btnSerEve.setText("Servicios y eventos");

        ifPane.setVisible(true);

        javax.swing.GroupLayout ifPaneLayout = new javax.swing.GroupLayout(ifPane.getContentPane());
        ifPane.getContentPane().setLayout(ifPaneLayout);
        ifPaneLayout.setHorizontalGroup(
            ifPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        ifPaneLayout.setVerticalGroup(
            ifPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContrataciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(btnNuevoTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSerEve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ifPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContrataciones, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSerEve, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addComponent(ifPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTrabajoActionPerformed
        altaCon = new AltaContratacion();
        altaCon.setVisible(true);
        //jPanel1.removeAll();
        this.add(altaCon);
        ifPane.add(altaCon);
        ifPane.repaint();
        this.repaint();
        //jPanel1.setVisible(true);
        //jPanel1.repaint();
    }//GEN-LAST:event_btnNuevoTrabajoActionPerformed

    private void btnContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratacionesActionPerformed
        con = new Contrataciones();
        //con.setVisible(true);
        
        //jPanel1.removeAll();
        //jPanel1 = con;
        //jPanel1.setVisible(true);
        //jPanel1.repaint();
    }//GEN-LAST:event_btnContratacionesActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContrataciones;
    private javax.swing.JButton btnNuevoTrabajo;
    private javax.swing.JButton btnSerEve;
    private javax.swing.JInternalFrame ifPane;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
