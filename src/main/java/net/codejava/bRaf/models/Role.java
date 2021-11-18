package net.codejava.bRaf.models;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;

    @Column(nullable = false, length = 45)
    private String name;

    public Role() { }

    public Role(String name) {
        this.name = name;
    }

    public Role(Integer id, String name) {
        this.role_id = id;
        this.name = name;
    }

    public Role(Integer id) {
        this.role_id = id;
    }


    @Override
    public String toString() {
        return this.name;
    }

    // getters and setters are not shown for brevity

    public Integer getId() {
        return role_id;
    }

    public void setId(Integer id) {
        this.role_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
