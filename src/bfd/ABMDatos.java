
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
        loc = Conexion.getInstance().getLocalidades();
        evn = Conexion.getInstance().getEventos();
        if(cbOpcion.getSelectedIndex()==0)
            cargarLocalidades();
        else
            cargarEventos();
    }
    
    public void cargarEventos(){
        Conexion.getInstance().refresh(evn);
        DefaultListModel dlm = new DefaultListModel();
        dlm.clear();
        for(Evento evento: evn){
            dlm.addElement(evento);
        }
        jLista.setModel(dlm);
    }
    public void cargarLocalidades(){
        Conexion.getInstance().refresh(loc);
        DefaultListModel dlm = new DefaultListModel();
        dlm.clear();
        for(Localidad localidad: loc){
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

        jLabel1.setText("Nuevo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNuevo)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbOpcion, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(32, Short.MAX_VALUE))
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
            if(cbOpcion.getSelectedIndex()==0)
                Conexion.getInstance().persist(new Localidad(tfNuevo.getText(),true));
            else
                Conexion.getInstance().persist(new Evento(tfNuevo.getText(),true));
        }

    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfNuevo;
    // End of variables declaration//GEN-END:variables
}
