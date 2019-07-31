import java.util.Scanner;

public class Sandbox {
    public String shape;

    protected static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public Sandbox() {
        this.shape = "square";
    }

    public Sandbox(String initialShape) {
        this.shape = initialShape;
    }

    public void play() {
        System.out.printf("Yay, this is a fun %s sandbox!!%n", this.shape);
    }

    public static void main(String[] args) {
        fizzBuzz(33);

        Person cody = new Person("Cody the Duck");
        cody.sayHello();
        System.out.println(cody.getName());

    }
}
