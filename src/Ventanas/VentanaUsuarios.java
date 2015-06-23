
package Ventanas;

import LinkedListImplementation.MyLinkedList;
import boutiquetrapitos.ClaseUsuarios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaUsuarios extends javax.swing.JInternalFrame {

    
    
    public VentanaUsuarios() {

        initComponents();
    }

    int sw = 0;

    MyLinkedList<ClaseUsuarios> ListaUsuario = new MyLinkedList<ClaseUsuarios>();
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumCedula = new javax.swing.JLabel();
        lblNomUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblPrefil = new javax.swing.JLabel();
        TextoNumCedula = new javax.swing.JTextField();
        TextoNomUsuario = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JTextField();
        cmboxPrefil = new javax.swing.JComboBox();
        TextoContraseña = new javax.swing.JPasswordField();
        TextoPregunta = new javax.swing.JTextField();
        lblRespuesta = new javax.swing.JLabel();
        TextoRespuesta = new javax.swing.JTextField();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblNumCedula.setText("Número de cédula:  *");
        lblNumCedula.setEnabled(false);

        lblNomUsuario.setText("Nombre de usuario:  *");
        lblNomUsuario.setEnabled(false);

        lblCorreo.setText("Correo:  *");
        lblCorreo.setEnabled(false);

        lblPregunta.setText("Pregunta secreta:  *");
        lblPregunta.setEnabled(false);

        lblContraseña.setText("Contraseña:   *");
        lblContraseña.setEnabled(false);

        lblPrefil.setText("Perfil:  *");
        lblPrefil.setEnabled(false);

        TextoNumCedula.setEnabled(false);
        TextoNumCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNumCedulaActionPerformed(evt);
            }
        });

        TextoNomUsuario.setEnabled(false);

        TextoCorreo.setEnabled(false);

        cmboxPrefil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Empleado" }));
        cmboxPrefil.setEnabled(false);

        TextoContraseña.setEnabled(false);

        TextoPregunta.setEnabled(false);

        lblRespuesta.setText("Respuesta:  *");
        lblRespuesta.setEnabled(false);

        TextoRespuesta.setEnabled(false);

        BotonAnterior.setText("Anterior");
        BotonAnterior.setToolTipText("ir al anterior registro");
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });

        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.setToolTipText("ir al siguiente registro");

        BotonCrear.setText("Crear usuario");
        BotonCrear.setToolTipText("Crear un usuario");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonModificar.setText("Modificar usuario");
        BotonModificar.setToolTipText("Modificar un usuario");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar usuario");
        BotonGuardar.setToolTipText("Guardar el usuario");
        BotonGuardar.setEnabled(false);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.setToolTipText("Cancelar la operación");
        BotonCancelar.setEnabled(false);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonBorrar.setText("Borrar usuario");
        BotonBorrar.setToolTipText("Borrar un usuario");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonBuscar.setText("Buscar usuario");
        BotonBuscar.setToolTipText("Buscar un usuario");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Campos obligatorios *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumCedula)
                            .addComponent(lblCorreo)
                            .addComponent(lblRespuesta)
                            .addComponent(lblPregunta)
                            .addComponent(lblContraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblPrefil)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cmboxPrefil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNomUsuario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TextoNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(TextoCorreo)
                                .addComponent(TextoPregunta))
                            .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCedula)
                    .addComponent(lblNomUsuario)
                    .addComponent(TextoNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPregunta)
                    .addComponent(TextoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrefil)
                        .addComponent(cmboxPrefil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespuesta)
                        .addComponent(TextoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void TextoNumCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNumCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNumCedulaActionPerformed

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        //Habilitar campos de texto
        TextoNumCedula.setEnabled(true);
        TextoContraseña.setEnabled(true);
        TextoCorreo.setEnabled(true);
        TextoPregunta.setEnabled(true);
        TextoRespuesta.setEnabled(true);
        TextoNomUsuario.setEnabled(true);
        cmboxPrefil.setEnabled(true);

        //ponerlos en blanco
        TextoNumCedula.setText("");
        TextoContraseña.setText("");
        TextoCorreo.setText("");
        TextoPregunta.setText("");
        TextoRespuesta.setText("");
        TextoNomUsuario.setText("");
        cmboxPrefil.setSelectedIndex(0);

        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);

        TextoNumCedula.requestFocusInWindow();

        sw = 1;

    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        
        if(TextoNumCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una cédula" );
            TextoNumCedula.requestFocusInWindow();
            return; 
        }
        String contra = new String(TextoContraseña.getPassword());
        
        if(contra.equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una Contraseña" );
            TextoContraseña.requestFocusInWindow();
            return; 
        }
        
        if(TextoCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un correo" );
            TextoCorreo.requestFocusInWindow();
            return; 
        }
        
        if(TextoPregunta.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una pregunta secreta" );
            TextoPregunta.requestFocusInWindow();
            return; 
        }
        
        if(TextoRespuesta.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una respuesta" );
            TextoRespuesta.requestFocusInWindow();
            return; 
        }
        
        if(TextoNomUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un usuario" );
            TextoNomUsuario.requestFocusInWindow();
            return; 
        }
        
        
        

        //Deshabilitar campos de texto
        TextoNumCedula.setEnabled(false);
        TextoContraseña.setEnabled(false);
        TextoCorreo.setEnabled(false);
        TextoPregunta.setEnabled(false);
        TextoRespuesta.setEnabled(false);
        TextoNomUsuario.setEnabled(false);
        cmboxPrefil.setEnabled(false);

        //Habilitar botones
        BotonAnterior.setEnabled(true);
        BotonSiguiente.setEnabled(true);
        BotonBuscar.setEnabled(true);
        BotonCancelar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(true);
        BotonBorrar.setEnabled(true);

        String Usuario = TextoNomUsuario.getText();
        String Contraseña = (new String( TextoContraseña.getPassword()));
        String Correo = TextoCorreo.getText();
        String Cedula = TextoNumCedula.getText();
        String Pregunta = TextoPregunta.getText();
        String Respuesta = TextoRespuesta.getText();
        int Perfil = cmboxPrefil.getSelectedIndex();

        ClaseUsuarios Usr = new ClaseUsuarios(Cedula, Usuario, Correo, Pregunta, Respuesta, Contraseña, Perfil);
       
        if (sw == 1) {
            for (int i= 0 ; i<ListaUsuario.size(); i++){
                if(ListaUsuario.get(i).getNumCedula().equals(Cedula)){
                    JOptionPane.showMessageDialog(null, "Usuario ya existe");
                    //ponerlos en blanco
                    TextoNumCedula.setText("");
                    TextoContraseña.setText("");
                    TextoCorreo.setText("");
                    TextoPregunta.setText("");
                    TextoRespuesta.setText("");
                    TextoNomUsuario.setText("");
                    cmboxPrefil.setSelectedIndex(0);
                    TextoNumCedula.requestFocusInWindow();
                    return;
                }
            }
            ListaUsuario.addLast(Usr);
        } else {
            for (int i = 0; i < ListaUsuario.size(); i++) {
                if (ListaUsuario.get(i).getNumCedula().equals(Cedula)) {
                    ListaUsuario.get(i).setNumCedula(Cedula);
                    ListaUsuario.get(i).setContraseña(Contraseña);
                    ListaUsuario.get(i).setCorreo(Correo);
                    ListaUsuario.get(i).setNomUsuario(Usuario);
                    ListaUsuario.get(i).setPerfil(Perfil);
                    ListaUsuario.get(i).setPreguntaSecreta(Pregunta);
                    ListaUsuario.get(i).setRespuesta(Respuesta);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Error al modificar al usuario");
        }
        
        


    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        //Deshabilitar campos de texto
        TextoNumCedula.setEnabled(false);
        TextoContraseña.setEnabled(false);
        TextoCorreo.setEnabled(false);
        TextoPregunta.setEnabled(false);
        TextoRespuesta.setEnabled(false);
        TextoNomUsuario.setEnabled(false);
        cmboxPrefil.setEnabled(false);
        
        TextoNumCedula.setText("");
        TextoContraseña.setText("");
        TextoCorreo.setText("");
        TextoPregunta.setText("");
        TextoRespuesta.setText("");
        TextoNomUsuario.setText("");
        cmboxPrefil.setSelectedIndex(0);

        //Habilitar botones
        BotonAnterior.setEnabled(true);
        BotonSiguiente.setEnabled(true);
        BotonBuscar.setEnabled(true);
        BotonCancelar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(true);
        BotonBorrar.setEnabled(true);
    }//GEN-LAST:event_BotonCancelarActionPerformed
    
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        //Habilitar campos de texto
        TextoNumCedula.setEnabled(false);
        TextoContraseña.setEnabled(true);
        TextoCorreo.setEnabled(true);
        TextoPregunta.setEnabled(true);
        TextoRespuesta.setEnabled(true);
        TextoNomUsuario.setEnabled(false);
        cmboxPrefil.setEnabled(true);

        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);

        sw = 0;

        TextoNomUsuario.requestFocusInWindow();
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String cedula = JOptionPane.showInputDialog("Ingrese Cedula");
        if (cedula.equals("")){
            return;
        }
        
        for (int i = 0; i < ListaUsuario.size(); i++) {
            String resp = ListaUsuario.get(i).getNumCedula();
            if(resp ==  null){
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }else{
                if (ListaUsuario.get(i).getNumCedula().equals(cedula)) {
                TextoContraseña.setText(ListaUsuario.get(i).getContraseña());
                TextoCorreo.setText(ListaUsuario.get(i).getCorreo());
                TextoNomUsuario.setText(ListaUsuario.get(i).getNomUsuario());
                TextoNumCedula.setText(ListaUsuario.get(i).getNumCedula());
                TextoPregunta.setText(ListaUsuario.get(i).getPreguntaSecreta());
                TextoRespuesta.setText(ListaUsuario.get(i).getRespuesta());
                cmboxPrefil.setSelectedIndex(ListaUsuario.get(i).getPerfil());
                return;

                }
            }
            
            
        }
        

        
        
            


    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        String cedul = JOptionPane.showInputDialog("Ingrese Cedula");
        if (cedul.equals("")){
            return;
        }
        boolean resp;
        for (int i = 0; i < ListaUsuario.size(); i++) {
            if (ListaUsuario.get(i).getNumCedula().equals(cedul)) {
             
               resp= ListaUsuario.remove(ListaUsuario.get(i));
               if(resp==false){
                   JOptionPane.showMessageDialog(null, "Error:\n No se ha podido eliminar el Usuario");
                   return;
               }else{
                   JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito");
                   TextoNumCedula.setText("");
                   TextoContraseña.setText("");
                   TextoCorreo.setText("");
                   TextoPregunta.setText("");
                   TextoRespuesta.setText("");
                   TextoNomUsuario.setText("");
                   cmboxPrefil.setSelectedIndex(0);
                   
                   TextoNumCedula.setEnabled(false);
                    TextoContraseña.setEnabled(false);
                    TextoCorreo.setEnabled(false);
                    TextoPregunta.setEnabled(false);
                    TextoRespuesta.setEnabled(false);
                    TextoNomUsuario.setEnabled(false);
                    cmboxPrefil.setEnabled(false);
                    TextoNumCedula.requestFocusInWindow();
                   return;
               }
                   
                    
            }
        }


    }//GEN-LAST:event_BotonBorrarActionPerformed
    
    String usu[] = {""};
    
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JPasswordField TextoContraseña;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoNomUsuario;
    private javax.swing.JTextField TextoNumCedula;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JTextField TextoRespuesta;
    private javax.swing.JComboBox cmboxPrefil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNomUsuario;
    private javax.swing.JLabel lblNumCedula;
    private javax.swing.JLabel lblPrefil;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespuesta;
    // End of variables declaration//GEN-END:variables

}