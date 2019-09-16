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
        System.out.println("konstruktor Kunde");

    }

    public void getVar(){
        System.out.println(this.nachname);

    }
    protected void finalize(){
        System.out.println("destruktor Kunde");

    }


}
