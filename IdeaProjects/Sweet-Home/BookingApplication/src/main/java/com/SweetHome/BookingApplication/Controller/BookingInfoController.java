package com.SweetHome.BookingApplication.Controller;

import com.SweetHome.BookingApplication.Entity.BookingInfoEntity;
import com.SweetHome.BookingApplication.Exceptions.RecordNotFoundException;
import com.SweetHome.BookingApplication.Service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/hotel")
public class BookingInfoController {





   BookingInfoService bookingInfoService;
    @Autowired
    public BookingInfoController(BookingInfoService bookingInfoService)
    {
        this.bookingInfoService=bookingInfoService;
    }

    @PostMapping(value="/booking",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity initializeBooking(BookingInfoEntity bookingInfoEntity)
    {
        BookingInfoEntity initializedBooking=bookingInfoService.initializeBooking(bookingInfoEntity);
        return new ResponseEntity(initializedBooking, HttpStatus.CREATED);
    }
    @PostMapping(value="booking/{bookingId}/transaction")
    public ResponseEntity finalizeBooking(@PathVariable(name="bookingId")int id, @RequestBody String paymentMode,@RequestBody int bookingId,@RequestBody String upiId,@RequestBody String cardNumber) throws RecordNotFoundException
    {
        BookingInfoEntity finalisedBookingInfoEntity=bookingInfoService.finaliseBooking(id);
        return new ResponseEntity(finalisedBookingInfoEntity,HttpStatus.CREATED);
    }
}
