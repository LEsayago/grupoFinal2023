
package AccesoADatos;

import entidades.Materia;
import java.sql.*;



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

    public void guardarMateria(Materia materia) throws SQLException{
        
        String sql = "INSERT INTO materia(idMateria, nombre, año, estado) "
                    + "VALUES (?, ?, ?, ?, ?)";
        
         try{
                 PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                 ps.setInt(1, materia.getidMateria());
                 ps.setString(2, materia.getNombre());
                 ps.setInt(3, materia.getAño());
                 ps.setBoolean(4, materia.isActivo());
                 ps.executeUpdate();
                 
                 ResultSet rs=ps.getGeneratedKeys();
                 if(rs.next()){
                     
                    materia.setIdMateria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Materia Guardada");          
                 }
                 ps.close();
                 
                 
         }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
         }
    
    }
            
    public void modificarMateria(Materia materia){
        
        String sql= "UPDATE materia SET nombre= ?, año=?, estado=?" + "WHERE idMateria= ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2,materia.getNombre());
            ps.setInt(3, materia.getAnioMateria());
              int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
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
    
      
      
      

}
      
       
       
      