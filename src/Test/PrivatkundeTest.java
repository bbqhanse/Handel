package Test;

public class PrivatkundeTest extends KundeTest {


    public PrivatkundeTest(String name) {
        super(name);
    }

    @Override
    public void sagEtwas() {
        System.out.println("oh je...");
    }
}
