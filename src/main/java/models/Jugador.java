package models;

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
    if(carta instanceof Tierra)
        mana++;
    }
}
