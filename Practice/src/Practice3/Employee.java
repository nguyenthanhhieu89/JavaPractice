package Practice3;

public class Employee extends Lead {
    private String work;

    public Employee(String work) {
        this.work = work;
    }

    public Employee(String name, int age, String gende, String address, String work) {
        super(name, age, gende, address);
        this.work = work;
    }
}
