package com.stefan.hydroapp.dto.productapi.productstats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Base extends Measurements{

    private int height;
    private int width;
    private int length;

    public Base(int length, int width, int height) {
        super(length, width, height);
    }
}
