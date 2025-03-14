package mk.finki.ukim.mk.lab.repository.jpa;

import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.SavedBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavedBookingRepository extends JpaRepository<SavedBooking, Long> {
    List<SavedBooking> findByEvent(Event event);
}
