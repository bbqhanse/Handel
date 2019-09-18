package Handel;

public class Bestellung {
    private int bnr,
            knr,
            anr,
            anzahl;
    private double gesamtpreis;
    private Kunde k;
    private static final int MWST = 19;

    public Bestellung(String nname, int anzahl) {
        this.anzahl = anzahl;
        k = new Privatkunde(nname);
        System.out.println("konstruktor Bestellung");
    }

    public Bestellung(int kn, String nname, int an, int id) {
        anzahl = an;
        if (kn <= 500) {
            k = new Privatkunde(nname, id);
        } else {
            k = new Firmenkunde(nname, id);
        }
    }

    public void getVar() {
        System.out.println(anzahl);
    }

    public Kunde getKunde() {
        return k;
    }

    public static void oma(){
        System.out.println("ich bin Berta.");
    }

    @Override
    protected void finalize() {
        System.out.println("destruktor");

    }
}
