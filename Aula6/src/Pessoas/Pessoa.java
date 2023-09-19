package Pessoas;

// ADICIONAR ENUM (MASCULINO E FEMININO);

public abstract class Pessoa {
    protected String nome;
    private String genero;
    private int idade;


    public Pessoa(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    // ### Getter's ### //

    public abstract String getNome();

    public String getGenero(){
        return genero;
    }

    public int getIdade(){
        return idade;
    }

    // ### //

    // ### Setter's ### //

    public void setNome( String nome ){
        this.nome = nome;

    }

    public void setGenero(String genero){
        this.genero = genero;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    // ### //



}
