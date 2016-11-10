package fabryka;

import java.util.Random;

public class FabrykaHTML {
    
    private static enum Type {
        ZDJECIA,
        INFORMACJE,
        KONTAKT,
        AKTUALNOSCI
    }
    
    private static Type getLosowyTyp() {
        Typ[] array = Type.values(0);
        return array[new Random().nextInt(array.length)];
    }
    
    public static Page stworzStrone() {
        Typ typ = getRandomTyp();
        
        switch(typ) {
            case ZDJECIA:
                System.out.println("Galeria");
                return new StronaZdjecia();
            case INFORMACJE:
                System.out.println("Informacje");
                return new StronaInformacje();
            case KONTAKT:
                System.out.println("Kontakt");
                return new StronaKontakt();
            case WIADOMOSCI:
                System.out.println("Aktualnosci");
                return new StronaAktualnosci();                
        }
        return null;
    }
}