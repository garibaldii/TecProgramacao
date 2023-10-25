package Pessoas;

public final class Professor extends Funcionario {

    public String materia;

    public Professor(String nome, String genero, int idade, float salarioBase) {

        super(nome, genero, idade, salarioBase);
    }

    @Override
    public double calculaSalario() {

        return super.salarioBase * 1.05;

    }

    @Override
    public String getNome() {

        if (super.getGenero().equals("masculino")) {

            return "Professor " + super.nome;

        } else {
            return "Professora " + super.nome;
        }
    }
}
