package Test;

public class MyException {
    public void EigeneExcepton(){

    }
   public void exMeth(){
       int i;
       int z = 10;
       int n = 0;
       int erg;
       int base = 0;

       erg = z / n;

       for (base = 10; base >= 2; --base) {
           i = Integer.parseInt("40", base);
           System.out.println("40 base" + base + " = " + i);
       }
   }
}
