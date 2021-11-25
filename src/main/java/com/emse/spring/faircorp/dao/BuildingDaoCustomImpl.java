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


    @Override
    public List<Room> getAllRoomsByBuilding(Long id) {
        String jpql = "select a from Room a where a.building.id=:id";
        return em.createQuery(jpql, Room.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public List<Heater> getAllHeatersByBuilding(Long id) {
        String jpql = "select h from Heater h where h.building.id=:id";
        return em.createQuery(jpql, Heater.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public List<Window> getAllWindowsByBuilding(Long id) {
        String jpql = "select w from Window w where w.building.id=:id";
        return em.createQuery(jpql, Window.class)
                .setParameter("id", id)
                .getResultList();    }
}