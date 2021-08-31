package code.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
    @NotEmpty
    private String name;
    @NotEmpty
    private String date;
    @NotEmpty
    private String gmail;
    @Size(min = 2, max = 15)
    private String address;
    private int phoneNumber;

    public Customer(){}

    public Customer(String name, String date, String gmail, String address, int phoneNumber) {
        this.name = name;
        this.date = date;
        this.gmail = gmail;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
