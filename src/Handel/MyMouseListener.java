package Handel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {

    private TextField tf1;
    private TextField tf2;
    private TextField tf3;
    private int knr;
    private String vorname;
    private String nachname;
    private String plz;
    private String ort;
    private String strasse;
    private String hausnr;
    private String email;

    public MyMouseListener(TextField tf1,TextField tf2,TextField tf3) {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.tf3 = tf3;
        plz="22111";
        ort="Hamburg";
        strasse= "hauptstr";
        hausnr="14a";
        email="test@test.de";


    }

    @Override
    public void mousePressed(MouseEvent e) {
        //todo Neukunde aufnahme
        Kunde k;
        knr = Integer.parseInt(tf1.getText());
        vorname = tf2.getText();
        nachname= tf3.getText();




        if (knr <= 500) {
            k = new Privatkunde(knr,nachname,vorname,plz,ort,strasse,hausnr,email);
            k.ausgabe();
        } else {
            k = new Firmenkunde(knr,nachname,vorname,plz,ort,strasse,hausnr,email);
        }


//        Datei d = new Datei("kunde.txt");
//        d.schreiben(k);
    }
}
