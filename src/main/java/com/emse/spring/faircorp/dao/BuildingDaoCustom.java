package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.*;

import java.util.List;

public interface BuildingDaoCustom {

    List<Room> getAllRoomsByBuildingId(Long id);


}
