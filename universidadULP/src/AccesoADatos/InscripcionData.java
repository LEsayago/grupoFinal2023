/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author niqog
 */
public class InscripcionData {

    private Connection con = null;
    private MateriaData matdata;
    private AlumnoData alumnoData;

    private InscripcionData() {

        con = Conexion.getConexion();

    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion(idInscripcion, nota, idAlumno, idMateria)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getIdInscripcion());
            ps.setDouble(2, insc.getNota());
            ps.setInt(3, insc.getAlumno().getIdAlumno());
            ps.setInt(4, insc.getMateria().getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se guardo la inscripcion correctamente");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");

        }

    }

    public List<Inscripcion> obtenerInscripciones() {

        ArrayList <Inscripcion> inscripciones = new ArrayList<>();
        
        String sql= "SELECT * FROM inscripcion " ;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next())  {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                //terminar objetos !!!
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        
        return null;
    }

}
