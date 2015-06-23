
package Ventanas;

import LinkedListImplementation.MyLinkedList;
import boutiquetrapitos.ClaseProveedores;
import javax.swing.JOptionPane;


public class VentanaProveedores extends javax.swing.JInternalFrame {

   
    public VentanaProveedores() {
        initComponents();
    }
    
    int sw = 0;
    
    MyLinkedList<ClaseProveedores> ListaProveedores = new MyLinkedList<ClaseProveedores>();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNit = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNomContac = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDirOficina = new javax.swing.JLabel();
        lblCorreoContac = new javax.swing.JLabel();
        lblTelContac = new javax.swing.JLabel();
        lblCelContac = new javax.swing.JLabel();
        TextoNit = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JTextField();
        TextoFax = new javax.swing.JTextField();
        TextoTelefono = new javax.swing.JTextField();
        TextoNomContac = new javax.swing.JTextField();
        TextoTelContac = new javax.swing.JTextField();
        TextoCelContac = new javax.swing.JTextField();
        TextoOficina = new javax.swing.JTextField();
        TextoCorreoContac = new javax.swing.JTextField();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Proveedores");

        lblNit.setText("Nit. de la empresa:*");
        lblNit.setEnabled(false);

        lblNombre.setText("Nombre:*");
        lblNombre.setEnabled(false);

        lblDireccion.setText("Dirección:*");
        lblDireccion.setEnabled(false);

        lblTelefono.setText("Teléfono:*");
        lblTelefono.setEnabled(false);

        lblNomContac.setText("Nombre:*");
        lblNomContac.setEnabled(false);

        lblFax.setText("Fax:");
        lblFax.setEnabled(false);

        lblCorreo.setText("Correo:*");
        lblCorreo.setEnabled(false);

        jLabel8.setText("Información del contacto:");
        jLabel8.setEnabled(false);

        lblDirOficina.setText("Oficina:*");
        lblDirOficina.setEnabled(false);

        lblCorreoContac.setText("Correo:*");
        lblCorreoContac.setEnabled(false);

        lblTelContac.setText("Teléfono:");
        lblTelContac.setEnabled(false);

        lblCelContac.setText("Celular:*");
        lblCelContac.setEnabled(false);

        TextoNit.setEnabled(false);

        TextoNombre.setEnabled(false);

        TextoDireccion.setEnabled(false);

        TextoCorreo.setEnabled(false);

        TextoFax.setEnabled(false);

        TextoTelefono.setEnabled(false);

        TextoNomContac.setEnabled(false);

        TextoTelContac.setEnabled(false);

        TextoCelContac.setEnabled(false);

        TextoOficina.setEnabled(false);

        TextoCorreoContac.setEnabled(false);

        BotonAnterior.setText("Anterior");

        BotonSiguiente.setText("Siguiente");

        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.setEnabled(false);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.setEnabled(false);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNit)
                                .addComponent(lblDireccion)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(lblNomContac, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoNit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lblNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(lblCelContac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoCelContac, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextoDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextoCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                    .addComponent(lblFax)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextoFax, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonModificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCorreoContac, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(lblDirOficina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoOficina, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(TextoCorreoContac)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblTelContac, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoNomContac, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTelContac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(TextoNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFax))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNomContac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomContac))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelContac)
                            .addComponent(TextoTelContac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoCelContac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelContac))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDirOficina)
                    .addComponent(TextoOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoContac)
                    .addComponent(TextoCorreoContac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAnterior)
                    .addComponent(BotonSiguiente)
                    .addComponent(BotonCrear)
                    .addComponent(BotonModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonBorrar)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        //Habilitar campos de texto
        TextoNit.setEnabled(true);
        TextoNombre.setEnabled(true);
        TextoDireccion.setEnabled(true);
        TextoTelefono.setEnabled(true);
        TextoFax.setEnabled(true);
        TextoCorreo.setEnabled(true);
        TextoNomContac.setEnabled(true);
        TextoTelContac.setEnabled(true);
        TextoCelContac.setEnabled(true);
        TextoOficina.setEnabled(true);
        TextoCorreoContac.setEnabled(true);
        

        //ponerlos en blanco
        TextoNit.setText("");
        TextoNombre.setText("");
        TextoDireccion.setText("");
        TextoTelefono.setText("");
        TextoFax.setText("");
        TextoCorreo.setText("");
        TextoNomContac.setText("");
        TextoTelContac.setText("");
        TextoCelContac.setText("");
        TextoOficina.setText("");
        TextoCorreoContac.setText("");
       
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);
        
        
        
        TextoNit.requestFocusInWindow();
        
        sw = 1;
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        //Habilitar campos de texto
        TextoNit.setEnabled(true);
        TextoNombre.setEnabled(true);
        TextoDireccion.setEnabled(true);
        TextoTelefono.setEnabled(true);
        TextoFax.setEnabled(true);
        TextoCorreo.setEnabled(true);
        TextoNomContac.setEnabled(true);
        TextoTelContac.setEnabled(true);
        TextoCelContac.setEnabled(true);
        TextoOficina.setEnabled(true);
        TextoCorreoContac.setEnabled(true);
        
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);
        
        sw = 0;
        
        TextoNit.requestFocusInWindow();
        
        
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        
        if(TextoNit.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un Nit." );
            TextoNit.requestFocusInWindow();
            return; 
        }
        
        if(TextoNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un Nombre" );
            TextoNombre.requestFocusInWindow();
            return; 
        }
        if(TextoDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una dirección" );
            TextoDireccion.requestFocusInWindow();
            return; 
        }
        if(TextoTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un telefono" );
            TextoTelefono.requestFocusInWindow();
            return; 
        }
        if(TextoCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un Correo" );
            TextoCorreo.requestFocusInWindow();
            return; 
        }
        if(TextoNomContac.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un nombre de contacto" );
            TextoNomContac.requestFocusInWindow();
            return; 
        }
        if(TextoCelContac.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un celular de contacto" );
            TextoCelContac.requestFocusInWindow();
            return; 
        }
        if(TextoOficina.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una oficina de contacto" );
            TextoOficina.requestFocusInWindow();
            return; 
        }
        if(TextoCorreoContac.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un correo de contacto" );
            TextoCorreoContac.requestFocusInWindow();
            return; 
        }
        
        TextoNit.setEnabled(false);
        TextoNombre.setEnabled(false);
        TextoDireccion.setEnabled(false);
        TextoTelefono.setEnabled(false);
        TextoFax.setEnabled(false);
        TextoCorreo.setEnabled(false);
        TextoNomContac.setEnabled(false);
        TextoTelContac.setEnabled(false);
        TextoCelContac.setEnabled(false);
        TextoOficina.setEnabled(false);
        TextoCorreoContac.setEnabled(false);
        
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(true);
        BotonSiguiente.setEnabled(true);
        BotonBuscar.setEnabled(true);
        BotonCancelar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(true);
        BotonBorrar.setEnabled(true);
        
        String nit = TextoNit.getText();
        String nombre = TextoNombre.getText();
        String direccion = TextoDireccion.getText();
        String telefono = TextoTelefono.getText();
        String fax = TextoFax.getText();
        String corre = TextoCorreo.getText();
        String nomcont = TextoNomContac.getText();
        String telcontac = TextoTelContac.getText();
        String celcontac = TextoCelContac.getText();
        String oficina = TextoOficina.getText();
        String correocontact = TextoCorreoContac.getText();
        
        ClaseProveedores prov = new ClaseProveedores(nit, nombre, direccion, telefono, fax, corre, nomcont, telcontac, celcontac, oficina, correocontact);
        
        if (sw == 1){
            for(int i = 0 ; i<ListaProveedores.size();  i++){
                if(ListaProveedores.get(i).getNit().equals(nit)){
                    JOptionPane.showMessageDialog(null, "Proveedor ya existe");
                    TextoNit.setText("");
                    TextoNombre.setText("");
                    TextoDireccion.setText("");
                    TextoTelefono.setText("");
                    TextoFax.setText("");
                    TextoCorreo.setText("");
                    TextoNomContac.setText("");
                    TextoTelContac.setText("");
                    TextoCelContac.setText("");
                    TextoOficina.setText("");
                    TextoCorreoContac.setText("");
                    TextoNit.requestFocusInWindow();
                    return;
                }
            }
            ListaProveedores.addLast(prov);
                    
        }else{
            for (int i = 0; i<ListaProveedores.size(); i++){
                if(ListaProveedores.get(i).getNit().equals(nit)){
                   ListaProveedores.get(i).setNit(nit);
                   ListaProveedores.get(i).setNombre(nombre);
                   ListaProveedores.get(i).setDireccion(direccion);
                   ListaProveedores.get(i).setTelefono(telefono);
                   ListaProveedores.get(i).setFax(fax);
                   ListaProveedores.get(i).setCorreo(corre);
                   ListaProveedores.get(i).setNomContacto(nomcont);
                   ListaProveedores.get(i).setTelContacto(telcontac);
                   ListaProveedores.get(i).setCelContacto(celcontac);
                   ListaProveedores.get(i).setOficina(oficina);
                   ListaProveedores.get(i).setCorreoContacto(correocontact);
                   return;
                }
            }JOptionPane.showMessageDialog(null, "Error al modificar al proveedor");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        String NIT = JOptionPane.showInputDialog("Ingrese Nit");
        if (NIT.equals("")){
            return;
        }
        boolean resp;
        for(int i = 0; i < ListaProveedores.size(); i++){
            if(ListaProveedores.get(i).getNit().equals(NIT)){
                resp = ListaProveedores.remove(ListaProveedores.get(i));
                if(resp==false){
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el proveedor");
                    return;
                }else{
                    JOptionPane.showMessageDialog(null, "proveedor eliminado con éxtio");
                    TextoNit.setText("");
                    TextoNombre.setText("");
                    TextoDireccion.setText("");
                    TextoTelefono.setText("");
                    TextoFax.setText("");
                    TextoCorreo.setText("");
                    TextoNomContac.setText("");
                    TextoTelContac.setText("");
                    TextoCelContac.setText("");
                    TextoOficina.setText("");
                    TextoCorreoContac.setText("");
                    return;
                }
            }
        }
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        //Habilitar campos de texto
        TextoNit.setEnabled(false);
        TextoNombre.setEnabled(false);
        TextoDireccion.setEnabled(false);
        TextoTelefono.setEnabled(false);
        TextoFax.setEnabled(false);
        TextoCorreo.setEnabled(false);
        TextoNomContac.setEnabled(false);
        TextoTelContac.setEnabled(false);
        TextoCelContac.setEnabled(false);
        TextoOficina.setEnabled(false);
        TextoCorreoContac.setEnabled(false);
        

        //ponerlos en blanco
        TextoNit.setText("");
        TextoNombre.setText("");
        TextoDireccion.setText("");
        TextoTelefono.setText("");
        TextoFax.setText("");
        TextoCorreo.setText("");
        TextoNomContac.setText("");
        TextoTelContac.setText("");
        TextoCelContac.setText("");
        TextoOficina.setText("");
        TextoCorreoContac.setText("");
       
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(true);
        BotonSiguiente.setEnabled(true);
        BotonBuscar.setEnabled(true);
        BotonCancelar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(true);
        BotonBorrar.setEnabled(true);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String ni = JOptionPane.showInputDialog("Ingrese nit");
        if(ni.equals("")){
            return;
        }
        
        for(int i = 0; i<ListaProveedores.size(); i++){
            String respu = ListaProveedores.get(i).getNit();
            if(respu == null){
                JOptionPane.showMessageDialog(null, "proveedor no encontrado");
            }else{
                if(ListaProveedores.get(i).getNit().equals(ni)){
                     TextoNit.setText(ListaProveedores.get(i).getNit());
                     TextoNombre.setText(ListaProveedores.get(i).getNombre());
                     TextoDireccion.setText(ListaProveedores.get(i).getDireccion());
                     TextoTelefono.setText(ListaProveedores.get(i).getTelefono());
                     TextoFax.setText(ListaProveedores.get(i).getFax());
                     TextoCorreo.setText(ListaProveedores.get(i).getCorreo());
                     TextoNomContac.setText(ListaProveedores.get(i).getNomContacto());
                     TextoTelContac.setText(ListaProveedores.get(i).getTelContacto());
                     TextoCelContac.setText(ListaProveedores.get(i).getCelContacto());
                     TextoOficina.setText(ListaProveedores.get(i).getOficina());
                     TextoCorreoContac.setText(ListaProveedores.get(i).getCorreoContacto());
                     return;
                }
            }
            
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JTextField TextoCelContac;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoCorreoContac;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoFax;
    private javax.swing.JTextField TextoNit;
    private javax.swing.JTextField TextoNomContac;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoOficina;
    private javax.swing.JTextField TextoTelContac;
    private javax.swing.JTextField TextoTelefono;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCelContac;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoContac;
    private javax.swing.JLabel lblDirOficina;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNomContac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelContac;
    private javax.swing.JLabel lblTelefono;
    // End of variables declaration//GEN-END:variables
}
