package models;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import interfaces.IJugar;
import utils.Color;
import utils.Rareza;

public class Conjuro extends Hechizo implements IJugar {

    public Conjuro(String nombre, String id, Rareza rareza, String descripcion, int vCoste, Color cCoste) {
        super(nombre, id, rareza, descripcion, vCoste, cCoste);
    }


    /**
     * muestra por pantalla el cojuro jugado en azul
     */
    @Override
    public void jugarCarta() {
        System.out.println(Ansi.colorize("Jugando conjuro: " + toString(), Attribute.BLUE_BACK()));
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
