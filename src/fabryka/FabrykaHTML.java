package fabryka;

import java.util.Random;

public class FabrykaHTML {
    
    private static enum Typ {
        ZDJECIA,
        INFORMACJE,
        KONTAKT,
        AKTUALNOSCI
    }
    
    private static Typ getLosowyTyp() {
        Typ[] array = Typ.values();
        return array[new Random().nextInt(array.length)];
    }
    
    public static Strona stworzStrone() {
        Typ typ = getLosowyTyp();
        
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
            case AKTUALNOSCI:
                System.out.println("Aktualnosci");
                return new StronaAktualnosci();                
        }
        return null;
    }
}