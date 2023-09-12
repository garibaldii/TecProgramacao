package Classes;

public class Pessoa {
    private String nome, cpf, telefone, endereco;

    // MÉTODOS GETTERS //

    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // ### //

    // MÉTODOS SETTERS //

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // ### //

    // MÉTODO CONSTRUTOR //


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, String telefone) {
        this(nome, cpf);
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf, String telefone, String endereco) {
        this(nome, cpf, telefone);
        this.endereco = endereco;
    }

    // ### Sobrecarga de métodos aplicada! OBRIGATÓRIO COLOCAR NOME & CPF! //

    public static void main(String[] args) throws Exception {
        Pessoa marcelo = new Pessoa("Marcelo Rafael");
        Alunos matheus = new Alunos("Matheus Garibaldi", 123456789, marcelo);

        System.out.println(marcelo.getNome());
        System.out.println(matheus.getNome());                                                                               
    }
}