package models;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import interfaces.IJugar;
import utils.Color;
import utils.Rareza;

public class Instantaneo extends Hechizo implements IJugar {


    public Instantaneo(String nombre, String id, Rareza rareza, String descripcion, int vCoste, Color cCoste) {
        super(nombre, id, rareza,descripcion, vCoste, cCoste);
    }

    @Override
    public void jugarCarta() {
        System.out.println(Ansi.colorize("Jugando instantaneo: "+ toString(), Attribute.BLUE_BACK()));
        System.out.println();
    }
}
