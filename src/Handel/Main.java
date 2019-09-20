package Handel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Datei d = new Datei("kunde.txt");
        Kunde k;
        //todo Aufnahme einer Bestellung
        System.out.println("Kundennummer: ");
        Scanner sc = new Scanner(System.in);
        int knr = sc.nextInt();
        k = d.lesen(knr);
        k.ausgabe();


        // todo Neukunden aufnahme


//        d.eingaben();
//        d.schreiben();
    }
}
