package com.stefan.hydroapp.dto.productapi;

import com.stefan.hydroapp.dto.productapi.enums.ProductType;
import com.stefan.hydroapp.dto.productapi.enums.WateringSystem;
import com.stefan.hydroapp.dto.productapi.productstats.ProductStats;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int id;
    private Pricing pricing;
    private String name;
    private String description;
    private ProductType type;
    private WateringSystem system;
    private ProductStats productStats;
}
