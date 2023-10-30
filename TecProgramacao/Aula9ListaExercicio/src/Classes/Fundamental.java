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
public final class Fundamental extends Aluno {
    
    public Fundamental(String nome, String genero, int idade){
        super(nome, genero, idade);
    }

    public Fundamental(String nome, String genero, int idade, float nota) {
        super(nome, genero, idade, nota);
    }

    @Override
    public String getNota() {
        return String.valueOf(super.nota);
    }

    public String getConceito() {
        if (this.nota <= 10 & this.nota > 8) {

            return this.getNome() + " NOTA A";
        } else if (this.nota < 8 & this.nota > 5) {
            return this.getNome() + " NOTA B";
        } else if (this.nota < 5 & this.nota > 3) {
            return this.getNome() + " NOTA C";

        } else {
            return this.getNome() + " NOTA F!";
        }

    }

}
