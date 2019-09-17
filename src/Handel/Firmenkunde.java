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

    public int getGruppe() {
        return gruppe;
    }
}
