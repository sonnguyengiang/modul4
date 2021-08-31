package code.model;

import javax.persistence.*;

@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_D;
    private String name;
    @ManyToOne
    @JoinColumn(columnDefinition = "id_T")
    private Conscious conscious;

    public District() {
    }

    public District(long id_D, String name, Conscious conscious) {
        this.id_D = id_D;
        this.name = name;
        this.conscious = conscious;
    }

    public long getId_D() {
        return id_D;
    }

    public void setId_D(long id_D) {
        this.id_D = id_D;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Conscious getConscious() {
        return conscious;
    }

    public void setConscious(Conscious conscious) {
        this.conscious = conscious;
    }
}
