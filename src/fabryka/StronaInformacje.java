package fabryka;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StronaInformacje implements Strona {
    
    @Override
    public boolean getStrona() {
        String currentDir = System.getProperty("user.dir");
        try {
            FileWriter pisacz = new FileWriter(currentDir + "/StronaInformacje.html", true);
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
        String code = "";
        code += "<!DOCTYPE html><html><body>\n<p>";
        String[] text = "Liberec – miasto w polnocnych Czechach nad Nysa Luzycka, stolica kraju libereckiego, polozony jest obok Jestda. Osrodek sportow zimowych.".split(" ");
        Random los = new Random();
        int dlugosc = text.length;
        
        for(int i = 0; i < los.nextInt(100)+150; i++)
            code += text[los.nextInt(dlugosc)] + " ";
        
        code+= "</p></body></html>";
        return code;
    }
}
