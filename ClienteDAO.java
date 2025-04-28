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

    public void selectPorNome(String nome) throws SQLException {
        String query = "SELECT * FROM clientes WHERE nome = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nomeCliente = rs.getString("nome");
                    String email = rs.getString("email");
                    int telefone = rs.getInt("telefone");
                    System.out.println("Id: " + id + ", nome: " + nomeCliente + ", email: " + email + ", tel: " + telefone);
                }
            }
        }
    }

    public void update(Cliente cliente) throws SQLException{
        String query = "UPDATE clientes SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1,cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setInt(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException{
        String query = "DELETE clientes WHERE id = ?";
       try(Connection conn = Conexao.conectar();
           PreparedStatement stmt = conn.prepareStatement(query)){

           stmt.setInt(1, id);
           stmt.executeUpdate();

       }

    }





}
