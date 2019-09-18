package Test;

public class Main {

    public static void main(String[] args) {
//        KundeTest k1 = new KundeTest("Meier");
//        k1.getName();
//        k1.sagEtwas();
        PrivatkundeTest p1 = new PrivatkundeTest("Mayer");
        p1.getName();
        p1.sagEtwas();

        FirmenkundeTest f1 = new FirmenkundeTest("Mayer GmbH");
        f1.sagEtwas();
        f1.getName();
    }
}
