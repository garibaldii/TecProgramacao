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

    
    public List<Pessoa> excluirPessoas(String classe, String nome, String genero, int idade){
        List<Pessoa> listaAtualizada = new ArrayList<>();
        for (int i = 0; i < pessoas.size(); i++){
            
            if ((pessoas.get(i).getClass().toString()).equals(classe) & pessoas.get(i).getNome().equals(nome) & pessoas.get(i).getGenero().equals(genero) & pessoas.get(i).getIdade() == idade){
                continue;
            }
            else{
                listaAtualizada.add(pessoas.get(i));

// precisa atualizar a lista já existente, se não ele deixará de existir na lista atualizada e continuará existindo na lista padrão
            }
    }
    pessoas = listaAtualizada;
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
