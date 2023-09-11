package Classes_Jogo;
//EXEMPLO PARA MELHOR ENTENDIMENTO DE ENUM.
/* 
 * ao meu ver, enum é parecido com uma classe. Cada "Conjunto" constante
 * dentro de enum pode ser considerado um objeto, onde ao criar o método
 * construtor Planetas, torna-se obrigatório que todos os objetos(conjuntos)
 * do enum sigam o padrão de contrução, sendo assim, é obrigatória a especificação
 * do nome da instância ao objeto. 
*/
public enum Planetas {
    TERRA("Terra"),
    SATURNO("Saturno"),
    MARTE("Marte");

    private String nome;

    private Planetas (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
