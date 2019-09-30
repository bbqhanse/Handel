package Handel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListenerLesen extends MouseAdapter {
    private TextField tf1;
    private TextField tf2;
    private TextField tf3;
    private int knr;

    public MyMouseListenerLesen(TextField tf1) {
        this.tf1 = tf1;
    }

    public MyMouseListenerLesen(TextField tf1, TextField tf2, TextField tf3) {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.tf3 = tf3;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.err.println("klappt");
        knr = Integer.parseInt(tf1.getText());
        Bestellung b = new Bestellung(knr);
        Datei d = new Datei("kunde.txt");
        d.lesen(b.getKunde());
        tf2.setText(b.getKunde().getNachname());
        tf3.setText(b.getKunde().getVorname());

    }
}
