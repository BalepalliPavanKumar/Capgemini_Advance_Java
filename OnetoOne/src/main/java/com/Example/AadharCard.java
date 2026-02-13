package com.Example;

import javax.persistence.*;

@Entity
public class AadharCard {

    @Id
    private int id;

    private String number;

    public AadharCard() {}

    public AadharCard(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
