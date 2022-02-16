package utils;

import models.*;

import java.util.Random;

public class RandomUtils {
    private static final String alph = "abcdefghijklmnopqrstuvw";

    public static Color randColor() {
        Random r = new Random();
        Color c = null;
        return Color.get(r.nextInt(Color.values().length));
    }

    public static Rareza randRareza() {
        Rareza rareza = null;
        Random r = new Random();

        return Rareza.get(r.nextInt(Rareza.values().length));
    }

    public static String randString(int length) {
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            s.append(alph.charAt(r.nextInt(alph.length())));
        }
        return s.toString();
    }

    public static Carta rngCarta(int num) {
        Carta carta = null;

        Random r = new Random();
        int n = r.nextInt(4);

        switch (n) {
            //crea criatura
            case 0:
                carta = new Criatura("Criatura", RandomUtils.randString(3),
                        RandomUtils.randRareza(), RandomUtils.randString(10),
                        Habilidad.DOBLEGOLPE, r.nextInt(5), r.nextInt(5),
                        r.nextInt(5), RandomUtils.randColor());
                break;
            //crea tierra
            case 1:
                carta = new Tierra("Tierra", "" + num, RandomUtils.randRareza(), RandomUtils.randColor());
                break;
            //crea conjuro
            case 2:
                carta = new Conjuro("Conjuro", RandomUtils.randString(3), RandomUtils.randRareza(),
                        RandomUtils.randString(10), 3, RandomUtils.randColor());
                break;
            //crea instantaneo
            case 3:
                carta = new Instantaneo("Instantaneo", RandomUtils.randString(3), RandomUtils.randRareza(),
                        RandomUtils.randString(10), 3, RandomUtils.randColor());
                break;
            default:
                break;
        }
        return carta;
    }
}
