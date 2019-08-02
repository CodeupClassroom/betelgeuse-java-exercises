package interfaces_examples;

abstract class Employee {
    private double salary;
    protected String name;
    protected String dpt;

    public Employee(double salary, String name, String dpt) {
        this.salary = salary;
        this.name = name;
        this.dpt = dpt;
    }

    // employee has to work in order to be an employee
    public abstract String work();

//    public abstract String setManager(Employee employee);

//    public abstract Boolean hasMonitor(boolean answer);

    public double getSalary() {
        return this.salary;
    }



}
