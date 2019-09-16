package Handel;

public class Bestellung {
    private int bnr,
                knr,
                anr,
                anzahl;
    private double gesamtpreis;
    private Kunde k;

    public Bestellung(String nname, int anzahl ) {
        this.anzahl = anzahl;
        k = new Kunde(nname);
        System.out.println("konstruktor Bestellung");
    }

    public void getVar(){
        System.out.println(anzahl);
    }

    public Kunde getKunde() {
        return k;
    }

    @Override
    protected void finalize(){
        System.out.println("destruktor");

    }
}
