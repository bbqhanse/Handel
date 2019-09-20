package Test.colection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //int[] ar= { 1,2,3,4,5};

        HashMap h = new HashMap();
        h.put("Berta",75);
        h.put("Marta",70);
        h.put("Hilde",66);
        h.put("Grete",55);
        h.put("Berta",74);


        Iterator it = h.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(
                    key + "-->"+ h.get(key)
            );


        }

       /*
        //erster versuch mit viel code
        Iterator it = h.entrySet().iterator();


        System.out.println(it);

        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(
                    entry.getKey() +"-->"+ entry.getValue()
            );
        }


        }
        /*
        Stack s = new Stack();
        s.push("eins");
        s.push(25);
        s.push("zwei");
        s.push(123);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.elementAt(1));//entspricht nicht dem stack prinzip LIFO


        /*        System.out.println(s.get(1));
        System.out.println(s.size());
        System.out.println(s);
        s.removeElementAt(1);
        s.add(1,"test123");
        System.out.println(s);*/

    }
}
