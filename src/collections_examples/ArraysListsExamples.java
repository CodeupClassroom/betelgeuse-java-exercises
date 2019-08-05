package collections_examples;

import java.util.ArrayList;

public class ArraysListsExamples {

    public static void main(String[] args) {
        String[] namesArray = new String[5];
//        names[1];1
//        namesArray.length

        ArrayList<String> names = new ArrayList<>();

//        add values
        names.add("Fer");
        names.add("Daniel");
        names.add("Stacy");
        names.add("Fer");


//        System.out.println("names.get(2) = " + names.get(2));
//        Get the last person in the list
        System.out.println("names.get(names.size()-1) = " + names.get(names.size()-1));

        System.out.println("names = " + names);
        
//        for(int i = 0; i < names.size(); i++ ){
//
//        }

        for (String name: names) {
            System.out.println("name.toUpperCase() = " + name.toUpperCase());
        }

        System.out.println("names.size() = " + names.size());


        System.out.println("names.contains(\"Fer\") = " + names.contains("Fer"));

        System.out.println("names.indexOf(\"Fer\") = " + names.indexOf("Fer"));
        System.out.println("names.lastIndexof(\"Fer\") = " + names.lastIndexOf("Fer"));

        System.out.println("names.isEmpty() = " + names.isEmpty());

//        names.removeAll(names);

        names.remove("Fer");
        names.remove(names.indexOf("Stacy"));

        System.out.println("names.isEmpty() = " + names.isEmpty());

        System.out.println("names = " + names);


    }


}
