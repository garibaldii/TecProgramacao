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
public final class Professor extends Funcionario {

    public String materia;
    
    public Professor(String nome, String genero, int idade){
        super(nome, genero, idade);
    }

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

            return super.nome;

        } else {
            return super.nome;
        }
    }
}

