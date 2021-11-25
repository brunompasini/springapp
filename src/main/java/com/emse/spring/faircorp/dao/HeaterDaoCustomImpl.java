package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteHeatersByRoom(Long id) {
        String jpql = "delete from Heater h where h.room.id =: id";
        em.createQuery(jpql).setParameter("id", id).executeUpdate();
    }

    public List<Heater> getHeatersByRoom(Long id) {
        String jpql = "select h from Heater where h.room.id=:id";
        return em.createQuery(jpql, Heater.class).setParameter("id",id).getResultList();
    }

    @Override
    public List<Heater> getHeatersByBuilding(Long id) {
        String jpql = "select h from Heater where h.room.building.id=:id";
        return em.createQuery(jpql, Heater.class).setParameter("id",id).getResultList();
    }

}
