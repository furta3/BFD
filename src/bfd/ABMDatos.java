
package bfd;

import BD.Conexion;
import Clases.Evento;
import Clases.Localidad;
import java.util.List;
import javax.swing.DefaultListModel;

public class ABMDatos extends javax.swing.JPanel {

    List<Localidad> loc;
    List<Evento> evn;
    public ABMDatos() {
        initComponents();
        if(cbOpcion.getSelectedIndex()==0)
            cargarLocalidades();
        else
            cargarEventos();
    }
    
    public void cargarEventos(){
        evn = Conexion.getInstance().getEventos();
        DefaultListModel dlm = new DefaultListModel();
        dlm.clear();
        for(Evento evento: evn){
            if(evento.isVigente())
                dlm.addElement(evento);
        }
        jLista.setModel(dlm);
    }
    public void cargarLocalidades(){
        loc = Conexion.getInstance().getLocalidades();
        DefaultListModel dlm = new DefaultListModel();
        dlm.clear();
        for(Localidad localidad: loc){
            if(localidad.isVigente())
                dlm.addElement(localidad);
        }
        jLista.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        cbOpcion = new javax.swing.JComboBox<>();
        tfNuevo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jLista);

        cbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Localidades", "Eventos" }));
        cbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcionActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nuevo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNuevo)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOpcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(tfNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcionActionPerformed
        // TODO add your handling code here:
        if(cbOpcion.getSelectedIndex()==0)
            cargarLocalidades();
        else
            cargarEventos();
    }//GEN-LAST:event_cbOpcionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(!tfNuevo.getText().equals("")){
            if(cbOpcion.getSelectedIndex()==0){
               Conexion.getInstance().persist(new Localidad(tfNuevo.getText(),true));
               cargarLocalidades();
            } 
            else{
                Conexion.getInstance().persist(new Evento(tfNuevo.getText(),true));
                cargarEventos();
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(jLista.getSelectedIndex()>=0){
            if(cbOpcion.getSelectedIndex()==0){
                //System.out.println("localidad = "+jLista.getSelectedValue());
                Localidad l = (Localidad) jLista.getSelectedValue();
                l.setVigente(false);
                Conexion.getInstance().merge(l);
                cargarLocalidades();
            }
            else{
                //System.out.println("evento = "+ (String) jLista.getSelectedValue());
                Evento e = (Evento) jLista.getSelectedValue();
                e.setVigente(false);
                Conexion.getInstance().merge(e);
                cargarEventos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Object> jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfNuevo;
    // End of variables declaration//GEN-END:variables
}
