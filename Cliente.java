public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int telefone;

    public Cliente(int id, String nome, String email, int telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}
