package com.stefan.hydroapp.dto.emailApi;


import lombok.Data;

@Data
public class ContactForm {

    private String fromName;
    private String fromAdress;
    private String subject;
    private String message;
}
