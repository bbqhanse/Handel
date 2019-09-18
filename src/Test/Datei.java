package Test;

import java.io.*;

public class Datei {
    public void dateiSchreiben() throws IOException {
        for (int i = 0; i <= 100000; i++) {
            FileWriter fw = new FileWriter("ausgabe.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hallo Welt!");
            bw.newLine();
            bw.write("Hallo Welt1!");
            bw.newLine();
            bw.close();
        }
    }

    public void dateiLesen()throws IOException{
        FileReader fr = new FileReader("ausgabe.txt");
        BufferedReader br = new BufferedReader(fr);
        String zeile1;
        while ((zeile1 = br.readLine()) != null) {
            System.out.println(zeile1);
        }
    }
}
