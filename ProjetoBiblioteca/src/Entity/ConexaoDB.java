package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_biblioteca";
    private static String usuario = "root";
    private static String senha = "usjt";
    
    public static Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" 
                    + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario,senha);
            return c;
        }
        catch (SQLException e){
            return null;
        }
    }
}
