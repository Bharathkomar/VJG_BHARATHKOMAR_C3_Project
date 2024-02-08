package com.SweetHome.BookingApplication.Service;

import com.SweetHome.BookingApplication.DAO.BookingDAO;
import com.SweetHome.BookingApplication.Entity.BookingInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static java.util.concurrent.TimeUnit.DAYS;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Random;

@Service
public class BookingInfoServiceImpl implements BookingInfoService {
    @Autowired
    BookingDAO bookingDAO;
    @Autowired
    RestTemplate restTemplate;
    @Value("{$paymentApp.url}")
    String paymentUri;


    public BookingInfoEntity initializeBooking(BookingInfoEntity bookingInfoEntity)
    {int numberOfDays = (int)DAYS.toChronoUnit().between((Temporal) bookingInfoEntity.getToDate(), (Temporal) bookingInfoEntity.getFromDate());
        int roomPrice= 1000*bookingInfoEntity.getNumOfRooms()*numberOfDays;
        bookingInfoEntity.setRoomNumbers(assignRoomNumbers(bookingInfoEntity.getNumOfRooms()));
        bookingInfoEntity.setRoomPrice(roomPrice);
        BookingInfoEntity createdBookingInfoEntity= (BookingInfoEntity) bookingDAO.save(bookingInfoEntity);
        return createdBookingInfoEntity;
    }

public BookingInfoEntity finaliseBooking(int id)
{Integer transactionId = null;
    BookingInfoEntity toBeUpdatedBookingInfoEntity=(BookingInfoEntity) bookingDAO.findById(id).get();
    restTemplate.getForObject(paymentUri, Integer.class,transactionId);
    int tsId = transactionId.intValue();
    toBeUpdatedBookingInfoEntity.setTransactionID(tsId);/*To be changed*/
    BookingInfoEntity finalisedBookingInfoEntity=(BookingInfoEntity) bookingDAO.save(toBeUpdatedBookingInfoEntity);
    return finalisedBookingInfoEntity;

}
public static ArrayList<String> assignRoomNumbers(int numberOfRooms) {
    Random rand = new Random();
    int upperBound = 100;
    ArrayList<String> numberList = new ArrayList<String>();

    for (int i = 0; i < numberOfRooms; i++) {
        numberList.add(String.valueOf(rand.nextInt(upperBound)));

    }
    return numberList;

}
}
