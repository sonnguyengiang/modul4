package code.model;

public class Account {
    private String username;
    private String password;
    private String gmail;
    private String name;
    private String id;

    public Account(){};

    public Account(String username, String password, String gmail, String name, String id) {
        this.username = username;
        this.password = password;
        this.gmail = gmail;
        this.name = name;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
