package code.model;

public class Customer {
    private int id;
    private String name;
    private String gmail;

    public Customer(int id, String name, String gmail) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
