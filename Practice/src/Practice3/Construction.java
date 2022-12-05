package Practice3;

public class Construction extends Lead {
    private int level ;

    public Construction(int level) {
        this.level = level;
    }

    public Construction(String name, int age, String gende, String address, int level) {
        super(name, age, gende, address);
        this.level = level;
    }
}
