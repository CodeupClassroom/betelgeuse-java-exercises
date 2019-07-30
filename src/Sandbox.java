import java.util.Scanner;

public class Sandbox {
    public static String fizzBuzz(int num) {
        String output = "";
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                output += "fizzbuzz\n";
            } else if (i%5==0) {
                output += "buzz\n";
            } else if (i%3==0) {
                output += "fizz\n";
            } else {
                output += i + "\n";
            }
        }
        multiply(1,2);
        return output;
//        return;
    }

    private static double multiply(double a, double b) {

        return a * b;
    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static int multiply(int a, int b) {
        if (a <= 0) {
            System.out.println("last time: a="+a+ " b="+b);
            return 0;
        }
        System.out.println("a="+a+ " b="+b);

        return b + multiply(a-1, b);
    }


    public static void main(String[] whateverWeWant) {
//        String fizz = fizzBuzz(33);
//        System.out.println(fizz);

//        double product = multiply(7.9,8.3);
//        System.out.println(product);

        System.out.println(multiply(4,5));
//        count(5);

    }
}
