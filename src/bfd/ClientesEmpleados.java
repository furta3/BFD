/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfd;

import BD.Conexion;
import Clases.Contratacion;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import Clases.Persona;
import Clases.Clientes;
import Clases.Empleado;
import java.sql.Statement;

/**
 *
 * @author Buri
 */
public class ClientesEmpleados extends javax.swing.JPanel {
    Principal main;
    /**
     * Creates new form ClientesEmpleados
     */
    public ClientesEmpleados(Principal main) {
        initComponents();
        this.main = main;
    }
    
        public void cargarClientes(){
           DefaultTableModel modelo = new DefaultTableModel();
           tClientesEmpleados.setModel(modelo);
           
           Iterator<Clientes> it = Conexion.getInstance().listaEspecies().iterator();
           
           //Iterator<Clientes> it = Conexion.getInstance().clienteDetallado().iterator();
           //modelo.setColumnIdentifiers(new Object[]{"Nombres", "Apellidos", "Telefono","Email","Direccion"});
           
           modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});
           try{
               while(it.hasNext()){
                   Persona p = it.next();
                   if(p.isVigente()){
                        Object[] fila = new Object[3];
                        fila[0] = p;
                        fila[1] = p.getTelefono();        
                        modelo.addRow(fila);   
                   }
               }
           }
           catch(Exception e){
               System.out.println(e);
           }
    }
        
    public void cargarEmpleados(){
           DefaultTableModel modelo = new DefaultTableModel();
           tClientesEmpleados.setModel(modelo);
           Iterator<Clientes> it = Conexion.getInstance().listaEmpleado().iterator();
           modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});
           try{
               while(it.hasNext()){
                   Persona p = it.next();
                   if(p.isVigente()){
                        Object[] fila = new Object[3];
                        fila[0] = p;
                        fila[1] = p.getTelefono();   
                        modelo.addRow(fila);
                   }
                   
               }
           }
           catch(Exception e){
               System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClientesEmpleados = new javax.swing.JTable();
        textbBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        botonClientes = new javax.swing.JRadioButton();
        botonEmpleados = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        tClientesEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tClientesEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClientesEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tClientesEmpleados);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        botonClientes.setForeground(new java.awt.Color(255, 255, 255));
        botonClientes.setText("Clientes");
        botonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonClientesMouseClicked(evt);
            }
        });
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        botonEmpleados.setText("Empleados");
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(textbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(botonClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEmpleados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonClientes)
                    .addComponent(botonEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        // TODO add your handling code here:
        cargarEmpleados();
        botonClientes.setSelected(false);
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void botonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMouseClicked
        // TODO add your handling code here:
        cargarClientes();
        botonEmpleados.setSelected(false);
        
    }//GEN-LAST:event_botonClientesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tClientesEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClientesEmpleadosMouseClicked
        // TODO add your handling code here:
        if(tClientesEmpleados.getSelectedRowCount()==1){
            if(botonClientes.isSelected()){
                DetallesCliente dtCli = new DetallesCliente(main,(Clientes) tClientesEmpleados.getValueAt(tClientesEmpleados.getSelectedRow(), 0));
                main.AbrirDetallesCliente(dtCli);
            }
            else{
                DetallesEmpleado dtEmp = new DetallesEmpleado(main,(Empleado) tClientesEmpleados.getValueAt(tClientesEmpleados.getSelectedRow(), 0));
                main.AbrirDetallesEmpleado(dtEmp);
            }
            
        }
    }//GEN-LAST:event_tClientesEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonClientes;
    private javax.swing.JRadioButton botonEmpleados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tClientesEmpleados;
    private javax.swing.JTextField textbBuscar;
    // End of variables declaration//GEN-END:variables
}
