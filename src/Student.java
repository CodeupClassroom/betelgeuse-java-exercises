public class Student {

    static int numberOfStudents = 0;
    String firstName;
    String lastName;

    double takeTest(int correct) {
        int questions = 10;

        System.out.println(correct);

        return (correct * 100 / questions);
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String title) {
        System.out.println(greeting + ", " + title + "!");
    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void main(String[] args) {

        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);

//        sayHello("Gutentag", "Betelgeuse");

//        System.out.println(args[0]);
//        System.out.println(args[1]);


//        Student mario = new Student();
//        numberOfStudents++;
//        mario.firstName = "Mario";
//        mario.lastName = "Johnson";
//
//        Student daniel = new Student();
//        numberOfStudents++;
//        daniel.firstName = "Daniel";
//        daniel.lastName = "Fryar";
//
//        System.out.println("There are " + numberOfStudents + " students in the cohort.");
//
//        System.out.println(mario.firstName + ' ' + mario.lastName);
//        System.out.println("Got a score of " + mario.takeTest(9));
//
//        System.out.println(daniel.firstName + ' ' + daniel.lastName);
//        System.out.println("Got a score of " + daniel.takeTest(3));
    }
}
