package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.dao.BuildingDao;
import com.emse.spring.faircorp.dao.HeaterDao;
import com.emse.spring.faircorp.dao.RoomDao;
import com.emse.spring.faircorp.dao.WindowDao;
import com.emse.spring.faircorp.model.Heater;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/rooms")
@Transactional
public class RoomController {
    private final WindowDao windowDao;
    private final HeaterDao heaterDao;
    private final RoomDao roomDao;
    private final BuildingDao buildingDao;

    public RoomController(WindowDao windowDao, HeaterDao heaterDao, RoomDao roomDao, BuildingDao buildingDao) {
        this.windowDao = windowDao;
        this.heaterDao = heaterDao;
        this.roomDao = roomDao;
        this.buildingDao = buildingDao;
    }


    @GetMapping
    public List<RoomDto> getAll() {
        return roomDao.findAll().stream().map(RoomDto::new).collect(Collectors.toList());
    }

    //@GetMapping(path = "/{id}")
    //public RoomDto getById(@PathVariable Long id) {
    //    return roomDao.findById(id).map(RoomDto::new).orElse(null);
    //}
    //@GetMapping(path = "/{id}/heaters")
    //public List<Heater> getAllHeaters(@PathVariable Long id) {
    //    return heaterDao.getHeatersByRoom(id);
    //}


    // TODO
    // Make room dao find all heaters, windows
    // get : roomlist, read room (heater + window?)
    // post : add room (maybe switch all window &&|| heater)
    // delete : a room with everything inside
}
