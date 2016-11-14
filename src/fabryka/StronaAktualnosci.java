package fabryka;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StronaAktualnosci implements Strona {
    
    @Override
    public boolean getStrona() {
        String obecnyDir = System.getProperty("user.dir");
        try {
            FileWriter pisacz = new FileWriter(obecnyDir+ "/StronaAktualnosci.html", true);
            pisacz.write(generujKod());
            pisacz.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public String generujKod() {
        String kodhtml = "";
        kodhtml += "<!DOCTYPE html><html><body>\n";
        String[] text = "Liberec – miasto w polnocnych Czechach nad Nysa Luzycka, stolica kraju libereckiego, polozony jest obok Jestda. Osrodek sportow zimowych.".split(" ");
        Random los = new Random();
        int dlugosc = text.length;
        
        for(int j = 0; j < los.nextInt(5)+1; j++) {
            kodhtml += "<div style='border: 3px solid pink;'><p>";
            for(int i = 0; i < los.nextInt(100)+150; i++)
                kodhtml += text[los.nextInt(dlugosc)] + " ";
            kodhtml += "</p></div>";
        }
        
        kodhtml += "</body></html>";
        return kodhtml; 
    }  
}
