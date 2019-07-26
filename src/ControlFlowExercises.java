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

        squaresCubes();
//        System.out.println("bob".concat("cat"));

    }

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
