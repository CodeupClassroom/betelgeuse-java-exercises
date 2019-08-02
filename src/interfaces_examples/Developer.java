package interfaces_examples;

public class Developer extends Employee implements WritesCode  {

    public Developer(double salary, String name, String dpt) {
        super(salary, name, dpt);
    }

    @Override
    public String work() {
        return "coding";
    }

    @Override
    public Bug[] writesCode(int numOfLines) {
        System.out.println("looking for bugs");
        return new Bug[0];
    }

    @Override
    public boolean debug(Bug bug) {
        System.out.println("debugging");
        return false;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("I got energy");
    }

    @Override
    public String[] copies() {
        System.out.println("copies of DB diagrams");
        return new String[0];
    }
}