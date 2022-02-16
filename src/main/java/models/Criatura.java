package models;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import interfaces.IJugar;
import utils.Color;
import utils.Habilidad;
import utils.Rareza;

public class Criatura extends Carta implements IJugar {
    private String descripcion;
    private Habilidad habilidad;
    private int vida;
    private int ataque;


    public Criatura(String nombre, String id, Rareza rareza, String descripcion, Habilidad habilidad, int vida, int ataque, int vCoste, Color color) {
        super(nombre, id, rareza, vCoste, color);
        this.descripcion = descripcion;
        this.habilidad = habilidad;
        this.vida = vida;
        this.ataque = ataque;

    }



    @Override
    public String toString() {
        String cabecera = getNombre() + '(' + getvCoste() +','+ getcCoste() + ')' + '\n';

        String cuerpo = descripcion + '\n' +
                "HABILIDAD: " + habilidad + '\n' +
                "ATAQUE: " + ataque + " VIDA: " + vida;
        return cabecera + cuerpo;
    }

    /**
     * La criatura ataca a su objetivo
     * @param objetivo
     * @return
     */
    public Criatura atacarCriatura(Criatura objetivo){
        this.vida -= objetivo.ataque;
        objetivo.vida -= this.ataque;
        return objetivo;
    }
    @Override
    public void jugarCarta() {
        System.out.println(Ansi.colorize("Juango criatura:" + toString(), Attribute.GREEN_BACK()));
        System.out.println();
    }


}
