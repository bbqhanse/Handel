package Handel;

public class Artikel {
    private int anr;
    private String aname,
                   bezeichnung;
    private double preis;

    public Artikel() {
    }

    public Artikel(String aname) {
        this.aname = aname;
    }

    public void getVar(){
        System.out.println(this.aname);
    }
}
