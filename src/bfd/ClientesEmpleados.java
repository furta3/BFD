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
import javax.swing.table.TableColumnModel;

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
        
        btnAgregarClientes.setSelected(true);
        btnAgregarEmpleados.setSelected(false);
        botonClientes.setSelected(true);
        botonEmpleados.setSelected(false);
        
        txtNombre.setText("Nombre");
        txtApellido.setText("Apellido");
        txtTelefono.setText("Telefono");
        txtDireccion.setText("Direccion");
        txtEmail.setText("Email");
        
        cargarClientes();
    }
    
        public void cargarClientes(){
           DefaultTableModel modelo = new DefaultTableModel();
           tClientesEmpleados.setModel(modelo);
           
           Iterator<Clientes> it = Conexion.getInstance().getClientes().iterator();
           
           modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});
           try{
               while(it.hasNext()){
                   Persona p = it.next();
                   if(p.isVigente()){
                        Object[] fila = new Object[2];
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
           Iterator<Empleado> it = Conexion.getInstance().listaEmpleado().iterator();
           modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});
           
               while(it.hasNext()){
                   System.out.println("en el while");
                   Persona p = it.next();
                   if(p.isVigente()){
                        Object[] fila = new Object[2];
                        fila[0] = p;
                        fila[1] = p.getTelefono();   
                        modelo.addRow(fila);
                   }
                   
               }

    }  
    
    public void cargarClientesDetallado(){
        reiniciarJTable(tClientesEmpleados);
        String textoBuscar = textbBuscar.getText().toString();
        
        DefaultTableModel modelo = new DefaultTableModel();
        tClientesEmpleados.setModel(modelo);
        Clientes cli2 = new Clientes();
        Iterator<Clientes> it = Conexion.getInstance().getClientes().iterator();
        modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});

           try{
               while(it.hasNext()){
                   Persona p = it.next();
                   
                   if(p.toString().contains(textoBuscar)){
                       
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
    
    public void cargarEmpleadosDetallado(){
        String textoBuscar = textbBuscar.getText().toString();
        
        DefaultTableModel modelo = new DefaultTableModel();
        tClientesEmpleados.setModel(modelo);
        Iterator<Empleado> it = Conexion.getInstance().getEmpleados().iterator();
        modelo.setColumnIdentifiers(new Object[]{"Nombre y Apellido", "Telefono"});

           try{
               while(it.hasNext()){
                   Persona p = it.next();
                   
                   if(p.toString().contains(textoBuscar)){
                       
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
    
    public static void reiniciarJTable(javax.swing.JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = Tabla.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClientesEmpleados = new javax.swing.JTable();
        textbBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        botonClientes = new javax.swing.JRadioButton();
        botonEmpleados = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAgregarEmpleados = new javax.swing.JRadioButton();
        btnAgregarClientes = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tClientesEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tClientesEmpleados);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botonAceptar-2.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonClientes);
        botonClientes.setForeground(new java.awt.Color(255, 255, 255));
        botonClientes.setContentAreaFilled(false);
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

        buttonGroup1.add(botonEmpleados);
        botonEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        botonEmpleados.setContentAreaFilled(false);
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botonAceptar-1.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        buttonGroup2.add(btnAgregarEmpleados);
        btnAgregarEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleados.setContentAreaFilled(false);
        btnAgregarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadosMouseClicked(evt);
            }
        });
        btnAgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadosActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnAgregarClientes);
        btnAgregarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarClientes.setContentAreaFilled(false);
        btnAgregarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarClientesMouseClicked(evt);
            }
        });
        btnAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClientesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tCliente.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tEmpleado.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar una persona.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tClientes.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tEmpleados.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Línea 1.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ClientesYEmpleados.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEmpleados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregarEmpleados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(105, 105, 105))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnAgregarClientes)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtApellido)
                                                .addComponent(txtNombre)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(38, 38, 38)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(110, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar)
                            .addComponent(textbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonClientes)
                                .addComponent(botonEmpleados)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnAgregar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarClientes)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarEmpleados)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        // TODO add your handling code here:
        cargarClientes();
        botonEmpleados.setSelected(false);
        
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        // TODO add your handling code here:
        cargarEmpleados();
        botonClientes.setSelected(false);
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void botonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_botonClientesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(botonClientes.isSelected()){
            cargarClientesDetallado();
        }
        else if(botonEmpleados.isSelected()){
            cargarEmpleadosDetallado();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(btnAgregarClientes.isSelected()){
            Clientes cli = new Clientes();
        
            cli.setNombre(txtNombre.getText());
            cli.setApellido(txtApellido.getText());
            cli.setTelefono(txtTelefono.getText());
            cli.setDir(txtDireccion.getText());
            cli.setEmail(txtEmail.getText());
            cli.setVigente(true);
            Conexion.getInstance().persist(cli);

            txtNombre.setText("Nombre");
            txtApellido.setText("Apellido");
            txtTelefono.setText("Telefono");
            txtDireccion.setText("Direccion");
            txtEmail.setText("Email");
            cargarClientes();
            btnAgregarClientes.setSelected(true);
            btnAgregarEmpleados.setSelected(false);
            botonClientes.setSelected(true);
            botonEmpleados.setSelected(false);
        }
        else if(btnAgregarEmpleados.isSelected()){
            Empleado emp = new Empleado();  

            emp.setNombre(txtNombre.getText());
            emp.setApellido(txtApellido.getText());
            emp.setTelefono(txtTelefono.getText());
            emp.setVigente(true);
            Conexion.getInstance().persist(emp);

            txtNombre.setText("Nombre");
            txtApellido.setText("Apellido");
            txtTelefono.setText("Telefono");
            txtDireccion.setText("Direccion");
            txtEmail.setText("Email");
            cargarEmpleados();
            btnAgregarClientes.setSelected(false);
            btnAgregarEmpleados.setSelected(true);
            botonClientes.setSelected(false);
            botonEmpleados.setSelected(true);
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadosActionPerformed
        // TODO add your handling code here:
                btnAgregarClientes.setSelected(false);
       
        txtDireccion.setText("");
        txtEmail.setText("");
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_btnAgregarEmpleadosActionPerformed

    private void btnAgregarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClientesMouseClicked
        // TODO add your handling code here:
        btnAgregarEmpleados.setSelected(false);
       
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
          
        txtNombre.setText("Nombre");
        txtApellido.setText("Apellido");
        txtTelefono.setText("Telefono");
        txtDireccion.setText("Direccion");
        txtEmail.setText("Email");
    }//GEN-LAST:event_btnAgregarClientesMouseClicked

    private void btnAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClientesActionPerformed
        // TODO add your handling code here:
        
   
    }//GEN-LAST:event_btnAgregarClientesActionPerformed

    private void btnAgregarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAgregarEmpleadosMouseClicked

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        if(txtNombre.getText().trim().equals("Nombre")){
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if(txtNombre.getText().trim().equals("")){
            txtNombre.setText("Nombre");
        }
    }//GEN-LAST:event_txtNombreFocusLost

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


    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        if(txtDireccion.getText().trim().equals("Direccion")){
            txtDireccion.setText("");
        }
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        // TODO add your handling code here:
          if(txtDireccion.getText().trim().equals("")){
            txtDireccion.setText("Direccion");
        }
        
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        // TODO add your handling code here:
         if(txtApellido.getText().trim().equals("Apellido")){
            txtApellido.setText("");
        }
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        // TODO add your handling code here:
         if(txtApellido.getText().trim().equals("")){
            txtApellido.setText("Apellido");
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        // TODO add your handling code here:
          if(txtTelefono.getText().trim().equals("Telefono")){
            txtTelefono.setText("");
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        // TODO add your handling code here:
        if(txtTelefono.getText().trim().equals("")){
            txtTelefono.setText("Telefono");
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained

        if(txtEmail.getText().trim().equals("Email")){
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().trim().equals("")){
            txtEmail.setText("Email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void tClientesEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClientesEmpleadosMousePressed
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
    }//GEN-LAST:event_tClientesEmpleadosMousePressed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonClientes;
    private javax.swing.JRadioButton botonEmpleados;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnAgregarClientes;
    private javax.swing.JRadioButton btnAgregarEmpleados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tClientesEmpleados;
    private javax.swing.JTextField textbBuscar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
