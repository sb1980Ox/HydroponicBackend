package com.stefan.hydroapp.dto.productapi.enums;

public enum WateringSystem {

    KRATKY("Kratky"),
    PRESSURE("Druckvernebler");

    private final String description;

    WateringSystem(String description) {
        this.description = description;
    }

}
