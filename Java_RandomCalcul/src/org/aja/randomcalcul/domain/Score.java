package org.aja.randomcalcul.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;

    @OneToMany(mappedBy = "score")
    private Set<Account> accounts;

// ***********************
// ***   Constructor   ***
// ***********************

    public Score() {
        accounts = new HashSet<>();
    }

    public Score( Integer number ) {
        this();
        this.number = number;
    }

    public Score( Long id, Integer number ) {
        this();
        this.id = id;
        this.number = number;
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

    // Number
    public Integer getNumber() {
        return number;
    }

    public void setNumber( Integer number ) {
        this.number = number;
    }

    // Account
    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts( Set<Account> accounts ) {
        this.accounts = accounts;
    }
}
