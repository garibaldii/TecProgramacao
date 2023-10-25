package Pessoas;

public final class Colegial extends Aluno {
    String serie;

    public Colegial(String nome, String genero, int idade, float nota, String serie) {
        super(nome, genero, idade, nota);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String getNota() {
        return String.valueOf(super.nota);
    }

}
