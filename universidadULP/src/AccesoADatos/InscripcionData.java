/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import entidades.Inscripcion;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import entidades.Alumno;
import entidades.Materia;
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
    private MateriaData matdata = new MateriaData();
    private AlumnoData alumnoData = new AlumnoData();

    public InscripcionData() {

        con = Conexion.getConexion();

    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion( nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                insc.setIdInscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion realizada con exito");

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");

        }

    }

    public List<Inscripcion> obtenerInscripciones() {

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();

                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(alumnoData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matdata.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(alumnoData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matdata.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {

        ArrayList<Materia> materias = new ArrayList<>();
        MateriaData md = new MateriaData();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = md.buscarMateria(rs.getInt("idMateria"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {

        ArrayList<Materia> materiasNocursadas = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 and  idMateria not in (SELECT idMateria FROM inscripcion WHERE idAlumno = ?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia materia = matdata.buscarMateria(rs.getInt("idMateria")); // genera objeto Materia

                materiasNocursadas.add(materia);// Aca agrego el objeto

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }

        return materiasNocursadas;
    }

    public void borrarInscripcionesMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idMateria= ? AND idAlumno= ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idMateria);
            ps.setInt(2, idAlumno);

            int exito = ps.executeUpdate();

            if (exito > 0) {

                JOptionPane.showMessageDialog(null, " Inscripcion borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error! " + ex.getMessage());
        }

    }

    public void actualizarNota(int idAlumno, int IdMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota=?  WHERE idAlumno=? AND idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, IdMateria);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, " Nota actualizada.");
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT a.idAlumno, dni, nombre , apellido , fechaDeNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado=1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));

                alumnos.add(alumno);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al ingresar a la tabla Inscripcion! " + ex.getMessage());
        }

        return alumnos;
    }

}
