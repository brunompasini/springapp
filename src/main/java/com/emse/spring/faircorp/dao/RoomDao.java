package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface RoomDao extends JpaRepository<Room, Long>, RoomDaoCustom{

    @Query("select w from Room w where w.name=:name")
    Room findByName(@Param("name") String name);

    @Modifying // (3)
    @Query("delete from Room w where w.id = ?1")
    void deleteRoom(Long id);

}