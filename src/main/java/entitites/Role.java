package entitites;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Set<entities.Client> client;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<entities.Client> getClient() {
        return client;
    }

    public void setClient(Set<entities.Client> client) {
        this.client = client;
    }
}
