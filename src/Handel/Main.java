package Handel;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Artikel a1 = new Artikel("Radio");
//        a1.getVar();
        int knr= 155;
        Bestellung b1 = new Bestellung(knr, "Meier", 12, 5);
        b1.getVar();
        b1.getKunde().getVar();
        Kunde k = b1.getKunde();

        if(knr<=500){
        Privatkunde pk = (Privatkunde) k;
        System.out.println(pk.getBonitaet());
        } else {
            Firmenkunde fk = (Firmenkunde) k ;
            System.out.println(fk.getGruppe());
        }


    }
}
