package Test;

public class Main {

    public static void main(String[] args) {
        int i;
        int base = 0;
        try {
            for (base = 10; base >= 2; --base) {
                i = Integer.parseInt("40", base);
                System.out.println("40 base" + base + " = " + i);
            }
            System.out.println("Hier ... ");
        } catch (NumberFormatException e) {
            System.out.println("Fehler");
        }

    }
}
