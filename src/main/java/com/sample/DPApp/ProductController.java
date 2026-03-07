package com.sample.DPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/products") // fetching entire data
    public ArrayList<Product> getProducts()
    {
        return service.getProductsDetails();
    }

    // fetching one particular data based on id -> name
    // URL parameters
    // Path variable -> /product/1
    // RequestParam  -> /product?id=101

    // Path varibale
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

    // java obj -> json
    // text, json, xml
}