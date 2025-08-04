package com.stefan.hydroapp.rest;

import com.stefan.hydroapp.dto.emailApi.ContactForm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class EmailController {

    private final JavaMailSender javaMailSender;
    private final String toAddress;

    public EmailController(JavaMailSender javaMailSender, @Value("${mail.to}") String targetAddress) {
        this.javaMailSender = javaMailSender;
        this.toAddress = targetAddress;
    }

    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody ContactForm form) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(this.toAddress);
        mailMessage.setReplyTo(form.getFromAdress());
        mailMessage.setFrom(form.getFromName());
        mailMessage.setSubject("Anfrage von " + form.getFromName() + "(" + form.getFromAdress()
                + "):" + form.getSubject());
        mailMessage.setText(form.getMessage());

        try {
            javaMailSender.send(mailMessage);
            return ResponseEntity.ok("Mail gesendet.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Fehler beim Senden der Mail: "
                    + e.getMessage());
        }
    }
}
