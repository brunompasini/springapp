package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.nio.channels.FileChannel;

public interface HeaterDao extends JpaRepository<Heater, Long>, HeaterDaoCustom{

    @Modifying
    @Query("select h from Heater h where h.name =: name")
    Heater findByName(@Param("name") String name);

}