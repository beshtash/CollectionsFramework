package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayLists {
    public static void main(String[] args) {
        //1. Sort and Equals
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.equals(list2)); //false
        //2. Compare two lists to find out the additional elements
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        list3.removeAll(list4);
        System.out.println(list3);
        //3. Find out the missing elements:
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> list6 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        list6.removeAll(list5);
        System.out.println(list6);
        //4. Find out common elements
        ArrayList<String> list7 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> list8 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        list7.retainAll(list8);
        System.out.println(list7);
    }
}
