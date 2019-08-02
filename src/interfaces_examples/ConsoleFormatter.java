package interfaces_examples;

public class ConsoleFormatter implements Formatter {
    @Override
    public String display(Employee employee) {
        return "--------------------" +
                "\n  name:  " + employee.name +
                "\n  salary: " + employee.getSalary();
    }
}
