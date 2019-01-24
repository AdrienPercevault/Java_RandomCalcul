package org.aja.randomcalcul.domain;

import javax.persistence.*;

@Entity
@Table(name = "Player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "id_score")
    protected Score score;

//    @Transient
//    protected Set<Transaction> transactions;

    public Account() {
//        transactions = new HashSet<>();
    }

    public Account( Score score ) {
        this();
        this.score = score;
    }

    public Account( Long id, Score score ) {
        this();
        this.id = id;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
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

