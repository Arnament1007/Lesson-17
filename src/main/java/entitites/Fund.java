package entitites;
import javax.persistence.*;

@Entity
@Table(name = "fund")
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int fund;

    @OneToOne(mappedBy = "fund")
    private Client client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public Fund() {
    }

    public Fund(int id, int fund) {
        this.id = id;
        this.fund = fund;
    }
}
