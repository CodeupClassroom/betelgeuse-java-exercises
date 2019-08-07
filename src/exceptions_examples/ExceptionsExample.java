package exceptions_examples;

import util.Input;

public class ExceptionsExample {

    static String hello;

    static void first() {
        System.out.println("Start First");
        second();
        System.out.println("Finish First");
    }

    static void second() {
        System.out.println("Start Second");
        third();
        System.out.println("Finish Second");
    }

    static void third() {
        System.out.println("Start Third");
        try {
            fourth();
        } catch (Exception e) {

            System.out.println("Here is what the problem might be:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Finish Third");
    }

    static void fourth() throws BetelgeuseException{
        System.out.println("Start Fourth");
        fifth();
        System.out.println("Finish Fourth");
    }

    static void fifth() throws BetelgeuseException{
        System.out.println("Start Fifth");
        Input input = new Input();
        int count = 0;
        while (input.yesNo("Wanna see some fireworks?")) {
//            try {

//// ArrayIndexOutOfBoundsException
//        int[] nums = {};
//        nums[10]++;
//// ArithmeticException
//        int num = 3 / 0;
//// NullPointerException
//        hello.isEmpty();
//// InputMismatchException
//        input.getDouble("Please enter your name: ");
//// NumberFormatException
//                int numHello = new Integer("hello");
            throw new BetelgeuseException();
//            } catch (java.util.InputMismatchException ex) {
//                System.out.println("That's not a double, please try again.");
//                 count++;
//            } catch (NumberFormatException ex) {
//                System.out.println("Number Format Problemo");
//            } catch (Exception ex) {
//                System.out.println("This is very generic problem");
//            }
//            finally {
//                System.out.println("We will always get here");
//            }

//        }

        }
        System.out.println("Finish Fifth");
    }

    public static void main(String[] args) {
        first();
//        System.out.println("Start First");
//        System.out.println("Start Second");
    }
}


class BetelgeuseException extends Exception {}

