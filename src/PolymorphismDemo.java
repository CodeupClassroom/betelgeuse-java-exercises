public class PolymorphismDemo {

    public static void doWork(Employee e) {
        System.out.println(e.work());
    }

    public static void main(String[] args) {
        Employee one = new Employee();
        Employee two = new Manager();
        Developer three = new Developer();
        Person four = new Person();

        Employee[] division = new Employee[3];
        division[0] = one;
        division[1] = two;
        division[2] = three;

        for (Employee emp : division) {
            doWork(emp);
        }
//        doWork(one); // "Filling out TPS reports"
//        doWork(two); // "Managing employees"
//        doWork(three); // "Writing Code and Breaking Things"
//        doWork(four); // error
    }


}
