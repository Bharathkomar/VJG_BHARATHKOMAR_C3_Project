package com.SweetHome.BookingApplication.Service;

import com.SweetHome.BookingApplication.Entity.BookingInfoEntity;
import org.springframework.stereotype.Service;


public interface BookingInfoService {


    public BookingInfoEntity initializeBooking(BookingInfoEntity bookingInfoEntity);
public BookingInfoEntity finaliseBooking(int id);


}
