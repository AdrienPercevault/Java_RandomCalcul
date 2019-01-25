package org.aja.randomcalcul.domain;

import org.hibernate.Transaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_score")
    private Score score;

    private String name;

//    @Transient
//    protected Set<Transaction> transactions;

    @Transient
    private Set<Transaction> transactions;

    public Account() { transactions = new HashSet<>();
    }

    public Account( Score score ) {
        this();
        this.score = score;
    }

    public Account( Long id,String name, Score score ) {
        this();
        this.id = id;
        this.score = score;
        this.name =name;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public Type getType() {
//        return type;
//    }

//    public void setType( Type type ) {
//        this.type = type;
//    }

    public Score getScore() {
        return score;
    }

    public void setScore( Score score ) {
        this.score = score;
    }

//    public Set<Transaction> getTransactions() {
//        return transactions;
//    }

//    public void setTransactions( Set<Transaction> transactions ) {
//        this.transactions = transactions;
//    }
}

