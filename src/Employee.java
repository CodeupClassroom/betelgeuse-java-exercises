public class Employee extends Person {
    private long empid;

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String work() {
        return "Filling out TPS reports";
    }
}
