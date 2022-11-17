package com.example.demoss.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Request {
        private String merchantTransactionID;
        private String MSISDN;
        private String accountNumber;
        private String customerEmail;
        private Integer requestAmount;
        private String currencyCode;
        private String serviceCode;
        private String dueDate;
        private String requestDescription;
        private String countryCode;
        private String languageCode;
        private String successRedirectUrl;
        private String failRedirectUrl;
        private String paymentWebhookUrl;
        private String pendingRedirectUrl;

}
