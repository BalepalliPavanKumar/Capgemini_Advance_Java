package com.Example;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int id;

    private String name;

    @OneToOne
    private AadharCard aadharCard;

    @OneToOne
    private HostelRoom hostelRoom;

    public Student() {}

    public Student(String name, AadharCard aadharCard, HostelRoom hostelRoom) {
        this.name = name;
        this.aadharCard = aadharCard;
        this.hostelRoom = hostelRoom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AadharCard getAadharCard() {
        return aadharCard;
    }

    public HostelRoom getHostelRoom() {
        return hostelRoom;
    }
}
