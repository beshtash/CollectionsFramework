package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //default class
        //dynamic array
       // int i[] = new int[4];
       // i[0] = 100;
       // System.out.println(i[0 ]);
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add("test");
        ar.add(12.33);
        System.out.println(ar);
    }
}
