package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BuildingDaoCustomImpl implements BuildingDaoCustom {
    @PersistenceContext
    private EntityManager em;


    //@Override
    //public Building findById(Long id) {
    //    String jpql = "select b from Building b where b.id=:id";
    //    return em.createQuery(jpql, Building.class).setParameter("id",id).getSingleResult();
    //}


    @Override
    public List<Room> getAllRoomsByBuildingId(Long id) {
        String jpql = "select a from Room a where a.building.id=:id";
        return em.createQuery(jpql, Room.class).setParameter("id", id).getResultList();
    }

}