package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.SavedBooking;

import java.util.List;
import java.util.Optional;

public interface SavedBookingService {
  Optional<SavedBooking> save(Event event, int numTickets);
  List<SavedBooking> findByEvent(Event event);
}
