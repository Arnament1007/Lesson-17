package entitites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    private int id;
    private String name;
    private String email;
    private long phone;
    private String about;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fund_id")
    private entities.Fund fund;

    public entities.Fund getFund() {
        return fund;
    }

    public void setFund(entities.Fund fund) {
        this.fund = fund;
    }

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<entities.Position> positionSet;

    public Set<entities.Position> getPositionSet() {
        return positionSet;
    }

    public void setPositionSet(Set<entities.Position> positionSet) {
        this.positionSet = positionSet;
    }

    @ManyToMany
    @JoinTable(
            name = "client_role",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Client(String     name, String email, long phone, String about, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.about = about;
        this.age = age;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", about='" + about + '\'' +
                ", age=" + age +
                '}';
    }


}
