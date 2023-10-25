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


    
    public String confereClasse(String classe){
    List<Pessoa> aux = new ArrayList<>();
    
        for (int i = 0; i < pessoas.size(); i ++){
               if (pessoas.get(i).getClass().toString().equals(classe) ){
                   aux.add(pessoas.get(i));
               }
              
        }
        
        return aux.toString();
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
