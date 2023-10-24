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
public abstract class Funcionario extends Pessoa {
    protected float salarioBase;
    
    public Funcionario(String nome, String genero, int idade){
        super(nome, genero, idade);
    }

    public Funcionario(String nome, String genero, int idade, float salarioBase) {
        super(nome, genero, idade);
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    @Override
    
    public String getNome() {

        if (super.getGenero().equals("Masculino")) {

            return "Sr. " + super.nome;

        } else {
            return "Sra. " + super.nome;
        }

    }
    
    public float getSalarioBase(){
        return salarioBase;
    }
    

    public float setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;

        return salarioBase;
    }



    public void registrarPonto() {
    };// Acessar o BD e registrar o horário //

    

}

