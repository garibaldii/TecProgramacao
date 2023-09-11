package Classes_Jogo;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    
    private List<Cartas> listaCartas;

    public Baralho() {
        
        listaCartas = new ArrayList<>();

        Naipes[] naipes = Naipes.values();

        NumerosCartas[] numCartas = NumerosCartas.values();

        for (int i = 0; i < naipes.length; i++) {

            for (int j = 0; j < numCartas.length; j++) {

                Cartas carta = new Cartas(naipes[i], numCartas[j], j + 1);

                listaCartas.add(carta);
            }
        }
    }

}
