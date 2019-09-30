package Handel;

import java.awt.*;

public class Gui extends Frame {

   private Label label;
   private TextField tf1;

    public Gui() {
        this.setSize(500, 400);
        setVisible(true);
        this.setLayout(new BorderLayout(10,10));
        this.addWindowListener(new WindowClosingAdapter());


        // Panels für die Dateneingabe oder Ausgabe
        Panel panelDaten = new Panel(new FlowLayout(FlowLayout.RIGHT));
        label = new Label("Kunden nr");
        panelDaten.add(label);
        tf1= new TextField(25);
        panelDaten.add(tf1);
        Panel panelDaten1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten1.add(new Label("Vorname"));
        panelDaten1.add(new TextField(25));
        Panel panelDaten2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten2.add(new Label("Nachnahme"));
        panelDaten2.add(new TextField(25));
        Panel panelDaten3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten3.add(new Label("Strasse"));
        panelDaten3.add(new TextField(25));
        Panel panelDaten4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten4.add(new Label("Hausnummer"));
        panelDaten4.add(new TextField(25));
        Panel panelDaten5 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten5.add(new Label("PLZ"));
        panelDaten5.add(new TextField(25));
        Panel panelDaten6 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten6.add(new Label("Ort"));
        panelDaten6.add(new TextField(25));
        Panel panelDaten7 = daten1("E-mail");

//Panel für die daten spalten;
        Panel panelDatenzusamme = new Panel(new GridLayout(8, 0));
        panelDatenzusamme.add(panelDaten);
        panelDatenzusamme.add(panelDaten1);
        panelDatenzusamme.add(panelDaten2);
        panelDatenzusamme.add(panelDaten3);
        panelDatenzusamme.add(panelDaten4);
        panelDatenzusamme.add(panelDaten5);
        panelDatenzusamme.add(panelDaten6);
        panelDatenzusamme.add(panelDaten7);

        Panel kundenButton = new Panel(new FlowLayout(FlowLayout.CENTER));
        Button bNeukunde =new Button("Neukunde");
        kundenButton.add(bNeukunde);
        kundenButton.add(new Button("Eingabe Löschen"));

        Panel panelBestandskunden = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelBestandskunden.add(new Button("Bestandskunde "));
        //Main Fenster
        this.add(panelDatenzusamme, BorderLayout.CENTER);
        this.add(kundenButton,BorderLayout.SOUTH);
        this.add(panelBestandskunden,BorderLayout.EAST);

        bNeukunde.addMouseListener(new MyMouseListener(tf1));

/*        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/



    }

    public TextField getTf1() {
        return tf1;
    }

    private Panel daten1(String name) {
        Panel panelDaten7 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten7.add(new Label(name));
        TextField text = new TextField(25);
        panelDaten7.add(text);
        return panelDaten7;
    }
}
