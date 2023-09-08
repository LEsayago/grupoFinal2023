/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas E. Sayago
 */
public class UniversidadULP {

    /*
     */
    public static void main(String[] args) {
       
        try {
            //cargar driver 
                Class.forName("org.mariadb.jdbc.Driver");

                //conexion a la db 
                Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");

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
 
             conexion.close();
             
        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Error al cargar Driver.  " + ex.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar DB.  " + ex.getMessage());
        }

    }
}