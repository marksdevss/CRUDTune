package MODELS;

public class ClientesModel {

    private int id_clientes;

    private String nome_cliente;

    private String cpf;
    
    private String email;
    
    private String telefone;
    

    public ClientesModel() {
    }

    public ClientesModel(int id_clientes, String nome_cliente, String cpf, String email, String telefone) {
        this.id_clientes = id_clientes;
        this.nome_cliente = nome_cliente;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
