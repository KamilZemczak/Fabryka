package fabryka;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StronaKontakt implements Strona {
    
    @Override
    public boolean getStrona() {
        String currentDir = System.getProperty("user.dir");
        try {
            FileWriter pisacz = new FileWriter(currentDir + "/StronaKontakt.html", true);
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
        String code = " ";
        Random los = new Random();
        String[] imie = "Mariusz Dawid Szczepano Rafalal Darczenko".split(" ");
        String[] nazwisko = "Krzyzowski Kupniy Szczepanksy Rafalski Jasica".split(" ");
        String[] miasto = "Sosnowiec Olesno Bytom Szydłowianka Zabrze".split(" ");
        String[] ulica = "Wisniowa Porzeczkowa Ksiedza Grzybowa Hagera".split(" ");
        
        code += "<!DOCTYPE html><html><body>\n";
        code += "<p>Dane kontaktowe:</p>";
        code += "<p>" + imie[los.nextInt(imie.length)] + " " + nazwisko[los.nextInt(nazwisko.length)] + "</p>";
        code += "<p>" + los.nextInt(90)+10 + "-" + los.nextInt(900)+100 + " " + miasto[los.nextInt(miasto.length)] + "</p>";
        code += "<p>ulica:" + ulica[los.nextInt(ulica.length)] + " " + los.nextInt(200)+1 + "</p>";
       
       code += "</body></html>";
       return code;
    }
    
}
