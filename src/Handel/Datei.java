package Handel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Datei {
    private int knr;
    private String vornahme;
    private String nachnahme;
    private String plz;
    private String ort;
    private String strasse;
    private String hausnr;
    private String dateipfad;

    public Datei(String dateipfad) {
        this.dateipfad = dateipfad;
    }

    public void schreiben() {

        String kd = knr+"|"+vornahme+"|"+nachnahme+"|"+plz+"|"+ort+"|"+strasse+"|"+hausnr;
        System.out.println(kd);
        PrintWriter pWriter = null;
        try {
            pWriter =
                    new PrintWriter(new BufferedWriter(new FileWriter(this.dateipfad, true)));
            pWriter.println(kd);//"12|Hans|Meier|10245|Berlin|Hausburgstr.|24"

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }

    }

    public String lesen() {
        return "a";
    }


    //getter und setter
    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }

    public String getVornahme() {
        return vornahme;
    }

    public void setVornahme(String vornahme) {
        this.vornahme = vornahme;
    }

    public String getNachnahme() {
        return nachnahme;
    }

    public void setNachnahme(String nachnahme) {
        this.nachnahme = nachnahme;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }
}
