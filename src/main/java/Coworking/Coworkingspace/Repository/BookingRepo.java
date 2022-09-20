package Coworking.Coworkingspace.Repository;

import Coworking.Coworkingspace.Entity.Booking;
import Coworking.Coworkingspace.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Long> {
    List<Booking> findByUser(Long user);
    List <Booking> findAll();
}
