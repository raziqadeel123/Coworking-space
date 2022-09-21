package Coworking.Coworkingspace.controller;

import Coworking.Coworkingspace.entity.Booking;
import Coworking.Coworkingspace.services.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/auth")
public class bookingController {
    @Autowired
    BookingServices bookingServices;

    @Autowired
    public bookingController(BookingServices bookingServices){
        this.bookingServices = bookingServices;
    }
    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    private List<Booking> findallBooking(){
        return bookingServices.findallBooking();
    }
    @RequestMapping(value = "/findBookingUser/{userid}", method = RequestMethod.GET )
    private List<Booking> findBookingByUser(@PathVariable("userid") Long id){
            return bookingServices.findBookingByUser(id);
    }
}

