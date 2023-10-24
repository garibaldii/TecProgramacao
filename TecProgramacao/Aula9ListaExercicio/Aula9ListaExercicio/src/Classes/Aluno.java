/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public abstract class Aluno extends Pessoa {

    protected float nota;
    
    public Aluno(String nome, String genero, int idade){
        super(nome, genero, idade);
    }

    public Aluno(String nome, String genero, int idade, float nota) {
        super(nome, genero, idade);
        this.nota = nota;
    }
    

    public abstract String getNota();

    public void setNota(float nota){
        this.nota = nota;
    }

    public String getNome() {

        if (super.getGenero().equals("masculino")) {

            return "Aluno " + super.nome;

        } else {
            return "Aluna " + super.nome;
        }
    }

    public String getConceito() {
        if (this.nota < 5) {

            return this.getNome() + " reprovado";
        } else {
            return this.getNome() + " aprovado";
        }

    }

}
