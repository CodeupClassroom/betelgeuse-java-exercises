package collections_examples;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapsAndHumans {

    public static void main(String[] args) {

        Instructor fer = new Instructor(true,true,"Fer");
        Instructor daniel = new Instructor(true, true, "Daniel");

        HashMap<Long, Instructor> payroll = new HashMap<>();

        payroll.put(12L, fer);
        payroll.put(18L, daniel);

        for (Instructor instructor: payroll.values()) {
            System.out.println("ins.getName() = " + instructor.getName());
            System.out.println("ins.answerQuestion(\"Is this a question?\") = " + instructor.answerQuestion("Is this a question?"));

            for (String subject: instructor.teach()) {
                System.out.println("subject = " + subject);
            }

        }


    }
}
