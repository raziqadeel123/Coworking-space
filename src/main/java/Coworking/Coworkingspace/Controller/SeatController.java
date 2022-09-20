package Coworking.Coworkingspace.Controller;

import Coworking.Coworkingspace.Entity.Seat;
import Coworking.Coworkingspace.Services.SeatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
public class SeatController {
    private final SeatServices seatServices;

    @Autowired
    public SeatController(SeatServices seatServices){
          this.seatServices = seatServices;
    }
    @RequestMapping("/seats")
    private List<Seat> findAllSeat(){
        return seatServices.getAllSeats();
    }
}
