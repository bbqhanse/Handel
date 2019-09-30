package Handel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {

    private TextField tf1;
    private int knr;

    public MyMouseListener(TextField tf1) {
        this.tf1 = tf1;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //todo Neukunde aufnahme
        Kunde k;
        knr = Integer.parseInt(tf1.getText());
        if (knr <=500){
            k = new Privatkunde(knr);
            k.ausgabe();
        } else{
            k = new Firmenkunde(knr);
        }

//        Datei d = new Datei("kunde.txt");
//        d.schreiben(k);
    }
}
