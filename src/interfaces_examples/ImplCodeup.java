package interfaces_examples;

import java.util.ArrayList;
import java.util.List;

public class ImplCodeup {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        Developer fer = new Developer(100, "Fer", "WD");
        Accountant mary = new Accountant(100, "Mary", "ACT");

        employeeList.add(fer);
        employeeList.add(mary);

        fer.copies();
        mary.copies();


        Formatter fmt = new HTMLFormatter();
        System.out.println("fmt.display(fer) = " + fmt.display(fer));


        for (Employee emp: employeeList) {

            System.out.println("dpt = " + emp.dpt);
            System.out.println("name = " + emp.name);
            System.out.println("getSalary() = " + emp.getSalary());
            System.out.println("work() = " + emp.work());

        }

//        fer.drinkCoffee();
//        fer.writesCode(5);
//        fer.debug(null);



    }
}