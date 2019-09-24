package Test.Multi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");
        MyThread t4 = new MyThread("D");
        MyThread t5 = new MyThread("E");
        MyThread t6 = new MyThread("F");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        Thread.sleep(10);
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
}
