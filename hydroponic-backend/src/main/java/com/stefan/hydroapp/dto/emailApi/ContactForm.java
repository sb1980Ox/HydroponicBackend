package com.stefan.hydroapp.dto.emailApi;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ContactForm {

    public ContactForm() {

    }

    @JsonProperty("name")
    private String fromName;

    @JsonProperty("email")
    private String fromAddress;

    @JsonProperty("betreff")
    private String subject;

    @JsonProperty("nachricht")
    private String message;
}
