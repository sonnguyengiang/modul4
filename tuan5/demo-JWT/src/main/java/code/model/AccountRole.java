package code.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class AccountRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;

    @Override
    public String getAuthority() {
        return role;
    }

    public AccountRole(){}

    public AccountRole(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
