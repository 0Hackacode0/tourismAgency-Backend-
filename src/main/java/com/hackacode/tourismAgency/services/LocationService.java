package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.Location;

import java.util.List;

public interface LocationService {
    Location save(Location location);
    List<Location> readAll();
    Location readById(Long id);
    Location update(Location location);
    void delete(Long id);
}
