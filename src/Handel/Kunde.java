package Handel;

/**
 * Abstract class
 * von dieser Klasse kann keine Instanz gebildet werden
 * sie implements das Interface Hilfe welche nur abstracte methoden bereitstellt
 * die dann entweder in der klasse hier oder in den abgeleiteten Klassen programmiert
 * werden muss
 */
public abstract class Kunde implements Hilfe {
    private int knr;
    private String nachname;
    private String vorname;
    private String plz;
    private String ort;
    private String strasse;
    private String hausnr;

//    public Kunde() {
//        nachname = "N.N.";
//    }

    /**
     * Der Konstruktor der alle Variablen der klasse setzt
     *
     * @param knr      Kundennummer
     * @param nachname Nachname
     * @param vorname  Vorname
     * @param plz      PLZ
     * @param ort      Ort
     * @param strasse  Straße
     * @param hausnr   Hausnummer
     */

    public Kunde(int knr, String nachname, String vorname, String plz, String ort, String strasse, String hausnr) {
        this.knr = knr;
        this.nachname = nachname;
        this.vorname = vorname;
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
        this.hausnr = hausnr;
    }

    public Kunde(String nachname) {
        this.nachname = nachname;
        System.out.println("konstruktor Kunde");

    }

    public Kunde(String nachname, int knr) {
        this.knr = knr;
        this.nachname = nachname;
    }

    /**
     * Eine methode um die Instanz Variablen Auszugeben
     * ich benutze den {@link StringBuilder} da er Schneller ist
     */
    public void ausgabe() {
        System.out.println(new StringBuilder().append(knr).append(" ").append(vorname).append(" ").append(nachname).append(" ").append(plz).append(" ").append(ort).append(" ").append(strasse).append(" ").append(hausnr).toString());
    }

    /*
    zum zeigen von abstrakten methoden
     */
    public abstract void rechne();

    protected void finalize() {
        System.out.println("destruktor Kunde");

    }

    /*
    getter und setter
     */
    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }
}
