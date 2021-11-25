package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.*;

import java.util.List;

public interface BuildingDaoCustom {

    List<Room> getAllRoomsByBuilding(Long id);

    List<Heater> getAllHeatersByBuilding(Long id);
    List<Window> getAllWindowsByBuilding(Long id);


}
