package org.aja.randomcalcul.domain;

import javax.persistence.*;

@Entity
@Table(name = "Player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String username;
    protected String password;

    @ManyToOne
    @JoinColumn(name = "id_score")
    protected Score score;

// ***********************
// ***   Constructor   ***
// ***********************

    public Account() {

    }

    public Account( String username, String password, Score score ) {
        this();
        this.username = username;
        this.password = password;
        this.score = score;
    }

    public Account( Long id, String username, String password, Score score ) {
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

    public void setId( Long id ) {
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

    // Score
    public Score getScore() {
        return score;
    }

    public void setScore( Score score ) {
        this.score = score;
    }
}

