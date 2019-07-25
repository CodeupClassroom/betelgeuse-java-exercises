import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Betelgeuse";
        String greeting = "Salutations";

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scan.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }

}
