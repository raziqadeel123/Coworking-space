package Coworking.Coworkingspace.Controller;

import Coworking.Coworkingspace.Entity.Booking;
import Coworking.Coworkingspace.Entity.User;
import Coworking.Coworkingspace.Services.BookingServices;
import Coworking.Coworkingspace.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingServices bookingServices;

    @Autowired
    public BookingController (BookingServices bookingServices){
        this.bookingServices = bookingServices;
    }
    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    private List<Booking> findallBooking(){
        return bookingServices.findallBooking();
    }
    @RequestMapping(value = "/findBookingUser/{userId}", method = RequestMethod.GET )
    private List<Booking> findBookingByUser(@PathVariable("userID") Long id){
            return bookingServices.findBookingByUser(id);
    }
}

