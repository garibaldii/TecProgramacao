/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroexjava;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alunos
 */
public class PrimeiroExJava {


       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //List<Pessoa> arvoreG = new ArrayList<>(); 
       
       Pessoa [] arvoreG = new Pessoa[10];
       //Avós
       arvoreG[0] = new Pessoa("Argemiro");
       arvoreG[1] = new Pessoa("Maria");
       //Pais
       arvoreG[2] = new Pessoa("Jana");
       arvoreG[3] = new Pessoa("Marcelo", 53);
       //Eu
       arvoreG[4] = new Pessoa("Matheus", 21, arvoreG[2]);
       //Meu irmão
       arvoreG[5] = new Pessoa("Marcel", 31, arvoreG[2]);
      
        System.out.println(arvoreG[4].getNome() + " => Mãe: " + arvoreG[4].getMae());
        
        
        

        
        
        
        // New - cria uma instância da classe(objeto)//
       
        
        
        
        //matheus.mae = jana;     
        //matheus.pai = marcelo;
        
        //Aqui, o Matheus aponta para a sua mãe, porém, jana não está dentro do escopo matheus, ele somente deixa apontado que a jana é sua mae//
        
        //Filhos
        Pessoa tereza;
        tereza = new Pessoa("Tereza", 13);
        
        
        //marcelo.filhos.add(pietro);
        //marcelo.filhos.add(tereza);
   
        
        //msg = matheus.mae.nome + " é mãe do " + matheus.nome + " e " + matheus.pai + " é seu pai.";
        
        //msg2 = "Marcelo tem " + marcelo.filhos.size() + " filhos: " + marcelo.nomeFilhos();
        
                
        //System.out.println(msg + "\n" + msg2);
    }
    
}
