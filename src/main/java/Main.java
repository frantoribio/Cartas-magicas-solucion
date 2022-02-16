import models.*;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Mazo mazo = new Mazo();
        Jugador jugador = new Jugador();
        for (int i = 0; i < 20; i++) {
            jugador.jugarCarta();
        }
    }
}
