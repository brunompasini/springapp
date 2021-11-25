package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Room;

public class RoomDto {

    private Long id;
    private String name;
    private Integer floor;

    private Double currentTemperature;
    private Double targetTemperature;

    private Long buildingId;

    public RoomDto(){}

    public RoomDto(Room room) {
        this.id = room.getId();
        this.name = room.getName();
        this.floor = room.getFloor();

        this.currentTemperature = room.getCurrentTemperature();
        this.targetTemperature = room.getTargetTemperature();

        this.buildingId = (room.getBuilding()==null)?null:room.getBuilding().getId();
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
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

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
}
