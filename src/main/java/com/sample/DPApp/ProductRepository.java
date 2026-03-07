package com.sample.DPApp;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class ProductRepository
{
    private ArrayList<Product> products;

    // PostConstruct will call this method after calling default constructor
    @PostConstruct
    public void loadProducts()
    {
        products = new ArrayList<>(Arrays.asList(
                new Product(101, "sample product 01", 200),
                new Product(102, "sample product 02", 300),
                new Product(103, "sample product 03", 300),
                new Product(104, "sample product 04", 300)
        ));
    }

    public ArrayList<Product> findAll()
    {
        return products;
    }

    public Product findById(int id) // id -> 3
    {
        Product product = products.stream()
                .filter(prod -> prod.getId() == id)
                .findFirst()
                .get();
        return product;
    }

    public Product save(Product product)
    {
        products.add(product);
        return product;
    }
}
