package Uebung.MainArgument;

public class Main {
    public static void main(String[] args) {

        if('+'==args[1].charAt(0)) {
            int erg;
            erg = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            System.out.println(erg);
        }else {
            System.out.println("fehler");
        }
    }
}
