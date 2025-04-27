import java.sql.*;

public class ClienteDAO {
    // método de insert
   public void inserir(Cliente cliente) throws SQLException{
       String query = "INSERT INTO clientes (nome, email, telefone) VALUES (?,?,?)";

       try(Connection conn = Conexao.conectar();
           PreparedStatement stmt = conn.prepareStatement(query)){

           stmt.setString(1,cliente.getNome());
           stmt.setString(2, cliente.getEmail());
           stmt.setInt(3, cliente.getTelefone());
           stmt.executeUpdate();
       }
   }

   public void select(Cliente cliente){
       String query = "SELECT * FROM clientes";



   }

}
