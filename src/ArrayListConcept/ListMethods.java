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

    }
}
