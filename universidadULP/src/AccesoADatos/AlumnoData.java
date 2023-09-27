package AccesoADatos;

import entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaDeNacimiento, estado)"
                + "VALUES(?, ?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql");
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni= ?, apellido = ?, nombre = ?, fechaDeNacimiento= ?, estado=? "
                + "WHERE idAlumno= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5,alumno.isEstado());
            ps.setInt(6, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
    }

    public void eliminarAlumno(int id) {

        try {
            String sql = "UPDATE alumno set estado = 0 WHERE idAlumno= ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                //JOptionPane.showMessageDialog(null, "Alumno Eliminado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }

    }

    public Alumno buscarAlumno(int Id) {

        String sql = "SELECT  dni, apellido, nombre, fechaDeNacimiento, estado FROM alumno WHERE idAlumno = ?";

        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                alumno = new Alumno();
                alumno.setIdAlumno(Id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaDeNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe alumno con ese ID ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }catch (NullPointerException ex){
        JOptionPane.showMessageDialog(null," No se encontró el alumno. 4");
        } catch (Exception ex){
        JOptionPane.showMessageDialog(null," No se encontró el alumno. (3) ");
    }
        
        
        return alumno;

    }

    /*public Alumno buscarAlumnoPorDni(int dni) {

        String sql = "SELECT  idAlumno, apellido, nombre, fechaDeNacimiento, estado FROM alumno WHERE dni = ? AND estado=1";

        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaDeNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe alumno con ese DNI ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
        return alumno;

    }*/
    public Alumno buscarAlumnoPorDni(int dni) {

    String sql = "SELECT idAlumno, dni, apellido, nombre, fechaDeNacimiento, estado FROM alumno WHERE dni = ?";

    Alumno alumno = null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            alumno = new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            
            // Obtener la fecha de nacimiento y convertirla a LocalDate
            Date fechaNacimiento = rs.getDate("fechaDeNacimiento");
            if (fechaNacimiento != null) {
                alumno.setFechaNac(fechaNacimiento.toLocalDate());
            }
            
            alumno.setEstado(rs.getBoolean("estado"));

        } else {
            JOptionPane.showMessageDialog(null, "No existe alumno con ese DNI");
        }

        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
    } catch (NullPointerException ex){
        JOptionPane.showMessageDialog(null," No se encontró el alumno. ");
    } catch (Exception ex){
        JOptionPane.showMessageDialog(null," No se encontró el alumno. (2) ");
    }
            
            
    return alumno;
}


    public List<Alumno> listarAlumnos() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        try {
            String sql = "SELECT  * FROM alumno WHERE  estado=1";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {                
                
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaDeNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                
                alumnos.add(alumno);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. "+ ex.getMessage() );
        }
        return alumnos;

    }

}
