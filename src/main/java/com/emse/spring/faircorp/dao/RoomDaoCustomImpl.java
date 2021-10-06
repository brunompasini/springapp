package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RoomDaoCustomImpl implements RoomDaoCustom{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Room findByName(String name) {
        String jpql = "select r from Room r where r.name = :name";
        return (Room) em.createQuery(jpql, Room.class)
                .setParameter("name", name)
                .getResultList();
    }




}

/*

public class WindowDaoCustomImpl implements WindowDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Window> findRoomOpenWindows(Long id) {
        String jpql = "select w from Window w where w.room.id = :id and w.windowStatus= :status";
        return em.createQuery(jpql, Window.class)
                .setParameter("id", id)
                .setParameter("status", WindowStatus.OPEN)
                .getResultList();
    }
}

 */