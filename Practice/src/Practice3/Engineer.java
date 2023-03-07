package Practice3;

public class Engineer extends Lead {
    private String chuyenNganh;

    public Engineer(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Engineer(String name, int age, String gende, String address, String chuyenNganh) {
        super(name, age, gende, address);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
