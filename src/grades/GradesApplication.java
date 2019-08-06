package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {

        Student fer = new Student("Fer");
        fer.addGrade(100);
        fer.addGrade(80);
        fer.addGrade(80);
        fer.addGrade(80);

        Student daniel = new Student("Daniel");
        daniel.addGrade(100);
        daniel.addGrade(100);
        daniel.addGrade(100);
        daniel.addGrade(50);

        students.put("fmendozaro", fer);
        students.put("danielfryar", daniel);

        System.out.println("Welcome!\n");

        showStudents();

        String key = input.getString("What student would you like to see more information on?");

        if(students.containsKey(key)){
            System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
            System.out.println("Current Average: " + students.get(key).getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + key);
        }


    }

    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        System.out.println();
    }
}
