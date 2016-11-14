package fabryka;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class StronaZdjecia implements Strona {
    
    @Override
    public boolean getStrona () {
        String currentDir = System.getProperty("user.dir");
        try {
            FileWriter pisacz = new FileWriter(currentDir + "/StronaZdjecia.html", true);
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
        code += "<!DOCTYPE html><html><body>=\n";
        
        for(int i = 0; i < new Random().nextInt(10)+1; i++)
            code += "<img src=\"test.img\" alt=\"Tu powinno znalezc sie jakies zdjecie\"></br>";
            code += "</body></html>";
            return code;
    } 
}
