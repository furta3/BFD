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
import Clases.Contratacion;
import Clases.Trabajo;
import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
public class Principal extends javax.swing.JFrame {

    
    static AltaContratacion altaCon;
    static Contrataciones contrataciones;
    static GUIContratacion con;
    static Trabajos trabajo;
    static Contratacion contra;
    static Principal padre;
    static AltaTrabajo at;
    static DetallesCliente dtCli;
    static DetallesEmpleado dtEmp;

    static ClientesEmpleados clientEmp;
    //AltaContratacion altaCon;
    //Contrataciones con;

    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Conexion.getInstance();
        this.padre = this;
        ImageIcon icono = new ImageIcon("src/Images/ico.png");
        this.setIconImage(icono.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        btnNuevoTrabajo = new javax.swing.JButton();
        btnContrataciones = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSerEveLoc = new javax.swing.JButton();
        iconoBFD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buriano Fotograía Digital");
        setBackground(new java.awt.Color(36, 36, 36));
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));

        btnNuevoTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/p_botonNuevaContratacion.png"))); // NOI18N
        btnNuevoTrabajo.setBorder(null);
        btnNuevoTrabajo.setBorderPainted(false);
        btnNuevoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTrabajoActionPerformed(evt);
            }
        });

        btnContrataciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonContrataciones.png"))); // NOI18N
        btnContrataciones.setBorder(null);
        btnContrataciones.setBorderPainted(false);
        btnContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratacionesActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonClienteEmp.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSerEveLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/p_botonEventosServicios_1.png"))); // NOI18N
        btnSerEveLoc.setBorder(null);
        btnSerEveLoc.setBorderPainted(false);
        btnSerEveLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerEveLocActionPerformed(evt);
            }
        });

        iconoBFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iconoBFD)
                        .addGap(26, 26, 26))
                    .addComponent(btnSerEveLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContrataciones, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(iconoBFD)
                .addGap(31, 31, 31)
                .addComponent(btnNuevoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContrataciones, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSerEveLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTrabajoActionPerformed
        altaCon = new AltaContratacion(this);
        altaCon.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(altaCon);
        //jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_btnNuevoTrabajoActionPerformed

    private void btnContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratacionesActionPerformed
        AbrirContrataciones(new Contrataciones(this));
    }//GEN-LAST:event_btnContratacionesActionPerformed

    private void btnSerEveLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerEveLocActionPerformed
        // TODO add your handling code here:
        ABMDatos d = new ABMDatos();
        jPanel1.removeAll();
        jPanel1.add(d);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_btnSerEveLocActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        clientEmp = new ClientesEmpleados(this);
        clientEmp.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(clientEmp);
        jPanel1.repaint();
        jPanel1.revalidate();

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void AbrirClientesEmpleados(ClientesEmpleados ce){
        clientEmp = ce;
        clientEmp.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(clientEmp);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    public static void AbrirTrabajo(Trabajos tra){
        trabajo = tra;//tra
        trabajo.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(trabajo);
        jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirDetallesCliente(DetallesCliente dtCl){
        dtCli = dtCl;
        dtCli.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(dtCli);
        jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirDetallesEmpleado(DetallesEmpleado dtEm){
        dtEmp = dtEm;
        jPanel1.removeAll();
        jPanel1.add(dtEmp);
        jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    public static void AbrirAltaTrabajo(AltaTrabajo altTra){
        at =  altTra;
        jPanel1.removeAll();
        jPanel1.add(at);
        jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirContratacion(GUIContratacion contra){
        con = contra;
        con.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(con);
        jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirContrataciones(Contrataciones ctras){
        contrataciones = ctras;
        contrataciones.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(contrataciones);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    
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
    private javax.swing.JButton btnSerEveLoc;
    private javax.swing.JLabel iconoBFD;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
