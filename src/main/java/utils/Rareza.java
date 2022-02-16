package utils;

public enum Rareza {
    COMUN,
    POCOCOMUN,
    RARA,
    MITICA;

    public static Rareza get(int i){
        if(i == 0)
            return COMUN;
        else if (i == 1)
            return POCOCOMUN;
        else if (i == 2)
            return RARA;
        else return MITICA;
    }
}
