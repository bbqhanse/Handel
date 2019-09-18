package Test;

public abstract class KundeTest implements Oma {
    String name;

    public KundeTest(String name) {
        this.name = name;
        System.out.println("Konstruktor von Kunde ( erzeugt Instanz von Kunde)");
    }
    void getName(){
        System.out.println(this.name);
    }


}
