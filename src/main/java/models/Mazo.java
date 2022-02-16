package models;

import utils.RandomUtils;
import utils.Rareza;

public class Mazo {
    private Pila<Carta> mazo;
    private int size;
    private boolean mitica;

    public Mazo() {
        size = 20;
        mazo = new Pila<Carta>();
        mitica = false;
        for (int i = 0; i < size; i++) {
            Carta c = RandomUtils.rngCarta(i);
            while (c.getRareza() == Rareza.MITICA && mitica)
                c = RandomUtils.rngCarta(i);
            if (c.getRareza() == Rareza.MITICA) mitica = true;
            mazo.push(RandomUtils.rngCarta(i));
        }
    }


    public Carta getCartaTop() {
        return mazo.pop();
    }

    public Carta verCartaTop() {
        return mazo.cima();
    }

    public void printMazo() {
        Pila<Carta> auxMazo = new Pila<Carta>();
        Carta aux;
        while (!mazo.isEmpty()) {
            aux = mazo.pop();
            aux.printCarta();
            auxMazo.push(aux);
            System.out.println();
        }


    }


}
