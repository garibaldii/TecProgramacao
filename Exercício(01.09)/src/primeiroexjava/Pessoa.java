package primeiroexjava;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    // ENCAPSULAMENTO DE ATRIBUTOS Questão1 //
    private String nome;
    private Pessoa mae, pai;
    private int idade;
    private List<Pessoa> filhos = new ArrayList<>();
    private List<Pessoa> irmaos = new ArrayList<>();

    // ### //
    // MÉTODOS GETTERS  Questão2//
    public String getNome() {
        return nome;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public int getIdade() {
        return idade;
    }

    // ### //
    // MÉTODO SETTER Questão2//
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setFilhos (List<Pessoa> filhos){
        this.filhos = filhos;
    }
    
    public void setIrmaos (List<Pessoa> irmaos){
        this.irmaos = irmaos;
    }

    // ### //
    // Construtores // 
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {// <- método construtor, possui nome da classe
        this(nome);
        this.idade = idade;
        //THIS - variável nome vai ser atribuída ao atributo nome da classe pessoa, mas nao o parâmetro, mesmo tendo outro nome
        //isso ajuda para que não se confunda ao colocar o parâmetro com o mesmo nome dos atributos da classe e pensar que estão
        //linkados, masssss não estão//
    }

    public Pessoa(String nome, int idade, Pessoa mae) {
        this(nome, idade);
        setMaternidade(mae);
        setIrmandade(mae);
        
        
    }

    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai) {
        this(nome, idade, mae);
        this.pai = pai;
    }

    // ### //
    
    public String nomeFilhos() {
        String mensagem = "Meus filhos são ";

        for (int i = 0; i < filhos.size(); i++) {

            mensagem += filhos.get(i).nome + ", ";

            if (i < filhos.size() - 1) {

                mensagem += ", ";

            }
        }
        return mensagem;

    }

    public int qtdFilhos(){
        return this.filhos.size();
    }
    
    public String nomeIrmaos() {
        String mensagem = "";

        for (int i = 0; i < irmaos.size(); i++) {

            mensagem += irmaos.get(i).nome;

            if (i < irmaos.size() - 1) {

                mensagem +=  ". ";
               
            }
        }
        return mensagem;
    }
    
    public int qtdIrmaos(){
        return this.irmaos.size();
    }
    
    public void setMaternidade(Pessoa mae){
        this.mae = mae;
        mae.addFilho(this);
    }
    
    private void addFilho(Pessoa filho){
        filhos.add(filho);
    }
    
    
    public void setIrmandade(Pessoa mae){
        this.mae = mae;
        this.addIrmao(mae.filhos);
        

    }
    
    public void addIrmao(List<Pessoa> irmaos){ //esse método vai percorrer a lista de irmaos 
        for ( int i = 0; i < irmaos.size() ; i ++){
            if (this != irmaos.get(i)){
                    this.irmaos.add(irmaos.get(i));
                    irmaos.get(i).irmaos.add(this); 
            
            }
        }
    }

}
