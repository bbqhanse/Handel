package Handel;

import java.io.*;
import java.util.Scanner;

/**
 * Zum Lesen und Schreiben der Kundendaten in einer datei
 *
 */

public class Datei {
    private int knr;
    private String vorname;
    private String nachnahme;
    private String plz;
    private String ort;
    private String strasse;
    private String hausnr;
    private String email;
    private String dateipfad;


    public Datei(String dateipfad) {
        this.dateipfad = dateipfad;
    }

    public void schreiben() {

        String kd = knr + "|" + vorname + "|" + nachnahme + "|" + plz + "|" + ort + "|" + strasse + "|" + hausnr;
        System.out.println(kd);
        PrintWriter pWriter = null;
        try {
            pWriter =
                    new PrintWriter(new BufferedWriter(new FileWriter(this.dateipfad, true)));
            pWriter.println(kd); //"12|Hans|Meier|10245|Berlin|Hausburgstr.|24");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }

    }

    /**
     *  Liest die datei ein und gibt eine Instanz von {@link Firmenkunde} oder {@link Privatkunde} zurück
     * @param knr Sucht anhand der Kundennummer die Datei durch
     * @return den Kunden mit der Kundennummer
     *
     */

    public Kunde lesen(int knr) {
        // Hier wird ein reader zum lesen des Files erstellt

        try {
            FileReader fr = new FileReader(dateipfad);
            // Bufferreader ein bisschen schneller
            BufferedReader br = new BufferedReader(fr);
            Kunde k;
            String zeile1;
            // hier wird ein array von string erstellt
            String[] teile;
// hier werden alle zeilen eingelesen bis keine zeile mehr vorhanden ist
            while ((zeile1 = br.readLine()) != null) {
                // hier wird die gelesene Zeile anhand des pipe symbol getrennt
                // die beiden \\ dienen zum escapen damit auch wirklich das symbol gemeint ist
                teile = zeile1.split("\\|");
                if (Integer.parseInt(teile[0]) == knr) {
                    System.out.println(zeile1);
                    System.out.println("test");
                    if (Integer.parseInt(teile[0]) <= 500) {
                        k = new Privatkunde(Integer.parseInt(teile[0]), teile[2], teile[1], teile[3], teile[4], teile[5], teile[6]);
                        return k;

                    } else {
                        k = new Firmenkunde(Integer.parseInt(teile[0]), teile[2], teile[1], teile[3], teile[4], teile[5], teile[6]);
                        return k;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    /**
     * Setzen der Variablen
     */

    public void eingaben() {
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

    /*
     * Getter und Setter der Instanz Variablen
     *
     */

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
