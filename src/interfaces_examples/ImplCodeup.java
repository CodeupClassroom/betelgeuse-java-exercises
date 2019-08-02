package interfaces_examples;

public class ImplCodeup {

    public static void main(String[] args) {

        Employee fer = new Developer(100, "Fer", "WD");

        System.out.println("fer.dpt = " + fer.dpt);
        System.out.println("fer.name = " + fer.name);
        System.out.println("fer.getSalary() = " + fer.getSalary());


        System.out.println("fer.work() = " + fer.work());

    }
}