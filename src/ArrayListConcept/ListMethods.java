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
    }
}
