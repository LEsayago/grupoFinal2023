
package AccesoADatos;

import entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
            
      
}
      
       
       
      