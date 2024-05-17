package com.darkcode.app.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTS")
public class ProductRepository {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="product_name")
    private String product_name;
    
    @Column(name="category_name")
    private Long category_name;
    
    @Column(name="price")
    private Float price;
}
