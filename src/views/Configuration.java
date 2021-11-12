/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import models.Enterprice;
import utils.Functions;

/**
 *
 * @author Frankie
 */
public class Configuration extends javax.swing.JInternalFrame {

    Principal principal;
    private boolean editar;
    public Configuration(Principal p) {
        initComponents();
        this.principal = p;
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        lbl_rut = new javax.swing.JLabel();
        lbl_razonsocial = new javax.swing.JLabel();
        txt_razonsocial = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_giro = new javax.swing.JTextField();
        txt_dv = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lbl_dash = new javax.swing.JLabel();

        setTitle("Configuración");

        lbl_titulo.setText("Datos de la empresa");

        txt_rut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lbl_rut.setText("RUT");

        lbl_razonsocial.setText("Razón Social");

        lbl_direccion.setText("Giro");

        txt_dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        lbl_dash.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_razonsocial)
                            .addComponent(lbl_rut)
                            .addComponent(lbl_direccion))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_dash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_razonsocial)
                            .addComponent(txt_giro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rut)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_razonsocial)
                    .addComponent(txt_razonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_giro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getData(){
        Enterprice e = new Enterprice();
        e.getEnterprice();
        if(String.valueOf(e.getRut()).length() > 0){
            this.txt_rut.setText(String.valueOf(e.getRut()));
            this.txt_dv.setText(Functions.getRutDV(e.getRut()));
            this.txt_rut.setEnabled(false);
            this.txt_dv.setEnabled(false);
            this.txt_razonsocial.setText(e.getRazon_social());
            this.txt_giro.setText(e.getGiro());
            this.editar = true;
        } else {
           this.editar = false;
        }
        
    }
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
        this.principal.enableMenu(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String errores = "";
        /*
        if(txt_rut.getText().length() == 0){
            errores += "Debe completar el campo RUT";
        }*/
        errores += txt_rut.getText().length() == 0 ? "Debe completar el campo RUT.\n" : "";
        errores += txt_dv.getText().length() == 0 ? "Debe completar el campo DV.\n" : "";
        errores += txt_razonsocial.getText().length() == 0 ? "Debe completar el campo Razón Social.\n" : "";
        errores += txt_giro.getText().length() == 0 ? "Debe completar el campo Giro.\n" : "";
        errores += !validarRut(txt_rut.getText()+"-"+txt_dv.getText()) ? "El RUT ingresado no es correcto.\n" : "";
        
        if(errores.length() > 0){
            //Mostramos la advertencia
            JOptionPane.showMessageDialog(rootPane, "Corrija los siguientes errores:\n"+errores, "Error en el formulario", JOptionPane.ERROR_MESSAGE);
        } else {
            Enterprice e;
            if(this.editar){
                e = new Enterprice();
                e.getEnterprice();
                e.setRut(Integer.parseInt(txt_rut.getText()));
                e.setRazon_social(txt_razonsocial.getText());
                e.setGiro(txt_giro.getText());
                if(e.edit() == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Confifguración editada exitosamente", "Configuración", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
        this.principal.enableMenu(true);
                }
            }else{
                e = new Enterprice(Integer.parseInt(txt_rut.getText()), txt_razonsocial.getText(), txt_giro.getText());
            if(e.save() == 1){
                JOptionPane.showMessageDialog(rootPane, "Confifguración almacenada exitosamente", "Configuración", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
        this.principal.enableMenu(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Se generó un error desconocido al intentar guardar", "Configuración", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    public static boolean validarRut(String rut) {

    boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel lbl_dash;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_razonsocial;
    private javax.swing.JLabel lbl_rut;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_giro;
    private javax.swing.JTextField txt_razonsocial;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}
