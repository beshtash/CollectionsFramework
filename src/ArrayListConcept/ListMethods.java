package ArrayListConcept;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Blue");
        listString.add("Green");
        //System.out.println(listString);
        listString.add(0, "Lilac");
        listString.add("Black");
        for(String element: listString){
            System.out.println(element);
        }
        String element = listString.get(3);
        //listString.remove(4);
        System.out.println(element);
        listString.add("Orange");
        listString.add("White");
        System.out.println(listString);
        if(listString.contains("Lilac")){
            System.out.println("We found it.");
        }
        else{
            System.out.println("No such element.");
        }
        Collections.sort(listString);
        System.out.println(listString);
        System.out.println(listString.get(0));

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("1");
        listOne.add("2");
        listOne.add("3");
        listOne.add("4");
        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("A");
        listTwo.add("B");
        listTwo.add("C");
        listTwo.add("D");
        Collections.copy(listTwo, listOne);
        System.out.println(listTwo);
        Collections.shuffle(listOne);
        System.out.println(listOne);
        Collections.reverse(listString);
        System.out.println(listString);
        List<String> newList = listString.subList(0,3);
        System.out.println(newList);

        ArrayList<String> c3 = new ArrayList<>();
        for( String e : listOne){
            c3.add(listTwo.contains(e) ? "Yes" : "No");
        }
        System.out.println(c3);
        Collections.swap(listTwo, 0, 2);
        for(String item : listTwo){
            System.out.println(item);
        }
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(listOne);
        a.addAll(listTwo);
        System.out.println(a);
        ArrayList<String> clone = (ArrayList<String>) a.clone();
        System.out.println(clone);
        clone.removeAll(clone);
        System.out.println(clone);
        System.out.println(clone.isEmpty());
    }
}
