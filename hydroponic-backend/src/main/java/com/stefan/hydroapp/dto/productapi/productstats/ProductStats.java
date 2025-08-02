package com.stefan.hydroapp.dto.productapi.productstats;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductStats {

        private Measurements measurements;
        private int plantArea;
        private int plantLots;
        private int tankVolume;


}
