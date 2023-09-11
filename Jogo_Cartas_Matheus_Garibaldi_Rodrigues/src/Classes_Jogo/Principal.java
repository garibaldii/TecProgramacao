package Classes_Jogo;

/*  Considere o seguinte problema: precisamos criar as classes 
*necessárias para permitir o desenvolvimento de um jogo de cartas. 
Inicialmente não sabemos qual serão as regras do jogo, mas é definido 
que devemos ter um baralho e cartas,
com as seguintes especiações: 

Baralho: deverá armazenar inicialmente 52 cartas distintas, 
e possuir a informação de quantas cartas estão no baralho, e as funcionalidades de embaralhar e dar cartas. 

Cartas: deverá possuir as informações de naipe, sendo paus (♣), ouros (♦), copas (♥) e espadas (♠)
,e seu número, sendo 1 a 10, Valete, Dama e Rei e uma variável valor da carta que será configurado
conforme a definição das regras do jogo. Totalizando assim 52 cartas distintas, formadas por 13
números e 4 naipes. Cartas deverão ter a funcionalidade de informar o seu nome e valor. 

Resolução: considerando o problema apresentado, devemos começar criando duas classes para nosso projeto, 
as classes Baralho e Cartas. Baralho deverá possuir uma coleção de 52 Cartas distintas. 
*/
public class Principal {
//FEITO!!!!! Agora falta jogar para a classe Baralhos!!!


    

    public static void main(String[] args) throws Exception {
        Cartas C1 = new Cartas(Naipes.COPAS, NumerosCartas.CINCO, 5);
        Cartas C2 = new Cartas(Naipes.PAUS, NumerosCartas.DAMA, 10);
        Cartas C3 = new Cartas(Naipes.OUROS, NumerosCartas.TRES, 3);

        System.out.println(C3.naipe);
        System.out.println(C3.numeroBaralho);
        System.out.println(C3.getNome());

        System.out.println(Planetas.MARTE.getNome());

        Baralho baralho = new Baralho();

        System.out.println(baralho);
    }
}
