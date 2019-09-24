package Test.Multi;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);

    }


    public void run(){
        int i = 0;
        while (i<=50){
            System.out.println(this.getName()+"\t "+ i++);
        }
    }
}
