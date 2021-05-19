
package bfd;

import BD.Conexion;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import Clases.Contratacion;
import java.text.SimpleDateFormat;

public class Contrataciones extends javax.swing.JPanel {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Contrataciones() {
        initComponents();
        CargarContrataciones();
    }
    
    public void CargarContrataciones(){
        Iterator<Contratacion> it = Conexion.getInstance().getContrataciones().iterator();
                DefaultTableModel mdl = (DefaultTableModel) tContrataciones.getModel();
                while (it.hasNext()) {
                    Contratacion c = it.next();
                    //if (c.isActivo()) {  los booleanos van en la consulata de mwsql
                        Object[] fila = new Object[5];
                        fila[0] = sdf.format(c.getFecha());
                        fila[1] = c.getCliente().getApellido();
                        fila[2] = c.getCantPersonas();
                        fila[3] = c.getPresupuesto();
                        fila[4] = c;
                        mdl.addRow(fila);
                    //}
                }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tContrataciones = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 400));

        tContrataciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cliente", "Personas", "Presupuesto", "Descripción"
            }
        ));
        tContrataciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tContratacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tContrataciones);

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tContratacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tContratacionesMouseClicked

        Contratacion con = new Contratacion();
        
    }//GEN-LAST:event_tContratacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tContrataciones;
    // End of variables declaration//GEN-END:variables
}
