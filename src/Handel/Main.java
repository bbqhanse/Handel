package Handel;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Artikel a1 = new Artikel("Radio");
//        a1.getVar();
        Bestellung b1 = new Bestellung("Meier",12);
        b1.getVar();
        b1.getKunde().getVar();
        b1 = new Bestellung("ich",4);

    }
}
