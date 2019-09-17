package Handel;

public class Privatkunde extends Kunde {
    private int bonitaet;

    @Override
    public void rechne() {
        System.out.println(bonitaet);
    }
}
