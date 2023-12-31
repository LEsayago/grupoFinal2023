/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
//import com.sun.java.util.jar.pack.Attribute.FormatException;
import entidades.Alumno;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Lucas E. Sayago
 */
public class FormularioAlumnoView extends javax.swing.JInternalFrame {

    private AlumnoData aData = new AlumnoData();

    /**
     * Creates new form FormularioAlumnoView
     */
    public FormularioAlumnoView() {
        initComponents();
        this.setTitle("Alumno");
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
        jTDocumento = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jRBActivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/fotitos/intento 3 logosinfondoaa.png"))); // NOI18N

        jLabel1.setText("Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Estado");

        jLabel5.setText("Fecha de Nacimiento");

        jRBActivo.setText("Activo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("   Alumno");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
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

        jDateChooser1.setForeground(new java.awt.Color(187, 108, 184));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jBNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBEliminar)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBActivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNombre)
                                    .addComponent(jTApellido)
                                    .addComponent(jTDocumento)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBuscar)
                                    .addComponent(jBGuardar))))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBActivo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        try {
            int dni = Integer.parseInt(jTDocumento.getText());
            String ape = jTApellido.getText();
            String nom = jTNombre.getText();
            boolean estado = jRBActivo.isSelected();
            LocalDate fdn = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Alumno alum = new Alumno(dni, ape, nom, fdn, estado);
            aData.guardarAlumno(alum);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "El alumno no se agregó.  " + ex.getMessage());
        }

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
     try {
            Alumno alum = aData.buscarAlumnoPorDni(Integer.parseInt(jTDocumento.getText()));

            alum.setApellido(jTApellido.getText());
            alum.setNombre(jTNombre.getText());
            alum.setEstado(jRBActivo.isSelected());
            alum.setFechaNac(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            aData.modificarAlumno(alum);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El alumno no se modificó. " + ex.getMessage());
        }
     catch(NullPointerException ex){
        JOptionPane.showMessageDialog(null, "El alumno no se modificó. " + ex.getMessage());
                 }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        Alumno al = new Alumno();

        try {
            if (!"".equals(jTDocumento.getText())) {

                int a = Integer.parseInt(jTDocumento.getText());
                al = aData.buscarAlumnoPorDni(a);

                jTApellido.setText(al.getApellido());
                jTNombre.setText(al.getNombre());
                jRBActivo.setSelected(al.isEstado());

                LocalDate fechaNacimiento = al.getFechaNac();
                java.util.Date fechaNacimientoAsDate = java.util.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDateChooser1.setDate(fechaNacimientoAsDate);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " El alumno no existe: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        /*Alumno al = new Alumno();
        
         try {
        if (!"".equals(jTDocumento.getText())) {
           

                int a = Integer.parseInt(jTDocumento.getText());
                //   JOptionPane.showMessageDialog(null, Integer.parseInt(jTDocumento.getText()));
                al = aData.buscarAlumnoPorDni(a);
                jTApellido.setText(al.getApellido());
                jTNombre.setText(al.getNombre());
                jRBActivo.setSelected(al.isEstado());
                //LocalDate ld = al.getFechaNac();
                //Date fecha = (Date) Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());             

                //setDate(fecha);
                //java.util.Date fechaActual = new java.util.Date(System.currentTimeMillis());
                //java.sql.Date fechaSql = java.sql.Date.valueOf(fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                //jDateChooser1.setDate(fechaSql);
                
                LocalDate fechaNacimiento = al.getFechaNac();
                java.util.Date fechaNacimientoAsDate = java.util.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDateChooser1.setDate(fechaNacimientoAsDate);
                
                //  JOptionPane.showMessageDialog(null, Integer.parseInt(jTDocumento.getText()));

                /*if (fechaDesdeBaseDeDatos != null) {
                 dateChooser.setDate(fechaDesdeBaseDeDatos);
                }
            }
           } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, " El alumno no existe: " + ex.getMessage());
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } */
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {
            jBBuscarActionPerformed(evt);
            int dni = Integer.parseInt(jTDocumento.getText());

            Alumno alumno = aData.buscarAlumnoPorDni(dni);
            //JOptionPane.showMessageDialog(this,alumno.getIdAlumno());
            if (alumno != null && alumno.isEstado()) {

                //JOptionPane.showMessageDialog(this, alumno.getIdAlumno());
                aData.eliminarAlumno(alumno.getIdAlumno());
                JOptionPane.showMessageDialog(this, "Alumno eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(this, "no hay alumno a eliminar con esos datos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verificar los campos ingresados en DNI");
        }


    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
