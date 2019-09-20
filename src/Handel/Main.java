package Handel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //todo Aufnahme einer Bestellung
        System.out.println("Kundennummer: ");
        Scanner sc = new Scanner(System.in);
        int knr = sc.nextInt();


        // todo Neukunden aufnahme
        Datei d = new Datei("kunde.txt");

//        d.eingaben();
//        d.schreiben();
        d.lesen(knr);
    }
}
