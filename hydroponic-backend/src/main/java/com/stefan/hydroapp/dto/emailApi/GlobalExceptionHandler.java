package com.stefan.hydroapp.dto.emailApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(Exception ex) {
        ex.printStackTrace(); // ← zeigt dir den wahren Grund für 500
        return ResponseEntity.status(500).body("Fehler: " + ex.getMessage());
    }
}
