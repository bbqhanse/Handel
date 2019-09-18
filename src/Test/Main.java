package Test;

public class Main {

    public static void main(String[] args) {
        int i;
        int z = 10;
        int n = 1;
        int erg;
        int base = 0;
        try {
            erg = z / n;


            for (base = 10; base >= 2; --base) {
                i = Integer.parseInt("40", base);
                System.out.println("40 base" + base + " = " + i);
            }
            System.out.println("Hier ... ");
        } catch (NumberFormatException e) {
            System.out.println("40 zur basis 4 nicht möglich ...\n"+e.getMessage());
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Division durch Null...\n"+e.getMessage());
        } catch (Exception e) {
            System.out.println("algemeiner Fehler");
        }

    }
}
