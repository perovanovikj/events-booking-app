package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.SavedBooking;
import mk.finki.ukim.mk.lab.repository.jpa.SavedBookingRepository;
import mk.finki.ukim.mk.lab.service.SavedBookingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavedBookingServiceImpl implements SavedBookingService {
    private final SavedBookingRepository savedBookingRepository;


    public SavedBookingServiceImpl(SavedBookingRepository savedBookingRepository) {
        this.savedBookingRepository = savedBookingRepository;
    }

    public Optional<SavedBooking> save(Event event, int numTickets){
        return Optional.of(this.savedBookingRepository.save(new SavedBooking(event, numTickets)));
    }

    public List<SavedBooking> findByEvent(Event event){
        return savedBookingRepository.findByEvent(event);
    }
}
