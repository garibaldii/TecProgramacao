/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Controle {

    private List<Pessoa> pessoas = new ArrayList<>();

    
    
    
    public String getPessoas() {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < pessoas.size(); i++) {

            result.append(pessoas.get(i).getNome()).append(", ").append(pessoas.get(i).getGenero()).append(" ").append(pessoas.get(i).getIdade()).append(" anos").append("  ");

        }
        return result.toString();
        
    }


    
    
    
    
    public List<Pessoa> confereClasse(Class classe) {
        
        List<Pessoa> aux = new ArrayList<>();

        for (int i = 0; i < pessoas.size(); i++) {
            
            if (classe.isInstance(pessoas.get(i))) {
                
                    aux.add(pessoas.get(i));

                }

            }

            return aux;
        }

    
    public List<Pessoa> excluirPessoas(String classe, String nome, String genero){
        
        for (int i = pessoas.size() - 1; i >= 0; i--){
            Pessoa pessoa = pessoas.get(i);
            
            if (pessoa.getNome().equals(nome) && pessoa.getGenero().equals(genero)){ //pensei em pessoa.getClass.toString().equals(classe), porém como será aplicado o toString() sendo que ele sofreu um @override para se encaixar no retorno da String e não do endereçamento da memória na implementacao da funcao confereClasse em FormInterface.tipoInputActionPerformed(). 
                pessoas.remove(pessoa);
            }
    }

    System.out.print(pessoas);
    return pessoas;
    
    }
    
    
    public void cadastrarAdm(String nome, String genero, int idade) {
        pessoas.add(new Administrativo(nome, genero, idade));
    }

    public void cadastrarProfessor(String nome, String genero, int idade) {
        pessoas.add(new Professor(nome, genero, idade));
    }

    public void cadastrarColegial(String nome, String genero, int idade) {
        pessoas.add(new Colegial(nome, genero, idade));

    }

    public void cadastrarFundamental(String nome, String genero, int idade) {
        pessoas.add(new Fundamental(nome, genero, idade));
    }

    public int lenght() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
