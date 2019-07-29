import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean talking = true;
        String message = "";
        System.out.println("Bob is eating cereal...");

        do {
            message = scanner.nextLine().toLowerCase();

            if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Fine. Be that way!");
//            } else if (message.equalsIgnoreCase("bye") ||
//                        message.equalsIgnoreCase("bye."))
            } else if (message.contains("bye")) {
                talking = false;
            } else {
                System.out.println("Whatever.");
            }
        } while (talking);

        System.out.println("Bob continues eating cereal...");

    }
}
