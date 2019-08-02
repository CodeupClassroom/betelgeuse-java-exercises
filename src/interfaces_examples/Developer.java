package interfaces_examples;

public class Developer extends Employee {

    public Developer(double salary, String name, String dpt) {
        super(salary, name, dpt);
    }

    public String work() {
        return "coding";
    }
}