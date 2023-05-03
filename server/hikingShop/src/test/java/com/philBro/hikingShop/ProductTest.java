package com.philBro.hikingShop;

import com.philBro.hikingShop.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {

    Product product;

    @BeforeEach
    public void setUp() {
        product = new Product("Axe", 57.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Axe", product.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(57.99, product.getPrice(), 0);
    }

}
