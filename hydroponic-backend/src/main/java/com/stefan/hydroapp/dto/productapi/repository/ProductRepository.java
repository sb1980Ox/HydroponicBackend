package com.stefan.hydroapp.dto.productapi.repository;

import com.stefan.hydroapp.dto.productapi.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
