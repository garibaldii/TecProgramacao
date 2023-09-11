package Classes_Jogo;

enum Naipes {
    PAUS,
    OUROS,
    COPAS,
    ESPADAS;
}

enum NumerosCartas {
    AS, DOIS, TRES, QUATRO,
    CINCO, SEIS, SETE, OITO,
    NOVE, DEZ, VALETE, DAMA, REI;
}

public class Cartas {

    public final Naipes naipe;
    public final NumerosCartas numeroBaralho;
    public final int valor;

    public Cartas(Naipes naipe, NumerosCartas numeroBaralho, int valor) {
        this.naipe = naipe;
        this.numeroBaralho = numeroBaralho;
        this.valor = valor;
    }



    public String getNome() {
        return "Carta " + numeroBaralho + " " + naipe;
    }

}
