package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.*;
import java.util.*;

public interface HeaterDaoCustom {
    void deleteByRoom(Long id);
    void deleteByHeater(Long id);
    void deleteAllHeatersByRoom(Long id);
    List<Heater> getHeatersByRoom(Long id);
}
