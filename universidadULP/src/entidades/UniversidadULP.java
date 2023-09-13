/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.*;
import java.time.Month;
import javax.swing.JOptionPane;
import AccesoADatos.*;
import java.time.LocalDate;

/**
 *
 * @author Lucas E. Sayago
 */
public class UniversidadULP {

    /*
     */
    public static void main(String[] args) {

        Connection conexion = Conexion.getConexion();

        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData idata = new InscripcionData();

        Alumno alumno = ad.buscarAlumno(9);
      //  JOptionPane.showMessageDialog(null, damian.toString());
        
        Materia materia = md.buscarMateria(55);

      //   JOptionPane.showMessageDialog(null, programacion.toString());
        
        Inscripcion insc = new Inscripcion(alumno, materia, 10);
       // idata.guardarInscripcion(insc);
   
      // idata.actualizarNota(8, 3, 7.0);
       
      // idata.borrarInscripcionesMateriaAlumno(8, 3);

       /* for (Inscripcion x:idata.obtenerInscripciones()){
            
            System.out.println("Inscripcion N°: "+ x.getIdInscripcion());
            System.out.println("Apellido: "+ x.getAlumno().getApellido());
            System.out.println("Materia: "+ x.getMateria().getNombre());
            System.out.println("***************************************************");
        }
        */
       for (Materia m:idata.obtenerMateriasCursadas(7)){
       
           Alumno alumno1= ad.buscarAlumno(7);
           System.out.println("Alumno: "+alumno1);
           System.out.println("Materia: "+m.getNombre());
           System.out.println("Año: "+m.getAnioMateria());
       
       }
           
           
        
                
                
        //ad.guardarAlumno(al);
        // ad.modificarAlumno(al);
        //ad.eliminarAlumno(9);
        //Alumno alumnoEncontrado= ad.buscarAlumno(7);
        //System.out.println("Nombre alumno buscado : "+ alumnoEncontrado.getNombre());
        /* 
      for (Alumno alumno : ad.listarAlumnos()) {
            System.out.println(alumno.toString());
      }
         */
 /*   
        try {
            //cargar driver 
                Class.forName("org.mariadb.jdbc.Driver");

                //conexion a la db 
                Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");
         */
 /*         
          // agregar alumnos a la base de datos 
           
           String sql = "INSERT INTO alumno( dni, apellido, nombre, fechaDeNacimiento, estado) "
                   + "VALUES (38000000, 'Harnisch', 'Hernan', '1990-01-01',true),"
                   + "(37000000,'Leon', 'Ariel','"+LocalDate.of(1991, Month.JANUARY, 1)+"', true);";
           
             PreparedStatement ps = conexion.prepareStatement(sql);
            
            int registro = ps.executeUpdate();
            
            System.out.println("Lineas afectadas : "+registro);
         */
        //agregar materias 
        /*
            String sql = "INSERT INTO materia( nombre, año , estado) "
                    + "VALUES ('Matemáticas','2023',true),"
                    + "('Historia','2023',true),"
                    + "('Biología','2023',true),"
                    + "('Programación','2023',true)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            int registro = ps.executeUpdate();

            System.out.println(registro);
         */
 /*
            // agregar alumnos a materia 
            String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                    + "VALUES (10,7,1),(10,7,4),(10,3,2),(10,3,3),(10,8,4),(10,8,3)";
            
            
            PreparedStatement ps = conexion.prepareStatement(sql);

            int registro = ps.executeUpdate();

            System.out.println(registro);
         */
        // Listar alumnos con nota superior a

        /*       String sql = "SELECT alumno.dni, alumno.apellido, alumno.nombre "
                     + "FROM inscripcion JOIN alumno ON (alumno.idAlumno= inscripcion.idAlumno) "
                     + "WHERE inscripcion.nota>8";*/
 /* 
            String sql = "  SELECT alumno.dni, alumno.apellido, alumno.nombre "
                    + "FROM inscripcion JOIN alumno ON (alumno.idAlumno= inscripcion.idAlumno) "
                    + "WHERE inscripcion.nota>8 ORDER BY idInscripcion DESC";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();

            int i = 0;

            while (resultado.next()&& i<2) {

                System.out.println("DNI " + resultado.getInt("dni"));
                System.out.println("APELLIDO " + resultado.getString("apellido"));
                System.out.println("NOMBRE " + resultado.getString("nombre"));

                i++;
            }
         */
 /*
            // eliminar alumno
            String sql = "DELETE FROM inscripcion WHERE idMateria=2 AND idAlumno=3 or idmateria=4 AND idAlumno=8";

            PreparedStatement ps = conexion.prepareStatement(sql);
            int registro = ps.executeUpdate();

            System.out.println(registro);
         */
 /*    
  
            //modificar datos en la base

            String sql= "UPDATE cliente SET contactoAlternativo=011156135  WHERE dni=37790000";
            
            PreparedStatement ps= conexion.prepareStatement(sql);
            
            int registro = ps.executeUpdate();
            
            System.out.println(registro);
           
         */
 /*
        //eliminar datos de la base

   String sql= "DELETE FROM cliente  WHERE dni=37790000";
            
            PreparedStatement ps= conexion.prepareStatement(sql);
            
            int registro = ps.executeUpdate();
            
            System.out.println(registro);
         */
 /*
             conexion.close();
             
        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Error al cargar Driver.  " + ex.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar DB.  " + ex.getMessage());
        }
         */
    }
}
