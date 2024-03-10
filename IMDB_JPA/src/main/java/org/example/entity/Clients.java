package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
@NamedQuery(name = "Clients.getAll", query = "SELECT c from Clients c")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 255)
    private String name;
    @ManyToOne
    @JoinColumn(name = "idStylists")
    private Stylists idStylists;
    @Column(name = "isDeleted")
    private boolean isDeleted;

    public Clients(Integer id, String name, Stylists idStylists, boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.idStylists = idStylists;
        this.isDeleted = isDeleted;
    }
    public Clients() {}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Stylists getIdStylists() {
        return idStylists;
    }
    public void setIdStylists(Stylists idStylists) {
        this.idStylists = idStylists;
    }
    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
