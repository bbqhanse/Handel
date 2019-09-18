package Test;


import java.io.*;

public class Main {

    public static void main(String[] args){
try {

        for (int i = 0; i <= 1000; i++) {
            FileWriter fw = new FileWriter("ausgabe.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hallo Welt!");
            bw.newLine();
            bw.write("Hallo Welt1!");
            bw.newLine();
            bw.close();
        }

    FileReader fr = new FileReader("ausgabe.txt");
    BufferedReader br = new BufferedReader(fr);
    String zeile1;
    while ((zeile1 = br.readLine()) != null) {
        System.out.println(zeile1);
    }

} catch (IOException e) {
    System.out.println(e.getMessage());
}


      /*  try {

            MyException me = new MyException();
            me.exMeth();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            MyException m1 = new MyException();

        } finally {
            // wird immer ausgeführt selbst wenn es nicht durchläuft
            System.out.println("Ende finally");
        }

        System.out.println("Ende");


        /*  int i;
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
        }*/

    }
}
