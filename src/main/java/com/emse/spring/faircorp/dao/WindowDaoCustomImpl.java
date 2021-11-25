package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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

    @Override
    public void deleteWindowsByRoom(Long id) {
        String jpql = "delete from Window h where h.room.id =: id";
        em.createQuery(jpql).setParameter("id", id).executeUpdate();
    }

    @Override
    public List<Window> getWindowsByRoom(Long id) {
        String jpql = "select h from Window where h.room.id=:id";
        return em.createQuery(jpql, Window.class).setParameter("id",id).getResultList();

    }

    @Override
    public List<Window> getWindowsByBuilding(Long id) {
        String jpql = "select h from Window where h.room.building.id=:id";
        return em.createQuery(jpql, Window.class).setParameter("id",id).getResultList();
    }
}
