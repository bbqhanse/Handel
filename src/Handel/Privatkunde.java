package Handel;

public class Privatkunde extends Kunde {
    private int bonitaet;

    @Override
    public void rechne() {
        System.out.println(bonitaet);
    }

    public Privatkunde(int knr, String nachname, String vorname, String plz, String ort, String strasse, String hausnr) {
        super(knr, nachname, vorname, plz, ort, strasse, hausnr);
    }

    public Privatkunde(String nachname) {
        super(nachname);
    }

    public Privatkunde(String nachname, int knr) {
        super(nachname, knr);
    }

    public int getBonitaet() {
        return bonitaet;
    }

    @Override
    public int addiere() {
        return 3+7;
    }

    @Override
    public int dividiere() {
        return 20/5;
    }
}
