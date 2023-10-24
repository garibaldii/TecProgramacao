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
        for (int i = 0; i < pessoas.size(); i++) {
            return pessoas.get(i).getNome() + " ," + (pessoas.get(i)).getGenero() + " " + pessoas.get(i).getIdade() + " anos.";
        }
        return null;
    }

    public String removerPessoas(Object index) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getClass().toString() == )
        }
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
