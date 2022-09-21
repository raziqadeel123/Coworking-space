package Coworking.Coworkingspace.services;

import Coworking.Coworkingspace.entity.Booking;
import Coworking.Coworkingspace.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServices {
    private final BookingRepo bookingRepo;

    @Autowired
    public  BookingServices  (BookingRepo bookingRepo){
        this.bookingRepo = bookingRepo;
    }
    public List<Booking>findallBooking(){
        return bookingRepo.findAll();
    }
    public List<Booking>findBookingByUser(Long id){
        return bookingRepo.findByUser(id);
    }
}
