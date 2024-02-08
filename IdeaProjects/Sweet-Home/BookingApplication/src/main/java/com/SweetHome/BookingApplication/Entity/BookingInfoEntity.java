package com.SweetHome.BookingApplication.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Booking_Info")
public class BookingInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
int bookingId;
    @Column(name="from_Date",nullable =true)
Date fromDate;
    @Column(name="to_Date",nullable=true)
    Date toDate;
    @Column(name="aadharName",nullable=true,length=12,unique = true)
    String aadharNumber;
    @Column(name="num_Of_Rooms",nullable=false)
    int numOfRooms;
    @Column(name="Room_Number")
    List<String> RoomNumbers= new ArrayList();
    @Column(name="transaction_Id",columnDefinition = "integer default 0")
    int transactionID;

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Column(name="room_Price")
    int roomPrice;

    @Column(name="booking_Date")
    Date bookedOn;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public List<String> getRoomNumbers() {
        return RoomNumbers;
    }

    public void setRoomNumbers(List<String> roomNumbers) {
        RoomNumbers = roomNumbers;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Date getBookedOn() {
        return bookedOn;
    }

    public void setBookedOn(Date bookedOn) {
        this.bookedOn = bookedOn;
    }

    @Override
    public String toString() {
        return "BookingInfoEntity{" +
                "bookingId=" + bookingId +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", numOfRooms=" + numOfRooms +
                ", RoomNumbers=" + RoomNumbers +
                ", transactionID=" + transactionID +
                ", bookedOn=" + bookedOn +
                '}';
    }
}
