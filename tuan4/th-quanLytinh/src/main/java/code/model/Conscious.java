package code.model;

import javax.persistence.*;

@Entity
public class Conscious {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_T;
    private String name;


    public Conscious() {
    }

    public Conscious(long id_T, String name) {
        this.id_T = id_T;
        this.name = name;
    }

    public long getId_T() {
        return id_T;
    }

    public void setId_T(long id_T) {
        this.id_T = id_T;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
