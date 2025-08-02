package com.stefan.hydroapp.dto.productapi.enums;

public enum ProductType {

    COLUMN("Aeroponiksäule"),
    TROUGH("Ebbe-Flut-Trog");

    private String description;

    ProductType(String description) {
        this.description = description;
    }
}
