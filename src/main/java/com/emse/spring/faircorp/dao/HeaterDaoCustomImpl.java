package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteByRoom(Long id) {
        String jpql =  "delete from Heater h where heater_id =: heater_id";
        em.createQuery(jpql).setParameter("heater_id", id).executeUpdate();
    }

    @Override
    public void deleteByHeater(Long id) {

    }

    @Override
    public void deleteAllHeatersByRoom(Long id) {

    }

    @Override
    public List<Heater> getHeatersByRoom(Long id) {
        return null;
    }
}
