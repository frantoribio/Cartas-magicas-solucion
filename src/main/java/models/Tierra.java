package models;

import interfaces.IJugar;
import utils.Color;
import utils.Rareza;

public class Tierra extends Carta implements IJugar {
    private Color color;

    public Tierra(String nombre, String id, Rareza rareza, Color color) {
        super(nombre, id, rareza, 0, color);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void jugarCarta() {
        System.out.println("Jugando tierra: " + color);
    }

    @Override
    public String toString() {
        return "Tierra " + color;
    }
}
