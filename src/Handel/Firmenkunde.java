package Handel;


public class Firmenkunde extends Kunde {
    private int gruppe;

    @Override
    public void rechne() {
        System.out.println(this.gruppe);

    }

    public Firmenkunde(String nachname, int knr) {
        super(nachname, knr);
    }

    public Firmenkunde(int knr, String nachname, String vorname, String plz, String ort, String strasse, String hausnr) {
        super(knr, nachname, vorname, plz, ort, strasse, hausnr);
    }

    public int getGruppe() {
        return gruppe;
    }

    @Override
    public int addiere() {
        return 7+7;
    }

    @Override
    public int dividiere() {
        return 25/5;
    }
}
