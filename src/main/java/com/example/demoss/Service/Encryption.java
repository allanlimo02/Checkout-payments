package com.example.demoss.Service;

import com.example.demoss.Dto.Request;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cellulant.service.CheckoutEncryption;
import org.springframework.stereotype.Service;

@Service
public class Encryption {

    String ivKey = "jNBDVrxfc367p4HT";
    String secretKey =  "hdQGZxDKfrLT4CPj";
    String accessKey = "$2a$08$lMT.IzAe1Y6lKwPZNI1oKe6pPnOQgNINK6cyld/xVp6HKN48kmMF2";
    String countryCode = "KE";

     ObjectMapper obj =  new ObjectMapper();

     Request request = new Request("52uu66ybvduuurvhgs", "25478199911", "jjokocha",
             "allan.checkout.io", 450, "KES", "SERDEV8099",
             "2022-11-17 17:00:56", "Jordanb Shoes", "KE","en",
             "https://www.google.com/", "https://www.google.com/","https://www.google.com/",
             "https://www.google.com/");

     public String getCheckoutUrl (){

         String checkoutUrl = "";

         try{

             CheckoutEncryption checkoutEncryption = new CheckoutEncryption(ivKey, secretKey);
             String payloadString = obj.writeValueAsString(request);
             String param = checkoutEncryption.encrypt(payloadString);

             checkoutUrl = "https://developer.tingg.africa/checkout/v2/express/?accessKey="+ accessKey+"&params="+param+"&countryCode="+
             countryCode;

         }catch(Exception e){
             e.getMessage();

         }

         return checkoutUrl;
     }


}
