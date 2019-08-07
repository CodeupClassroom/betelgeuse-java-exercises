package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")
                || answer.equalsIgnoreCase("yes")) {
            return true;
        } else return false;
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.yesNo();
    }

    public int getInt() {
        String answer;
        answer = this.scanner.nextLine();
        try {
            return Integer.valueOf(answer);
        } catch (NumberFormatException ex) {
            System.out.printf("%s is not an integer%n", answer);
            return getInt();
        }
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.getInt();
    }

    public int getInt(int min, int max) {
        do {
            System.out.printf("Please enter a number between %d and %d : ", min, max);

            String input = this.scanner.nextLine();
            int answer;
            try {
                answer = Integer.valueOf(input);
            } catch (NumberFormatException ex) {
                continue;
            }

            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);
    }

    public double getDouble(double min, double max) {
        do {
            System.out.printf("Please enter a number between %f and %f : ", min, max);
            String input = this.scanner.nextLine();

            double answer;
            try {
                answer = Double.valueOf(input);
            } catch (NumberFormatException ex) {
                continue;
            }
            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);

    }
    public double getDouble() {
        String answer;
        answer = this.scanner.nextLine();
        try {
            return Double.valueOf(answer);
        } catch (NumberFormatException ex) {
            System.out.printf("%s is not a number%n", answer);
            return getDouble();
        }
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("Enter your answer (y|n)?");
//        System.out.println(input.yesNo());
        System.out.println(input.getDouble());

    }
}
