package org.aja.randomcalcul.domain;

import javax.persistence.*;

@Entity
@Table(name = "Playeur")
@DiscriminatorColumn(name = "DTYPE")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private String name;

    public Account(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
