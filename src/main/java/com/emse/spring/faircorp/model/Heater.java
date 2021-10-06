package com.emse.spring.faircorp.model;
import javax.persistence.*;



@Entity
@Table(name = "HEATER")
public class Heater {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column
    private Long power;

    //@Column(nullable = false)
    //private Long room;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Room room;

    public Heater(){}

    public Heater(String name, Room room, Status status){
        this.name = name;
        this.room = room;
        this.status = status;
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

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
