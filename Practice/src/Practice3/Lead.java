package Practice3;

public class Lead {
    private String name;
    private int age;
    private String gende;
    private String address;

    public Lead() {
    }

    public Lead(String name, int age, String gende, String address) {
        this.name = name;
        this.age = age;
        this.gende = gende;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGende() {
        return gende;
    }

    public void setGende(String gende) {
        this.gende = gende;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
