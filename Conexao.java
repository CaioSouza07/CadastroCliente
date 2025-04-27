import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ProjetoCadastro;encrypt=false;integratedSecurity=true;";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL);
    }

}
