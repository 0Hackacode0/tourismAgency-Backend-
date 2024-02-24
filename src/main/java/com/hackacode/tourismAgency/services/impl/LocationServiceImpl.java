package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.Location;
import com.hackacode.tourismAgency.repositories.LocationRepository;
import com.hackacode.tourismAgency.services.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepo;
    @Override
    public Location save(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public List<Location> readAll() {
        return locationRepo.findAll();
    }

    @Override
    public Location readById(Long id) {
        return locationRepo.findById(id).orElse(null);
    }

    @Override
    public Location update(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public void delete(Long id) {
        locationRepo.deleteById(id);
    }
}
