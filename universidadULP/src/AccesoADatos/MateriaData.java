package AccesoADatos;

import entidades.Materia;
import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico/Enzo
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia( idMateria, nombre, año, estado) "
                + "VALUES ( ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnioMateria());
            ps.setBoolean(4, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre= ?, año=?, estado=? WHERE idMateria= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

    }

    public void eliminarMateria(int id) {

        try {
            String sql = "UPDATE materia set estado = 0 WHERE idMateria= ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Materia Eliminada");

            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }

    }

    public Materia buscarMateria(int Id) {

        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";

        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(Id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe materia con ese ID ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
        return materia;
    }

    public List<Materia> listarMaterias() {

        ArrayList<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT  * FROM materia WHERE  estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return materias;

    }

}
