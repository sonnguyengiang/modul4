package code.model;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

public class Customer {

    @Pattern(regexp = "^[a-zA-z0-9]{1,}$", message = "khong dc bo trong")
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
