package com.SweetHome.PaymentApplication.Controller;

import com.SweetHome.PaymentApplication.Entity.PaymentServiceEntity;
import com.SweetHome.PaymentApplication.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/payment")

public class PaymentController {
    @Autowired
    PaymentService paymentService;
@PostMapping(value="/transaction",consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity retrieveTransactionId(PaymentServiceEntity paymentServiceEntity) {
        if (paymentServiceEntity.getCard_number() == 0 || paymentServiceEntity.getUpi_Id() == 0) {
            PaymentServiceEntity savedPaymentServiceEntity = paymentService.savePaymentInfo(paymentServiceEntity);
            int transaction_Id = savedPaymentServiceEntity.gettransaction_Id();
            return new ResponseEntity(transaction_Id, HttpStatus.CREATED);
        }
        else return new ResponseEntity(paymentServiceEntity.gettransaction_Id(),HttpStatus.NOT_ACCEPTABLE);
    }
    @GetMapping(value="/transaction/{transactionId}",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity retrievePaymentInfo(@PathVariable(name="transactionId") int id)
    {
        PaymentServiceEntity savedPaymentServiceEntity=paymentService.retrievePaymentInfo(id);
        return new ResponseEntity(savedPaymentServiceEntity,HttpStatus.OK);
    }


}
