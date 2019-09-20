package Handel;

import java.io.*;
import java.util.Scanner;

public class Datei {
    private int knr;
    private String vorname;
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

        String kd = knr+"|"+ vorname +"|"+nachnahme+"|"+plz+"|"+ort+"|"+strasse+"|"+hausnr;
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

    public void lesen() throws IOException {
        FileReader fr = new FileReader(dateipfad);
        BufferedReader br = new BufferedReader(fr);
        String zeile1;
        while ((zeile1 = br.readLine()) != null) {
            System.out.println(zeile1);
        }


    }

    public void eingaben(){
        System.out.println("Kundennummer: ");
        Scanner sc = new Scanner(System.in);
        knr = sc.nextInt();
        System.out.println("Vorname: ");
        vorname = sc.next();
        System.out.println("nachname: ");
        nachnahme = sc.next();
        System.out.println("Plz: ");
        plz = sc.next();
        System.out.println("ort: ");
        ort = sc.next();
        System.out.println("Straße: ");
        strasse = sc.next();
        System.out.println("hausnr: ");
        hausnr = sc.next();
    }

    //getter und setter
    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
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
