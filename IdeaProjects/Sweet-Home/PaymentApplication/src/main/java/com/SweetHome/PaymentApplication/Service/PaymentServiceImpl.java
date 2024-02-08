package com.SweetHome.PaymentApplication.Service;

import com.SweetHome.PaymentApplication.DAO.PaymentDAO;
import com.SweetHome.PaymentApplication.Entity.PaymentServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDAO paymentDAO;

    public PaymentServiceEntity savePaymentInfo(PaymentServiceEntity paymentServiceEntity)
    {PaymentServiceEntity savedPaymentServiceEntity= (PaymentServiceEntity) paymentDAO.save(paymentServiceEntity);

        return savedPaymentServiceEntity;


    }

    @Override
    public PaymentServiceEntity retrievePaymentInfo(int id) {
        PaymentServiceEntity retrievedPaymentEntity= (PaymentServiceEntity) paymentDAO.findById(id).get();

        return retrievedPaymentEntity;

    }
}
