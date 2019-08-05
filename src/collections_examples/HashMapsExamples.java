package collections_examples;

import java.util.HashMap;
import java.util.Set;

public class HashMapsExamples {

    public static void main(String[] args) {

//        ssn , person's name
        HashMap<Integer, String> people = new HashMap<>();

        people.put(12345, "Fer");
        people.put(54321, "Daniel");
        people.put(97865, "Stacy");

        System.out.println("people.get(97865) = " + people.get(97865));

        System.out.println("people.getOrDefault(123, \"No person was found\") = " + people.getOrDefault(123, "No person was found"));

        System.out.println("people.getOrDefault = " + people.getOrDefault(12345, "No person was found"));

        System.out.println("people.containsKey(11111) = " + people.containsKey(11111));
        System.out.println("people.containsValue(\"Fer\") = " + people.containsValue("Fer"));

//        people.put(97865, "Ana");
        people.putIfAbsent(97865, "Ana");

        System.out.println("people.get(97865) = " + people.get(97865));

        System.out.println("people.containsValue(\"Stacy\") = " + people.containsValue("Stacy"));

//        not caring about the value < > key
        people.replace(97865, "Stacy");

//        caring about the value < > key
//        people.replace(97865, "Stacy", "Stacy2");

        System.out.println("people.containsValue(\"Stacy\") = " + people.containsValue("Stacy"));
        System.out.println("people.containsValue(\"Ana\") = " + people.containsValue("Ana"));

        people.remove(97865);

//         loops thru a list of keys

//        people.clear();

        if(!people.isEmpty()){
            for (Integer ssn : people.keySet()) {
                System.out.println("ssn = " + ssn);
                System.out.println("name = " + people.get(ssn).toUpperCase());
            }
        }else{
            System.out.println("is Empty :(");
        }

    }

}
