package com.SweetHome.PaymentApplication.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="Payment_info")
public class PaymentServiceEntity {
    @Id
    @Column(name="transactionID",unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int transaction_Id;
    @Column(name="paymentMode")
            @Enumerated(EnumType.STRING)
    PaymentMode paymentMode;
    public enum PaymentMode{
        MALE,FEMALE

    }
    @Column(name="bookingId",nullable = false)
    int bookingId;
    @Column(name="upiId")
    int upi_Id;
    @Column(name="cardNumber")
    int card_number;

    public int gettransaction_Id() {
        return transaction_Id;
    }

    public void settransaction_Id(int transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUpi_Id() {
        return upi_Id;
    }

    public void setUpi_Id(int upi_Id) {
        this.upi_Id = upi_Id;
    }

    public int getCard_number() {
        return card_number;
    }



    public void setCard_number(int card_number) {
        this.card_number = card_number;

    }
    @Override
    public String toString() {
        return "PaymentServiceEntity{" +
                "transaction_Id=" + transaction_Id +
                ", paymentMode=" + paymentMode +
                ", bookingId=" + bookingId +
                ", upi_Id=" + upi_Id +
                ", card_number=" + card_number +
                '}';
    }
}
