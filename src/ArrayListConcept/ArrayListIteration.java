package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        String Adam = "adam";
        studentList.add("Joshua");
        studentList.add("Steve");
        studentList.add("Lisa");
        studentList.add("Naveen");

        studentList.stream().forEach(ele -> System.out.println(ele));
        Iterator<String> it = studentList.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }
    }
}
