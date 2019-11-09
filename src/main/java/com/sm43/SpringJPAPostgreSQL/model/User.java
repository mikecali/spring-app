package com.sm43.SpringJPAPostgreSQL.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "city")
    private String city;

    protected User() {
    }
    public User(String userName, String city) {
        this.userName = userName;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format(" User [ Id = %d, Name = '%s', City = '%s' ] ", id, userName, city);
    }
}
