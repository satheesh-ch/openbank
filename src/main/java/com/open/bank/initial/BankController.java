package com.open.bank.initial;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bank/online")
public class BankController {

    public ResponseEntity generateCustomerBase()
    {
        //Just added the commnet from another user with another branch satheesh-second/branch2
        return null;
    }
}
