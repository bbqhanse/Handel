package Test;

public class KundeTest implements Oma {
    String name;

    public KundeTest(String name) {
        this.name = name;
    }
    void getName(){
        System.out.println(this.name);
    }

    @Override
    public void sagEtwas() {
        System.out.println("Hallo Oma");
    }
}
