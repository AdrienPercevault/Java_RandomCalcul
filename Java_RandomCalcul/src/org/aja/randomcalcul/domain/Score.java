package org.aja.randomcalcul.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "score" )
public class Score implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private int number;

    @OneToMany( mappedBy = "score", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
    private Set<Account> accounts;

// ***********************
// ***   Constructor   ***
// ***********************

    public Score() {
        accounts = new HashSet<>(  );
    }

    public Score(Integer number) {
        this();
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
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        if (null != account) {
            if (null != account.getNumber()) {
                account.getNumber().removeAccount(account);
            }
            accounts.add(account);
            account.setNumber(this);
        }
    }

    private void removeAccount(Account account) {
        if (null != account) {
            accounts.remove(account);
            account.setNumber(null);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "Score{" );
        sb.append( "id=" ).append( id );
        sb.append( ", number='" ).append(number).append( '\'' );
        sb.append( ", accounts=" ).append(accounts.size() );
        sb.append( '}' );
        return sb.toString();
    }
}