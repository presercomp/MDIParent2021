/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.HashMap;
import javax.swing.JOptionPane;
import models.Employee;
import models.Person;
import models.Subsidiary;
import utils.Functions;

/**
 *
 * @author Frankie
 */
public class EmpleadosAgregar extends javax.swing.JInternalFrame {

    EmpleadosAdmin ea;
    Subsidiary sucursal;
    public EmpleadosAgregar(EmpleadosAdmin ea) {
        initComponents();
        this.ea = ea;
        this.sucursal = new Subsidiary();
        HashMap<String, Integer> elementos = this.sucursal.getSubsidiaries();
        for(String i: elementos.keySet()){
            this.cmb_sucursal.addItem(i);
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

        jLabel1 = new javax.swing.JLabel();
        txt_run = new javax.swing.JTextField();
        txt_dv = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        lbl_run = new javax.swing.JLabel();
        lbl_paterno = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        lbl_materno = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        lbl_departamento = new javax.swing.JLabel();
        cmb_sucursal = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        chk_es_encargado = new javax.swing.JCheckBox();
        lbl_id_sucursal = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nuevo Empleado");

        lbl_run.setText("R.U.N.");

        lbl_paterno.setText("Apellido Paterno");

        lbl_materno.setText("Apellido Materno");

        lbl_nombres.setText("Nombres");

        lbl_departamento.setText("Sucursal");

        cmb_sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sucursalActionPerformed(evt);
            }
        });

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

        chk_es_encargado.setText("es encargado");

        lbl_id_sucursal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_departamento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombres)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmb_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chk_es_encargado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_id_sucursal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_run, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_run)
                                    .addComponent(lbl_nombres)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_paterno))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_materno))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(lbl_run)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_run, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_paterno)
                        .addGap(3, 3, 3)
                        .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_materno)
                        .addGap(3, 3, 3)
                        .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombres)
                .addGap(3, 3, 3)
                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_departamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_es_encargado)
                    .addComponent(lbl_id_sucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
        this.ea.recargarEmpleados();
        this.ea.setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // Validar que el formulario esté correctamente lleno
        String errores = "";
        errores += this.txt_run.getText().length() < 6 || !Functions.isNumeric(this.txt_run.getText()) ? "- Ingrese el numero de RUT.\n" : "";
        errores += this.txt_paterno.getText().length() == 0 ? "- Ingrese el apellido paterno" : "";
        errores += this.txt_nombres.getText().length() == 0 ? "- Ingrese el apellido paterno" : "";
        errores += this.cmb_sucursal.toString() == "Seleccione" ? "- Seleccione una sucursal" : "";
        if(errores.length() > 0){
            JOptionPane.showMessageDialog(rootPane, "Corrija los errores:\n"+errores);
        } else {
            Person p = new Person(Integer.parseInt(this.txt_run.getText()), this.txt_paterno.getText(), this.txt_materno.getText(), this.txt_nombres.getText(), "2020-10-10", "+55555");
            p.save();
            Employee e = new Employee(Integer.parseInt(this.txt_run.getText()), Integer.parseInt(this.lbl_id_sucursal.getText()), this.chk_es_encargado.isSelected());
            e.save();
            this.setVisible(false);
            this.ea.recargarEmpleados();
            this.ea.setVisible(true);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cmb_sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sucursalActionPerformed
        HashMap<String, Integer> mapa = this.sucursal.getSubsidiaries();
        this.lbl_id_sucursal.setText(mapa.get(this.cmb_sucursal.getSelectedItem().toString()).toString());
    }//GEN-LAST:event_cmb_sucursalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JCheckBox chk_es_encargado;
    private javax.swing.JComboBox<String> cmb_sucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_departamento;
    private javax.swing.JLabel lbl_id_sucursal;
    private javax.swing.JLabel lbl_materno;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_paterno;
    private javax.swing.JLabel lbl_run;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_run;
    // End of variables declaration//GEN-END:variables
}
