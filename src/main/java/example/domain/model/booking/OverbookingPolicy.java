package example.domain.model.booking;

import org.springframework.stereotype.Service;

@Service
public class OverbookingPolicy {
    public boolean isAllowed(Cargo cargo, Voyage voyage) {
        double maxBooking = voyage.capacity() * 1.1 ;
        return voyage.bookedSize() + cargo.size() <= maxBooking;
    }
}
