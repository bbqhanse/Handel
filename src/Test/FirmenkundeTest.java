package Test;

public class FirmenkundeTest extends KundeTest {
    public FirmenkundeTest(String name) {
        super(name);
    }

    @Override
    public void sagEtwas() {
        System.out.println("hallo Firmenkunde");
    }

    @Override
    public void duAuch() {
        System.out.println("oh je Firmenkunde");
    }
}
