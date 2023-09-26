/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.MateriaData;
import entidades.Materia;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas E. Sayago
 */
public class MateriaView extends javax.swing.JInternalFrame {

    private MateriaData mData = new MateriaData();

    public MateriaView() {
        this.setTitle("Formulario Materias");
        initComponents();
        jBNuevo.setEnabled(false);
        jBEliminar.setEnabled(false);
    }
        public Image getIconImage(){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("fotitos/ulplogoblanco.jpeg"));
        
        return retValue;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRBActivo = new javax.swing.JRadioButton();
        jTAnio = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jRBActivo.setText("Activo");
        jRBActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBActivoActionPerformed(evt);
            }
        });
        jRBActivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRBActivoKeyReleased(evt);
            }
        });

        jTAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAnioKeyReleased(evt);
            }
        });

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombreKeyReleased(evt);
            }
        });

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });
        jTCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCodigoKeyReleased(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nueva Materia");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBNuevo)
                            .addGap(28, 28, 28)
                            .addComponent(jBEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jBGuardar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRBActivo)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTAnio)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTNombre)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTCodigo)
                                    .addGap(43, 43, 43)
                                    .addComponent(jBBuscar)
                                    .addGap(9, 9, 9))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRBActivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        vaciarCampos();
        try {
            if (jTCodigo != null) {

                Materia mate = mData.buscarMateria(Integer.parseInt(jTCodigo.getText()));
                jTNombre.setText(mate.getNombre());
                jTAnio.setText(mate.getAnioMateria() + "");
                jRBActivo.setSelected(mate.isActivo());
                jBEliminar.setEnabled(true);

                /*
                if(mate!=null){
                    
                jTNombre.setText(mate.getNombre());
                jTAnio.setText(mate.getAnioMateria()+"");
                jRBActivo.setSelected(mate.isActivo());
                }else{
                    jBNuevo.setEnabled(true);
                }
                 */
            } else {
                JOptionPane.showMessageDialog(null, "No existe materia con ese Código.");

            }
        } catch (Exception ex) {

        }
        //HabilitarBotonNuevoYEliminar();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jRBActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBActivoActionPerformed


    }//GEN-LAST:event_jRBActivoActionPerformed

    private void jTCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodigoKeyReleased
        // HabilitarBotonNuevo();
    }//GEN-LAST:event_jTCodigoKeyReleased

    private void jTNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyReleased
        HabilitarBotonNuevoYEliminar();
    }//GEN-LAST:event_jTNombreKeyReleased

    private void jTAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAnioKeyReleased
        HabilitarBotonNuevoYEliminar();
    }//GEN-LAST:event_jTAnioKeyReleased

    private void jRBActivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRBActivoKeyReleased
        HabilitarBotonNuevoYEliminar();
    }//GEN-LAST:event_jRBActivoKeyReleased

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        vaciarCampos();
        try {
            if (!"".equals(jTCodigo.getText())) {
                mData.eliminarMateria(Integer.parseInt(jTCodigo.getText()));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, Materia no eliminada");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        try {
            Materia materia = new Materia(Integer.parseInt(jTCodigo.getText()), jTNombre.getText(), Integer.parseInt(jTAnio.getText()), jRBActivo.isSelected());
            mData.guardarMateria(materia);
            vaciarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, No se puede agregar Materia");

//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "Error de consulta");
//        }
    }//GEN-LAST:event_jBNuevoActionPerformed
    }

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            Materia materia = new Materia(Integer.parseInt(jTCodigo.getText()), jTNombre.getText(), Integer.parseInt(jTAnio.getText()), jRBActivo.isSelected());
            mData.modificarMateria(materia);
            vaciarCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, Materia no eliminada");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    private void HabilitarBotonNuevoYEliminar() {
       if (jTCodigo != null && jTNombre != null && jTAnio != null && jRBActivo != null) {

            //if (mData.buscarMateria(Integer.parseInt(jTCodigo.getText())) == null) {
            jBNuevo.setEnabled(true);
            jBEliminar.setEnabled(false);

        } else if (jRBActivo.isSelected()) {

            jBEliminar.setEnabled(true);
            jBNuevo.setEnabled(false);

        }
   

    }

    private void vaciarCampos() {
        jTAnio.setText("");
        jTNombre.setText("");
        jRBActivo.setSelected(false);

    }

}
