package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.*;
import java.util.*;

public interface HeaterDaoCustom {

    void deleteHeatersByRoom(Long id);
    List<Heater> getHeatersByRoom(Long id);
    List<Heater> getHeatersByBuilding(Long id);
}
