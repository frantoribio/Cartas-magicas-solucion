package utils;

public enum Color {
    ROJA,
    AZUL,
    VERDE,
    BLANCA,
    NEGRA;

    public static Color get(int i){
        if (i == 0) return ROJA;
        else if (i == 1) return AZUL;
        else if (i == 2) return VERDE;
        else if(i == 3) return BLANCA;
        else return NEGRA;
    }
}