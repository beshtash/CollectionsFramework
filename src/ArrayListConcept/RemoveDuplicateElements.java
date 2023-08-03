package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        //ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 2, 1, 2, 3, 5, 67, 898, 293, 5, 6, 7, 8, 9, 10));
        //1. LinkedHashSet
        int[] array = {1, 2, 3, 3, 4, 4, 4,5,6, 6,7,8,9};

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i<array.length; i++){
            arrayList.add(new Integer(array[i]));
        }
        System.out.println(arrayList);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrayList);
        ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numbersListWithoutDuplicates);

        //2.JDK8 - stream
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,3,5,6,7,7,8,8,9,10));
        List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);
    }
}
