/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Lucas E. Sayago
 */
public class MenuView extends javax.swing.JFrame {

  
    public MenuView() {
        initComponents();
      
    }  
        //icono del jframe
//        @Override
//        public Image getIconImage(){
//        
//        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("fotitos/ulplogoblanco.jpeg"));
//        
//        return retValue;
//        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritorioMenu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMFormuAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMFormuMateria = new javax.swing.JMenuItem();
        jMAdmin = new javax.swing.JMenu();
        jMinscripcion = new javax.swing.JMenuItem();
        jMCargadenotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMAlumnoPorMateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDEscritorioMenuLayout = new javax.swing.GroupLayout(jDEscritorioMenu);
        jDEscritorioMenu.setLayout(jDEscritorioMenuLayout);
        jDEscritorioMenuLayout.setHorizontalGroup(
            jDEscritorioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jDEscritorioMenuLayout.setVerticalGroup(
            jDEscritorioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(13, 63, 119));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotitos/imagen principal.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 1920));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 1920));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMAlumno.setText("Alumno");

        jMFormuAlumno.setText("Formulario Alumno");
        jMFormuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormuAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMFormuAlumno);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMFormuMateria.setText("Formulario Materia");
        jMFormuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormuMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMFormuMateria);

        jMenuBar1.add(jMMateria);

        jMAdmin.setText("Administracion");

        jMinscripcion.setText("Inscripcion");
        jMinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinscripcionActionPerformed(evt);
            }
        });
        jMAdmin.add(jMinscripcion);

        jMCargadenotas.setText("Manipulacion de notas");
        jMCargadenotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargadenotasActionPerformed(evt);
            }
        });
        jMAdmin.add(jMCargadenotas);

        jMenuBar1.add(jMAdmin);

        jMConsultas.setText("Consultas");
        jMConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasActionPerformed(evt);
            }
        });

        jMAlumnoPorMateria.setText("Alumno por materia");
        jMAlumnoPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnoPorMateriaActionPerformed(evt);
            }
        });
        jMConsultas.add(jMAlumnoPorMateria);

        jMenuBar1.add(jMConsultas);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDEscritorioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDEscritorioMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMFormuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormuMateriaActionPerformed

        // Se borra todo lo que contenga el escritorio en el momento
        jDEscritorioMenu.removeAll();
        // se redibuja
        jDEscritorioMenu.repaint();

        // instancio la clase a la que quiero llamar
        MateriaView materia = new MateriaView();

        // hago visible mi instancia
        materia.setVisible(true);

        // se agrega al escritorio
        jDEscritorioMenu.add(materia);

        // se mueve al frente
        jDEscritorioMenu.moveToFront(materia);


    }//GEN-LAST:event_jMFormuMateriaActionPerformed

    private void jMCargadenotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargadenotasActionPerformed
        jDEscritorioMenu.removeAll();
        jDEscritorioMenu.repaint();
        CargadeNotasView cdn = new CargadeNotasView();
        cdn.setVisible(true);

        jDEscritorioMenu.add(cdn);

        jDEscritorioMenu.moveToFront(cdn);

    }//GEN-LAST:event_jMCargadenotasActionPerformed


    private void jMinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinscripcionActionPerformed
        // Se borra todo lo que contenga el escritorio en el momento
        jDEscritorioMenu.removeAll();
        // se redibuja
        jDEscritorioMenu.repaint();

        // instancio la clase a la que quiero llamar
        FormulariosDeInscripcionView inscripcion = new FormulariosDeInscripcionView();

        // hago visible mi instancia
        inscripcion.setVisible(true);

        // se agrega al escritorio
        jDEscritorioMenu.add(inscripcion);

        // se mueve al frente
        jDEscritorioMenu.moveToFront(inscripcion);

    }//GEN-LAST:event_jMinscripcionActionPerformed

    private void jMFormuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormuAlumnoActionPerformed
        jDEscritorioMenu.removeAll();
        jDEscritorioMenu.repaint();

        FormularioAlumnoView formularioAlumnoView = new FormularioAlumnoView();

        formularioAlumnoView.setVisible(true);

        jDEscritorioMenu.add(formularioAlumnoView);

        jDEscritorioMenu.moveToFront(formularioAlumnoView);

    }//GEN-LAST:event_jMFormuAlumnoActionPerformed

    private void jMConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMConsultasActionPerformed

    private void jMAlumnoPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnoPorMateriaActionPerformed

        //llamar al escritorio
        jDEscritorioMenu.removeAll();
        //repintamos la vista
        jDEscritorioMenu.repaint();

        ListadoAlumnosPorMateriasView listadoAlumnosPorMateriasView = new ListadoAlumnosPorMateriasView();

        listadoAlumnosPorMateriasView.setVisible(true);

        jDEscritorioMenu.add(listadoAlumnosPorMateriasView);
        jDEscritorioMenu.moveToFront(listadoAlumnosPorMateriasView);

    }//GEN-LAST:event_jMAlumnoPorMateriaActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        int result = JOptionPane.showConfirmDialog(
                        MenuView.this,
                        "¿Estás seguro de que deseas cerrar la ventana?",
                        "Confirmar cierre",
                        JOptionPane.YES_NO_OPTION
                );
                 if (result == JOptionPane.YES_OPTION) {
                    // Cierra la ventana
                    dispose();
                };
    }//GEN-LAST:event_jMSalirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                  
                    // Esta es la linea donde traemos la libreria que nos cambia el aspecto de la ventana
                    
                    UIManager.setLookAndFeel(new FlatSolarizedDarkIJTheme());
                
                } catch (UnsupportedLookAndFeelException ex) {
                   JOptionPane.showMessageDialog(null, "Error en el look and feel");
                }
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenuItem jMAlumnoPorMateria;
    private javax.swing.JMenuItem jMCargadenotas;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMFormuAlumno;
    private javax.swing.JMenuItem jMFormuMateria;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMinscripcion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
