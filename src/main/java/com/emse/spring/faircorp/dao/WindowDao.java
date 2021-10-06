package com.emse.spring.faircorp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emse.spring.faircorp.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;


public interface WindowDao extends JpaRepository<Window, Long>, WindowDaoCustom {

    @Query("select w from Window w where w.name=:name")
    Window findByName(@Param("name") String name);

    @Modifying // (3)
    @Query("delete from Window w where w.room.id = ?1")
    void deleteByRoom(Long id);
}