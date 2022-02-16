package models;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

public class Jugador {
    private int mana;
    private Mazo mazo;

    public Jugador(){
        mana = 0;
        mazo = new Mazo();
    }

    public void jugarCarta(){
    Carta carta = mazo.getCartaTop();

    carta.jugarCarta();
    if(carta instanceof Tierra) {
        mana++;
        System.out.println(Ansi.colorize("Mana incrementado. Maná actual: "+mana, Attribute.RED_BACK()));
    }   }
}
