package Handel;

public abstract class Kunde implements Hilfe {
    private int knr;
    private String nachname;
    private String vorname;
    private String plz;
    private String ort;
    private String strasse;

//    public Kunde() {
//        nachname = "N.N.";
//    }

    public Kunde(String nachname) {
        this.nachname = nachname;
        System.out.println("konstruktor Kunde");

    }

    public Kunde(String nachname, int knr) {
        this.knr = knr;
        this.nachname = nachname;
    }

    public void getVar() {
        System.out.println(this.nachname);

    }

    public abstract void rechne();

    protected void finalize() {
        System.out.println("destruktor Kunde");

    }


}
