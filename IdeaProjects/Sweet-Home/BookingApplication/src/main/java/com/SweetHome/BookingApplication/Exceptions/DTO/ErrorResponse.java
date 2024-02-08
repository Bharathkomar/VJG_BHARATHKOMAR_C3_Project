package com.SweetHome.BookingApplication.Exceptions.DTO;

import java.util.List;

public class ErrorResponse {
    private String message;
   private List<String> errorDetails;
   public ErrorResponse(String message,List errorDetails)
   {
       this.message=message;
       this.errorDetails=errorDetails;
   }
}
