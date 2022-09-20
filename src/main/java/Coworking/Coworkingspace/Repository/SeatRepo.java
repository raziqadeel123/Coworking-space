package Coworking.Coworkingspace.Repository;

import Coworking.Coworkingspace.Entity.Seat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeatRepo extends CrudRepository <Seat, Long> {
    List<Seat> findAll();
}
