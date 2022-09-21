package Coworking.Coworkingspace.services;

import Coworking.Coworkingspace.entity.Seat;
import Coworking.Coworkingspace.repository.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatServices {
    private  SeatRepo seatRepo;
    private Boolean BooleanBilder;

    @Autowired
    public SeatServices(SeatRepo seatRepo){
    }
    public List<Seat> getAllSeats(){
        return seatRepo.findAll();
    }


    public List<Seat> avaialableSeats(){
        List<Seat> result = new ArrayList<>();
        for(Seat seat : seatRepo.findAll()){
            if(seat.getAvaiable()){
                   result.add(seat);
            }
        }
        return result;
    }
}
