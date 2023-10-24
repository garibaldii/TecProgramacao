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
public final class Colegial extends Aluno {
    String serie;
    
    public Colegial(String nome, String genero, int idade){
        super(nome, genero, idade);
    }


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

