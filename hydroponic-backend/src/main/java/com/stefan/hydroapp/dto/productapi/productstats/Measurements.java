package com.stefan.hydroapp.dto.productapi.productstats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Measurements {

    private int length;
    private int width;
    private int height;

    private Base base;
    private Column column;

    public Measurements(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

}
