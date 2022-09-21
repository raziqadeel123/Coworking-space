package Coworking.Coworkingspace.controller;

import Coworking.Coworkingspace.entity.Seat;
import Coworking.Coworkingspace.services.SeatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class seatController {
    private final SeatServices seatServices;

    @Autowired
    public seatController(SeatServices seatServices){
          this.seatServices = seatServices;
    }
    @RequestMapping("/seats")
    private List<Seat> findAllSeat(){
        return seatServices.getAllSeats();
    }
}
