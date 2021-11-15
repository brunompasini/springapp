package com.emse.spring.faircorp.model;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer floor;

    @Column(nullable = false)
    private String name;

    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    /* a list of heaters. You have to define a bidirectional association between Room and Heater

a list of windows. You have to define a bidirectional association between Room and Window : update the Window entity constructor to always send the room when a room is created, ie add an argument Room in the Window constructor

 */
    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Building building;

    public Room(){}
    public Room(Integer floor, String name, Building building) {
        this.floor = floor;
        this.name = name;
        this.building = building;
    }
    public Room(Integer floor, String name, Building building, Double currentTemperature, Double targetTemperature){
        this.floor = floor;
        this.name = name;
        this.building = building;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Window> getWindows() { return windows;}

    public Set<Heater> getHeaters() {
        return heaters;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }
}
