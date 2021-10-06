package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.nio.channels.FileChannel;

public interface HeaterDao extends JpaRepository<Heater, String>{

    @Query("select h from Heater h where h.name=:name")
    Heater findByName(@Param("name") String name);

    @Query("select h from Heater h where h.id=:id")
    Heater findById(@Param("id") Long id);

    @Query("delete from Heater d where d.room.id =: room_id")
    Heater deleteByRoom(@Param("room_id") Long room_id);


}