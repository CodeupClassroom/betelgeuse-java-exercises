package interfaces_examples;

public class HTMLFormatter implements Formatter {
    @Override
    public String display(Employee employee) {
        return String.format("<div class=\\\"employee\\\"><h2>%s (%s)</h2></div>", employee.name, employee.dpt);
    }
}
