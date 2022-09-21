package Coworking.Coworkingspace.repository;

import Coworking.Coworkingspace.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Long> {
    List<Booking> findByUser(Long user);
    List <Booking> findAll();
}
