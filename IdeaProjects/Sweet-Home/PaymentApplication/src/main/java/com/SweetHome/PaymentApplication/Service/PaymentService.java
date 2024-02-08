package com.SweetHome.PaymentApplication.Service;

import com.SweetHome.PaymentApplication.DAO.PaymentDAO;
import com.SweetHome.PaymentApplication.Entity.PaymentServiceEntity;



public interface PaymentService {


public PaymentServiceEntity savePaymentInfo(PaymentServiceEntity paymentServiceEntity);

public PaymentServiceEntity retrievePaymentInfo(int id);

}
