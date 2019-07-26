import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i);
            System.out.print(' ');
            i++;
        }

        System.out.println();
//        double j = 2;
//        do {
//            System.out.println(j);
//            j *= j;
//        } while (j < 10000000000l);
//
        for (int k = 5; k <= 15; k++) {
            System.out.print(k);
            System.out.print(' ');
        }

//        squaresCubes();
//        System.out.println("bob".concat("cat"));


        gradingThing();
    }

    private static void gradingThing() {
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println();
        System.out.print("What was the grade (0-100)? ");
        int userInput = scan.nextInt();
        System.out.println();

        char letterGrade = 'X';

        if (userInput > 100) {}
        else if (userInput >= 90)
            letterGrade = 'A';
        else if (userInput >= 80)
            letterGrade = 'B';
        else if (userInput >= 70)
            letterGrade = 'C';
        else if (userInput >= 60)
            letterGrade = 'D';
        else if (userInput >= 0)
            letterGrade = 'F';



        switch (letterGrade) {
            case 'A' :
                System.out.println("You got an A! You're so smart");
                break;
            case 'B' :
                System.out.println("Fine job. Solid B.");
                break;
            case 'C' :
                System.out.println("C = MD");
                break;
            case 'D' :
                System.out.println("Better hit the books!");
                break;
            case 'F' :
                System.out.println("See me after class.");
                break;
                default:
                    System.out.println("You cheater. Caught you red-handed.");
            }

        }
//        System.out.println("You got a " + letterGrade);

//    }

    private static void squaresCubes() {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println();

            System.out.print("What number would you like to go up to? ");
            int userInput = scan.nextInt();
            System.out.println();

            System.out.println("Here is your table!");
            System.out.println();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (long i = 1; i <= userInput; i++) {
                System.out.printf("%-7d|%-9d|%-8d%n", i, i * i, i * i * i);
            }
            System.out.println();
            System.out.print("Do you want to continue (y/n)? ");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing!");
    }
}
