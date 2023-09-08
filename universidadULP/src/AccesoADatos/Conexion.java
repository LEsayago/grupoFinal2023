package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/universidadulp";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection conexion = null;  // lo que importa  

    private Conexion() {
    }

    
    
      
    public static Connection getConexion() {

        if (conexion == null) {  // si es la primera vez
            try {

//cargamos las clases de mariadb que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");

                conexion = DriverManager.getConnection(url, usuario, password);
                
                
            } catch (SQLException | ClassNotFoundException ex) {  // si me olvide de importar la libreria // error al cargar los drivers
                JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos");
            }
        }
        return conexion; // retorna la conexion establecida
    }
}
