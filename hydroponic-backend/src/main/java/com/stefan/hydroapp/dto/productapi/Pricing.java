package com.stefan.hydroapp.dto.productapi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Pricing {

    private BigDecimal basePrice;
    private BigDecimal shipping;
    private double tax;
}
