package com.stefan.hydroapp.dto.productapi.productstats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Column extends Measurements{

    private int height;
    private int circumference;

    public Column(int height, int width, int length) {
        super(height, width, length);
    }
}
