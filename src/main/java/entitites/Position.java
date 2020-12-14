package entitites;
import javax.persistence.*;

@Entity
@Table(name = "client")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String posituon;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosituon() {
        return posituon;
    }

    public void setPosituon(String posituon) {
        this.posituon = posituon;
    }
}
