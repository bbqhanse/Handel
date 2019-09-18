package Test;

public abstract class KundeTest implements Oma {
    String name;

    public KundeTest(String name) {
        this.name = name;
    }
    void getName(){
        System.out.println(this.name);
    }


}
