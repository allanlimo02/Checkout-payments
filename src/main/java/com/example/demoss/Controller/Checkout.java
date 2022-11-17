package com.example.demoss.Controller;

import com.example.demoss.Service.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checkout {

    @Autowired
    Encryption encryption;

    @RequestMapping("/checkout")
    public String getCheckoutUrl(){
        String checkoutUrl = "";

        checkoutUrl = encryption.getCheckoutUrl();

        return checkoutUrl;
    }
}
