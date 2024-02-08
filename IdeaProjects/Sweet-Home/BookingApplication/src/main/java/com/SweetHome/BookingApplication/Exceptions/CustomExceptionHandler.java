package com.SweetHome.BookingApplication.Exceptions;

import com.SweetHome.BookingApplication.Exceptions.DTO.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    String RECORD_NOT_FOUND="Invalid Booking Id";
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<ErrorResponse> invalidBookingIdException(RecordNotFoundException e, WebRequest req){
        List<String> errorDetails=new ArrayList<>();
        errorDetails.add(e.getLocalizedMessage());
        ErrorResponse errorResponse=new ErrorResponse(RECORD_NOT_FOUND,errorDetails);
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
