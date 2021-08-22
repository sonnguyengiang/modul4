package code.model;


import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Pattern(regexp = "^[FT]+[0-9]{3}$", message = "Bắt buộc employeeCode dạng FTXXX")
    private String EmployeeCode;
    @Size(min = 1, message = "not null")
    private String name;
    @Size(min = 1, message = "not null")
    private String salary;
    private int age;
    private String branch;

    public Employee() {
    }

    public Employee(long id, String employeeCode, String name, String salary, int age, String branch) {
        this.id = id;
        EmployeeCode = employeeCode;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.branch = branch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
