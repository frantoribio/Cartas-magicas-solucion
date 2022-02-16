package models;

import utils.Color;
import utils.Rareza;

public abstract class Hechizo extends Carta {
    private String descripcion;

    public Hechizo(String nombre, String id, Rareza rareza, String descripcion, int vCoste, Color cCoste) {
        super(nombre, id, rareza, vCoste, cCoste);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String cabecera = getNombre() + '(' + getvCoste() +','+ getcCoste() + ')' + '\n';
        String cuerpo = getDescripcion() + '\n';
        return cabecera + cuerpo;
    }
}

