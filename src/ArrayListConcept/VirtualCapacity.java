package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity  {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        System.out.println(ar.size());
        ar.add(100);
        ar.add(200);
        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());
    }
}
