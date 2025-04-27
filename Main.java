import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Isinha", "isinha@gmail.com", 992609445);

        try {
            Conexao.conectar();
            System.out.println("Conectado com sucesso!");

            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserir(cliente);

            clienteDAO.select();


        } catch (SQLException ex) {
            System.out.println("Erro de conexão com o banco: " + ex);;
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());;
        }

    }
}