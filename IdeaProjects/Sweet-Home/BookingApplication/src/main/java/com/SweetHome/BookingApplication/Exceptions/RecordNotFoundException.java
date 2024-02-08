package com.SweetHome.BookingApplication.Exceptions;


    public class RecordNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public RecordNotFoundException(String message) {
            super(message);
        }
    }

