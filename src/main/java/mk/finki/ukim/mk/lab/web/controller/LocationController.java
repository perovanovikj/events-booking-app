package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.model.Location;
import mk.finki.ukim.mk.lab.service.LocationService;
import mk.finki.ukim.mk.lab.service.impl.LocationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    // Display the add location form
    @GetMapping("/add-form")
    public String addLocationForm() {
        return "add-location";
    }

    // Handle the form submission to add a new location
    @PostMapping("/add")
    public String addLocation(@RequestParam String name,
                              @RequestParam String address,
                              @RequestParam String capacity,
                              @RequestParam String description) {
        Location location = new Location(name, address, capacity, description);
        locationService.save(location); // Save the location using the service layer
        return "redirect:/events/events-list"; // Redirect to the events list page after adding the location
    }
}
