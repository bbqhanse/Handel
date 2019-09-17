package Handel;

public class Privatkunde extends Kunde {
    private int bonitaet;

    @Override
    public void rechne() {
        System.out.println(bonitaet);
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
}
