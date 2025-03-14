package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<Location> listAll();
    Optional<Location> findById(long id);
    void save(Location location);  // Add this method for saving a location
}