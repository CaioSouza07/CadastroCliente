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

   // metodo de select
   public void select() throws SQLException{
       String query = "SELECT * FROM clientes";
       try(Connection conn = Conexao.conectar();
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(query)){

           while (rs.next()){
               int id = rs.getInt("id");
               String nome = rs.getString("nome");
               String email = rs.getString("email");
               int telefone = rs.getInt("telefone");
               System.out.println("Id: " + id+ ", nome: " + nome + ", email: " + email + ", tel: " + telefone);
           }
       }


   }

}
