package Handel;

public class Kunde {
    private int knr;
    private String nachname;
    private String vorname;
    private String plz;
    private String ort;
    private String strasse;

    public Kunde() {
        nachname = "N.N.";
    }

    public Kunde(String nachname) {
        this.nachname = nachname;
    }

    public void getVar(){
        System.out.println(this.nachname);

    }


}
