package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        // 1st method
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");
        // add, remove - we don't need explicit synchronization
        // to fetch/traverse the values from this list -- we have to use explicit synchronization
        synchronized(namesList){
            Iterator<String> it = namesList.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        // 2nd method CopyOnWriteArrayList - class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Jack");
        // We dont need explicit synchronization for any operation: add/remove/traverse
        Iterator<String> iterator = empList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
