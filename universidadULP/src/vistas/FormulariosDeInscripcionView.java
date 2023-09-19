/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas E. Sayago
 */
public class FormulariosDeInscripcionView extends javax.swing.JInternalFrame {

    private final InscripcionData iData = new InscripcionData();
    private final AlumnoData aData = new AlumnoData();
    private DefaultTableModel modelo;
    private ArrayList<Materia> materias = new ArrayList<>();

    /**
     * Creates new form FormulariosDeTareasView
     */
    public FormulariosDeInscripcionView() {
        this.modelo = new DefaultTableModel();
        initComponents();
        armarCabecera();
        armarCombox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRBmateriasInscrptias = new javax.swing.JRadioButton();
        jRBmateriasnoinscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaDeMaterias = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de Materias");

        jRBmateriasInscrptias.setText("Materias Inscriptas");
        jRBmateriasInscrptias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmateriasInscrptiasActionPerformed(evt);
            }
        });

        jRBmateriasnoinscriptas.setText("Materias no Inscriptas");
        jRBmateriasnoinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmateriasnoinscriptasActionPerformed(evt);
            }
        });

        jTablaDeMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablaDeMaterias);

        jButton1.setText("Inscribir");

        jButton2.setText("Anular Inscripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRBmateriasInscrptias)
                                    .addGap(34, 34, 34)
                                    .addComponent(jRBmateriasnoinscriptas))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(94, 94, 94))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(58, 58, 58)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBmateriasInscrptias)
                    .addComponent(jRBmateriasnoinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBmateriasnoinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmateriasnoinscriptasActionPerformed
        limpiarTabla();
        jRBmateriasInscrptias.setSelected(false);
        Alumno alum = (Alumno) jCAlumnos.getSelectedItem();
        materias = (ArrayList<Materia>) iData.obtenerMateriasNoCursadas(alum.getIdAlumno());


    }//GEN-LAST:event_jRBmateriasnoinscriptasActionPerformed

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed


    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jRBmateriasInscrptiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmateriasInscrptiasActionPerformed
        jRBmateriasnoinscriptas.setSelected(false);
    }//GEN-LAST:event_jRBmateriasInscrptiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBmateriasInscrptias;
    private javax.swing.JRadioButton jRBmateriasnoinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaDeMaterias;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");

        jTablaDeMaterias.setModel(modelo);

    }

    private void armarCombox() {

        try {
            //miConexion conexion = new miConexion("jdbc:mariadb://localhost:3306/universidadulp", "root", "");

            //conexion a la db 
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");
            String sql = " SELECT  dni, apellido,nombre FROM alumno WHERE 1";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();
            Class.forName("org.mariadb.jdbc.Driver");

            while (resultado.next()) {

                jCAlumnos.addItem(resultado.getInt("dni") + ", " + resultado.getString("apellido") + ", " + resultado.getString("nombre"));

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, " error ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, " error ");
        }

    }

    private void limpiarTabla() {

        modelo.setRowCount(0);
    }

    private void llenarTabla(ArrayList<Materia> materias) {

        for (Materia xmateria : materias) {
            Object[] rowData = {xmateria.getIdMateria(), xmateria.getNombre(), xmateria.getAnioMateria()};
            modelo.addRow(rowData);

        }

    }

}
