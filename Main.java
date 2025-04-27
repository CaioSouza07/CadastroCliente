import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Conexao.conectar();
            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Erro de conexão com o banco: " + ex);;
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());;
        }

    }
}