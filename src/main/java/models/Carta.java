package models;

import interfaces.IJugar;
import utils.Color;
import utils.Rareza;

public abstract class Carta implements IJugar {
    private String nombre;
    private String id;
    private Rareza rareza;
    private int vCoste;
    private Color tCoste;


    public Carta(String nombre, String id, Rareza rareza, int vCoste, Color cCoste){
        setNombre(nombre);
        setId(id);
        setRareza(rareza);
        setvCoste(vCoste);
        settCoste(cCoste);
    }

//Getters y setters
    public int getvCoste() {
        return vCoste;
    }

    public void setvCoste(int vCoste) {
        this.vCoste = vCoste;
    }

    public Color getcCoste() {
        return tCoste;
    }

    public void settCoste(Color tCoste) {
        this.tCoste = tCoste;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rareza getRareza() {
        return rareza;
    }

    public void setRareza(Rareza rareza) {
        this.rareza = rareza;
    }

//-----------------//

    /**
     * Imprime una carta
     */
    public void printCarta(){
        System.out.println(this.toString());
    }

    /**
     * Juega la carta actual
     */
    @Override
    public void jugarCarta(){
        System.out.println("jugando carta");
    }
    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", rareza=" + rareza +
                ", vCoste=" + vCoste +
                ", tCoste=" + tCoste +
                '}';
    }
}
