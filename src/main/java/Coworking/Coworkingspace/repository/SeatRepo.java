package Coworking.Coworkingspace.repository;

import Coworking.Coworkingspace.entity.Seat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeatRepo extends CrudRepository <Seat, Long> {
    List<Seat> findAll();
}
