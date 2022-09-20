package Coworking.Coworkingspace.Services;

import Coworking.Coworkingspace.Entity.Booking;
import Coworking.Coworkingspace.Entity.User;
import Coworking.Coworkingspace.Repository.BookingRepo;
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
