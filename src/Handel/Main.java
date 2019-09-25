package Handel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //todo Neukunde aufnahme

        int knr;
        Kunde k;
        System.out.println("Kundennummer: ");
        Scanner sc = new Scanner(System.in);
        knr = sc.nextInt();
        if(knr <= 500){
            k= new Privatkunde(knr);
        }else{
            k= new Firmenkunde(knr);
        }
        k.eingaben();

        /*    try {
            Datei d = new Datei("kunde.txt");
            Kunde k;
            //todo Aufnahme einer Bestellung

            System.out.println("Kundennummer: ");
            Scanner sc = new Scanner(System.in);
            int knr = sc.nextInt();
            k = d.lesen(knr);
            k.ausgabe();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        // todo Neukunden aufnahme


//        d.eingaben();
//        d.schreiben();

         */
    }
}
