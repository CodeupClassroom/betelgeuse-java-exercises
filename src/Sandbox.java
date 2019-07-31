import java.util.Scanner;

public class Sandbox {
    public String shape;

    protected static void fizzBuzz(int num) {
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
