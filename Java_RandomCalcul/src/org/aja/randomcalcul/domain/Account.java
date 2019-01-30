package org.aja.randomcalcul.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "score_id")
    private Score score;

    protected String username;
    protected String password;
//    protected Integer number = 0;

// ***********************
// ***   Constructor   ***
// ***********************

    public Account() {

    }

    public Account(String username, String password, Score score) {
        this();
        this.username = username;
        this.password = password;
        this.score = score;
    }

    public Account(Long id, String username, String password, Score score) {
        this();
        this.id = id;
        this.username = username;
        this.password = password;
        this.score = score;
    }

// ***********************
// ***Getters & Setters***
// ***********************

    // Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Number
    public Score getNumber() {
        return score;
    }

    public void setNumber(Score score) {
        this.score = score;
    }

}
