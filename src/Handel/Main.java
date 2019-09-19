package Handel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // todo Neukunden aufnahme
        int knr;
        String vorname;
        String nachnahme;
        String plz;
        String ort;
        String strasse;
        String hausnr;
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

        Datei d = new Datei("kunde.txt");
        d.setKnr(knr);
        d.setVornahme(vorname);
        d.setNachnahme(nachnahme);
        d.setPlz(plz);
        d.setOrt(ort);
        d.setStrasse(strasse);
        d.setHausnr(hausnr);
        d.schreiben();

    }
}
