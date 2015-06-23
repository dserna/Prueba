
package Ventanas;

import LinkedListImplementation.MyLinkedList;
import boutiquetrapitos.ClasePersonal;
import javax.swing.JOptionPane;

public class VentanaPersonal extends javax.swing.JInternalFrame {

    
    public VentanaPersonal() {
        initComponents();
    }
    int sw = 0;
    
    MyLinkedList<ClasePersonal> ListaPersonal= new MyLinkedList<ClasePersonal>();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        TextoDocumento = new javax.swing.JTextField();
        cmboxCedula = new javax.swing.JComboBox();
        lblTipoDocumento = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        TextoFechaNacimiento = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        TextoCiudad = new javax.swing.JTextField();
        lblTipoSangre = new javax.swing.JLabel();
        cmboxTipoSangre = new javax.swing.JComboBox();
        lblRH = new javax.swing.JLabel();
        cmboxRH = new javax.swing.JComboBox();
        lblFechaContratacion = new javax.swing.JLabel();
        TextoFechaContrat = new javax.swing.JTextField();
        lblTipoContrato = new javax.swing.JLabel();
        TextoTipoContrat = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        TextoDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        TextoCelular = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JTextField();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        TextoCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Personal");

        lblDocumento.setText("Documento : * ");
        lblDocumento.setEnabled(false);

        TextoDocumento.setEnabled(false);
        TextoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDocumentoActionPerformed(evt);
            }
        });

        cmboxCedula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cédula", "Cédula extranjera" }));
        cmboxCedula.setEnabled(false);

        lblTipoDocumento.setText("Tipo de documento: *");
        lblTipoDocumento.setEnabled(false);

        lblNombre.setText("Nombre completo: *");
        lblNombre.setEnabled(false);

        TextoNombre.setEnabled(false);

        lblFechaNacimiento.setText("Fecha de nacimiento: *");
        lblFechaNacimiento.setEnabled(false);

        TextoFechaNacimiento.setToolTipText("dd/mm/aa");
        TextoFechaNacimiento.setEnabled(false);

        lblCiudad.setText("Ciudad de nacimiento:");
        lblCiudad.setEnabled(false);

        TextoCiudad.setEnabled(false);

        lblTipoSangre.setText("Tipo de sangre: *");
        lblTipoSangre.setEnabled(false);

        cmboxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "A", "B", "AB" }));
        cmboxTipoSangre.setEnabled(false);

        lblRH.setText("RH: *");
        lblRH.setEnabled(false);

        cmboxRH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-" }));
        cmboxRH.setEnabled(false);

        lblFechaContratacion.setText("Fecha de contratación:*");
        lblFechaContratacion.setEnabled(false);

        TextoFechaContrat.setToolTipText("dd/mm/aa");
        TextoFechaContrat.setEnabled(false);

        lblTipoContrato.setText("Tipo de contrato:*");
        lblTipoContrato.setEnabled(false);

        TextoTipoContrat.setEnabled(false);
        TextoTipoContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTipoContratActionPerformed(evt);
            }
        });

        lblDireccion.setText("Dirección:");
        lblDireccion.setEnabled(false);

        TextoDireccion.setEnabled(false);

        lblTelefono.setText("Teléfono:");
        lblTelefono.setEnabled(false);

        TextoTelefono.setEnabled(false);

        lblCelular.setText("Celular:*");
        lblCelular.setEnabled(false);

        TextoCelular.setEnabled(false);

        lblCorreo.setText("Correo electrónico:*");
        lblCorreo.setEnabled(false);

        TextoCorreo.setEnabled(false);

        BotonAnterior.setText("Anterior");

        BotonSiguiente.setText("Siguiente");

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

        lblCargo.setText("Cargo:*");
        lblCargo.setEnabled(false);

        TextoCargo.setEnabled(false);

        jLabel2.setText("Campos obligatorios *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaContratacion)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo)
                            .addComponent(lblCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(lblCelular))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextoCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(TextoFechaContrat))
                                .addGap(47, 47, 47)
                                .addComponent(lblTipoContrato))
                            .addComponent(TextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTipoSangre)
                                    .addComponent(lblFechaNacimiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblCiudad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmboxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRH))))
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmboxRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTipoContrat, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(TextoDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(BotonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonCrear))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)))
                        .addComponent(BotonModificar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDocumento)
                                .addComponent(lblNombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(lblTipoDocumento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmboxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TextoNombre)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(TextoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(TextoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad)
                    .addComponent(TextoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoSangre)
                    .addComponent(cmboxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRH)
                    .addComponent(cmboxRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaContratacion)
                    .addComponent(TextoFechaContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoContrato)
                    .addComponent(TextoTipoContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDireccion)
                        .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCargo)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(TextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSiguiente)
                    .addComponent(BotonCrear)
                    .addComponent(BotonModificar)
                    .addComponent(BotonAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonBorrar)
                    .addComponent(BotonGuardar))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDocumentoActionPerformed

    private void TextoTipoContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTipoContratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTipoContratActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
       //Habilitar campos de texto
        TextoDocumento.setEnabled(true);
        cmboxCedula.setEnabled(true);
        TextoNombre.setEnabled(true);
        TextoFechaNacimiento.setEnabled(true);
        TextoCiudad.setEnabled(true);
        cmboxTipoSangre.setEnabled(true);
        cmboxRH.setEnabled(true);
        TextoFechaContrat.setEnabled(true);
        TextoTipoContrat.setEnabled(true);
        TextoCargo.setEnabled(true);
        TextoDireccion.setEnabled(true);
        TextoTelefono.setEnabled(true);
        TextoCelular.setEnabled(true);
        TextoCorreo.setEnabled(true);
        

        //ponerlos en blanco
        TextoDocumento.setText("");
        cmboxCedula.setSelectedIndex(0);
        TextoNombre.setText("");
        TextoFechaNacimiento.setText("");
        TextoCiudad.setText("");
        cmboxTipoSangre.setSelectedIndex(0);
        cmboxRH.setSelectedIndex(0);
        TextoFechaContrat.setText("");
        TextoTipoContrat.setText("");
        TextoCargo.setText("");
        TextoDireccion.setText("");
        TextoTelefono.setText("");
        TextoCelular.setText("");
        TextoCorreo.setText("");
        
        
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);
        
        
        sw = 1;
        TextoDocumento.requestFocusInWindow();
        
        
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if(TextoDocumento.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un documento" );
            TextoDocumento.requestFocusInWindow();
            return; 
        }
        
        if(TextoNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un nombre" );
            TextoNombre.requestFocusInWindow();
            return; 
        }
        
        if(TextoFechaNacimiento.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un documento" );
            TextoFechaNacimiento.requestFocusInWindow();
            return; 
        }
        
        if(TextoFechaContrat.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar una fecha" );
            TextoFechaContrat.requestFocusInWindow();
            return; 
        }
        
        if(TextoTipoContrat.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un tipo de contrato" );
            TextoTipoContrat.requestFocusInWindow();
            return; 
        }
        
        if(TextoCargo.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un cargo" );
            TextoCargo.requestFocusInWindow();
            return; 
        }
        
        if(TextoCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un celular" );
            TextoCelular.requestFocusInWindow();
            return; 
        }
        
        if(TextoCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un correo" );
            TextoCorreo.requestFocusInWindow();
            return; 
        }
        
        
        
        

        //Habilitar campos de texto
        TextoDocumento.setEnabled(false);
        cmboxCedula.setEnabled(false);
        TextoNombre.setEnabled(false);
        TextoFechaNacimiento.setEnabled(false);
        TextoCiudad.setEnabled(false);
        cmboxTipoSangre.setEnabled(false);
        cmboxRH.setEnabled(false);
        TextoFechaContrat.setEnabled(false);
        TextoTipoContrat.setEnabled(false);
        TextoCargo.setEnabled(false);
        TextoDireccion.setEnabled(false);
        TextoTelefono.setEnabled(false);
        TextoCelular.setEnabled(false);
        TextoCorreo.setEnabled(false);
    
        
        //Deshabilitar botones
        BotonAnterior.setEnabled(true);
        BotonSiguiente.setEnabled(true);
        BotonBuscar.setEnabled(true);
        BotonCancelar.setEnabled(false);
        BotonGuardar.setEnabled(false);
        BotonModificar.setEnabled(true);
        BotonBorrar.setEnabled(true);

        String documento= TextoDocumento.getText();
        int cedula = cmboxCedula.getSelectedIndex();
        String nombre = TextoNombre.getText();
        String fechanac = TextoFechaNacimiento.getText();
        String ciudad = TextoCiudad.getText();
        int tiposangre = cmboxTipoSangre.getSelectedIndex();
        int rh = cmboxRH.getSelectedIndex();
        String fechacon = TextoFechaContrat.getText();
        String tipocon = TextoTipoContrat.getText();
        String cargo = TextoCargo.getText();
        String direcc = TextoDireccion.getText();
        String tel = TextoTelefono.getText();
        String cel = TextoCelular.getText();
        String correo = TextoCorreo.getText();

        ClasePersonal per = new ClasePersonal(documento,cedula,nombre,fechanac,ciudad,tiposangre,rh,fechacon, tipocon, cargo, direcc, tel, cel, correo);
        
        
        
        if(sw == 1){
            for (int i= 0 ; i<ListaPersonal.size(); i++){
                if(ListaPersonal.get(i).getDocumento().equals(documento)){
                    JOptionPane.showMessageDialog(null, "Empleado ya existe");
                    //ponerlos en blanco
                    TextoDocumento.setText("");
                    cmboxCedula.setSelectedIndex(0);
                    TextoNombre.setText("");
                    TextoFechaNacimiento.setText("");
                    TextoCiudad.setText("");
                    cmboxTipoSangre.setSelectedIndex(0);
                    cmboxRH.setSelectedIndex(0);
                    TextoFechaContrat.setText("");
                    TextoTipoContrat.setText("");
                    TextoCargo.setText("");
                    TextoDireccion.setText("");
                    TextoTelefono.setText("");
                    TextoCelular.setText("");
                    TextoCorreo.setText("");
                    TextoDocumento.requestFocusInWindow();
                    return;
                }
            ListaPersonal.addLast(per);
            }
        }else{
            for(int i = 0; i<ListaPersonal.size(); i++){
                if (ListaPersonal.get(i).getDocumento().equals(documento)){
                    ListaPersonal.get(i).setDocumento(documento);
                    ListaPersonal.get(i).setTipoDoc(cedula);
                    ListaPersonal.get(i).setNombre(nombre);
                    ListaPersonal.get(i).setFecha(fechanac);
                    ListaPersonal.get(i).setCiudad(ciudad);
                    ListaPersonal.get(i).setTipoSangre(tiposangre);
                    ListaPersonal.get(i).setRH(rh);
                    ListaPersonal.get(i).setFechaContrato(fechacon);
                    ListaPersonal.get(i).setTipoContrato(tipocon);
                    ListaPersonal.get(i).setCargo(cargo);
                    ListaPersonal.get(i).setDireccion(direcc);
                    ListaPersonal.get(i).setTelefono(tel);
                    ListaPersonal.get(i).setCelular(cel);
                    ListaPersonal.get(i).setCorreo(correo);
                    return;
                }
            }JOptionPane.showMessageDialog(null, "Error al modificar al empleado");
        }


    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
         //Habilitar campos de texto
        TextoDocumento.setEnabled(false);
        cmboxCedula.setEnabled(false);
        TextoNombre.setEnabled(false);
        TextoFechaNacimiento.setEnabled(false);
        TextoCiudad.setEnabled(false);
        cmboxTipoSangre.setEnabled(false);
        cmboxRH.setEnabled(false);
        TextoFechaContrat.setEnabled(false);
        TextoTipoContrat.setEnabled(false);
        TextoCargo.setEnabled(false);
        TextoDireccion.setEnabled(false);
        TextoTelefono.setEnabled(false);
        TextoCelular.setEnabled(false);
        TextoCorreo.setEnabled(false);
    
        TextoDocumento.setText("");
        cmboxCedula.setSelectedIndex(0);
        TextoNombre.setText("");
        TextoFechaNacimiento.setText("");
        TextoCiudad.setText("");
        cmboxTipoSangre.setSelectedIndex(0);
        cmboxRH.setSelectedIndex(0);
        TextoFechaContrat.setText("");
        TextoTipoContrat.setText("");
        TextoCargo.setText("");
        TextoDireccion.setText("");
        TextoTelefono.setText("");
        TextoCelular.setText("");
        TextoCorreo.setText("");
        
        //Deshabilitar botones
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
        TextoDocumento.setEnabled(true);
        cmboxCedula.setEnabled(true);
        TextoNombre.setEnabled(true);
        TextoFechaNacimiento.setEnabled(true);
        TextoCiudad.setEnabled(true);
        cmboxTipoSangre.setEnabled(true);
        cmboxRH.setEnabled(true);
        TextoFechaContrat.setEnabled(true);
        TextoTipoContrat.setEnabled(true);
        TextoCargo.setEnabled(true);
        TextoDireccion.setEnabled(true);
        TextoTelefono.setEnabled(true);
        TextoCelular.setEnabled(true);
        TextoCorreo.setEnabled(true);
        

       
        //Deshabilitar botones
        BotonAnterior.setEnabled(false);
        BotonSiguiente.setEnabled(false);
        BotonBuscar.setEnabled(false);
        BotonCancelar.setEnabled(true);
        BotonGuardar.setEnabled(true);
        BotonModificar.setEnabled(false);
        BotonBorrar.setEnabled(false);
        
        sw =0;
        
        TextoDocumento.requestFocusInWindow();
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String docu = JOptionPane.showInputDialog("Ingrese documento");
        if (docu.equals("")){
            return;
        }
        
        for (int i = 0; i < ListaPersonal.size(); i++) {
            if (ListaPersonal.get(i).getDocumento().equals(docu)) {
                TextoDocumento.setText(ListaPersonal.get(i).getDocumento());
                cmboxCedula.setSelectedIndex(ListaPersonal.get(i).getTipoDoc());
                TextoNombre.setText(ListaPersonal.get(i).getNombre());
                TextoFechaNacimiento.setText(ListaPersonal.get(i).getFecha());
                TextoCiudad.setText(ListaPersonal.get(i).getCiudad());
                cmboxTipoSangre.setSelectedIndex(ListaPersonal.get(i).getTipoSangre());
                cmboxRH.setSelectedIndex(ListaPersonal.get(i).getRH());
                TextoFechaContrat.setText(ListaPersonal.get(i).getFechaContrato());
                TextoTipoContrat.setText(ListaPersonal.get(i).getTipoContrato());
                TextoCargo.setText(ListaPersonal.get(i).getCargo());
                TextoDireccion.setText(ListaPersonal.get(i).getDireccion());
                TextoTelefono.setText(ListaPersonal.get(i).getTelefono());
                TextoCelular.setText(ListaPersonal.get(i).getCelular());
                TextoCorreo.setText(ListaPersonal.get(i).getCorreo());
                
                
                return;

            }
            
        }JOptionPane.showMessageDialog(null, "Usuario no encontrado");
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        String docum = JOptionPane.showInputDialog("Ingrese Documento");
        if (docum.equals("")){
            return;
        }
        boolean resp;
        for (int i = 0; i < ListaPersonal.size(); i++) {
            if (ListaPersonal.get(i).getDocumento().equals(docum)) {
             
               resp= ListaPersonal.remove(ListaPersonal.get(i));
               if(resp==false){
                   JOptionPane.showMessageDialog(null, "Error:\n No se ha podido eliminar el empleado");
                   return;
               }else{
                   JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
                    TextoDocumento.setText("");
                    cmboxCedula.setSelectedIndex(0);
                    TextoNombre.setText("");
                    TextoFechaNacimiento.setText("");
                    TextoCiudad.setText("");
                    cmboxTipoSangre.setSelectedIndex(0);
                    cmboxRH.setSelectedIndex(0);
                    TextoFechaContrat.setText("");
                    TextoTipoContrat.setText("");
                    TextoCargo.setText("");
                    TextoDireccion.setText("");
                    TextoTelefono.setText("");
                    TextoCelular.setText("");
                    TextoCorreo.setText("");
                   return;
               }
                   
                    
            }
        }

    }//GEN-LAST:event_BotonBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JTextField TextoCargo;
    private javax.swing.JTextField TextoCelular;
    private javax.swing.JTextField TextoCiudad;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoDocumento;
    private javax.swing.JTextField TextoFechaContrat;
    private javax.swing.JTextField TextoFechaNacimiento;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTelefono;
    private javax.swing.JTextField TextoTipoContrat;
    private javax.swing.JComboBox cmboxCedula;
    private javax.swing.JComboBox cmboxRH;
    private javax.swing.JComboBox cmboxTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblFechaContratacion;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRH;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoContrato;
    private javax.swing.JLabel lblTipoDocumento;
    private javax.swing.JLabel lblTipoSangre;
    // End of variables declaration//GEN-END:variables
}
