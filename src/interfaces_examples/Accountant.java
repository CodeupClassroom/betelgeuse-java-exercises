package interfaces_examples;

public class Accountant extends Employee {

    public Accountant(double salary, String name, String dpt) {
        super(salary, name, dpt);
    }


    public String work(){
        return "crunching numbers";
    }


    @Override
    public String[] copies() {
        System.out.println("copies of payrolls");
        return new String[1];
    }
}
