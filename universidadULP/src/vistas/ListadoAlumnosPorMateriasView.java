/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niqog
 */
public class ListadoAlumnosPorMateriasView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private MateriaData mdata = new MateriaData();
    private InscripcionData idata = new InscripcionData();

    /**
     * Creates new form ListadoAlumnosPorMaterias
     */
    public ListadoAlumnosPorMateriasView() {
        initComponents();
        // modelo = (DefaultTableModel) jTable1.getModel();
        armarCabecera();
        armarComboBox();

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
        jCmateria = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una materia :");

        jCmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmateriaActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmateriaActionPerformed
        // borramos las filas
        modelo.setRowCount(0);

        //llenamos el array con todos los alumnos de esa materia
        Materia materia = (Materia) jCmateria.getSelectedItem();
        ArrayList<Alumno> listadAlumuno = (ArrayList) idata.obtenerAlumnosXMateria(materia.getIdMateria());

        //llenar la tabla con los datos de el array creado
        for (Alumno alumno : listadAlumuno) {
            Object[] rowData = {alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(),alumno.getNombre() };
            modelo.addRow(rowData);


    }//GEN-LAST:event_jCmateriaActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Materia> jCmateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");

        jTable1.setModel(modelo);

    }

    private void armarComboBox() {

        MateriaData md = new MateriaData();
        ArrayList<Materia> materias = (ArrayList) md.listarMaterias();

        for (Materia materia : materias) {
            jCmateria.addItem(materia);
        }

    }

}
