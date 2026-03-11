package com.sample.DPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/products") // fetching entire data
    public List<Product> getProducts()
    {
        return service.getProductsDetails();
    }

    // fetching one particular data based on id -> name
    // URL parameters
    // Path variable -> /product/1
    // RequestParam  -> /product?id=101

    // Path variable
//    @GetMapping("/product/{id}")
//    public Product getProductById(@PathVariable int id)
//    {
//        return service.getProductDetailsById(id);
//    }

    // Request param
    @GetMapping("/product")
    public Product getProductById(@RequestParam int id)
    {
        return service.getProductDetailsById(id);
    }

    // POST -> save
    // product -> id , name , price

//    @PostMapping("/save")
//    public Product saveProduct(@RequestParam int id,@RequestParam String name,@RequestParam int price)
//    {
//        return service.saveProductDetails(id,name,price);
//    }

    // @RequestBody
    // get details for products in the format of JSON obj from user
    // JSON -> Java object
    /*
    {
    "id":106,
    "name":"sample",
    "price":400
    } convert into java object
     */
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product)
    {
        return service.saveProductDetailsNew(product);
    }
//  1. we have to update product that already exist
//  2. find that Product by id
//  3. update the new Product details

    @PutMapping("/update/{id}") // id
    public Product update(@PathVariable int id, @RequestBody Product newProduct)
    {
        return service.updateProduct(id, newProduct);
    }

    // Delete -> already existing
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }
    // java obj -> json
    // text, json, xml
}