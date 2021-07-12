
package bfd;

import BD.Conexion;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import Clases.Contratacion;
import java.text.SimpleDateFormat;

public class Contrataciones extends javax.swing.JPanel {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Principal main;
    public Contrataciones(Principal main) {
        initComponents();
        CargarContrataciones();
        this.main = main;
    }
    
    public void CargarContrataciones(){
        Iterator<Contratacion> it = Conexion.getInstance().getContrataciones().iterator();
        DefaultTableModel mdl = (DefaultTableModel) tContrataciones.getModel();
        while (it.hasNext()) {
            Contratacion c = it.next();
            if (c.isVigente()) {  
                Object[] fila = new Object[5];
                fila[0] = sdf.format(c.getFecha());
                fila[1] = c.getCliente();
                fila[2] = c.getCantPersonas();
                fila[3] = c.getPresupuesto();
                fila[4] = c;
                mdl.addRow(fila); 
            }
        }
        
    }
    public void buscarContrataciones(String buscar){
        if(buscar!=null){
            Iterator<Contratacion> it = Conexion.getInstance().getContrataciones().iterator();
            DefaultTableModel mdl = (DefaultTableModel) tContrataciones.getModel();
            mdl.setRowCount(0);
            while (it.hasNext()) {
                Contratacion c = it.next();
                if (c.isVigente() && (
                        c.getCliente().getNombre().contains(buscar) || 
                        c.getCliente().getApellido().contains(buscar) ||
                        c.getFecha().toString().contains(buscar) ||
                        c.getDescripcion().contains(buscar)
                        )) {  
                    Object[] fila = new Object[5];
                    fila[0] = sdf.format(c.getFecha());
                    fila[1] = c.getCliente();
                    fila[2] = c.getCantPersonas();
                    fila[3] = c.getPresupuesto();
                    fila[4] = c;
                    mdl.addRow(fila); 
                }
            }
        }
        else{
            CargarContrataciones();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tContrataciones = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        tContrataciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cliente", "Personas", "Presupuesto", "Descripción"
            }
        ));
        tContrataciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tContratacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tContrataciones);
        if (tContrataciones.getColumnModel().getColumnCount() > 0) {
            tContrataciones.getColumnModel().getColumn(4).setMinWidth(150);
        }

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnBuscar.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Contrataciones.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarContrataciones(tfBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
        buscarContrataciones(tfBuscar.getText());
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void tContratacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tContratacionesMousePressed
        // TODO add your handling code here:
        if(tContrataciones.getSelectedRowCount()==1){
            GUIContratacion con = new GUIContratacion(main,(Contratacion) tContrataciones.getValueAt(tContrataciones.getSelectedRow(), 4));
            main.AbrirContratacion(con);
        }
    }//GEN-LAST:event_tContratacionesMousePressed

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
        // TODO add your handling code here:
        buscarContrataciones(tfBuscar.getText());
    }//GEN-LAST:event_tfBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tContrataciones;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
