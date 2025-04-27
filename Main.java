import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Caio", "caioba@gmail.com", 992609442);

        try {
            Conexao.conectar();
            System.out.println("Conectado com sucesso!");

            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserir(cliente);


        } catch (SQLException ex) {
            System.out.println("Erro de conexão com o banco: " + ex);;
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());;
        }

    }
}