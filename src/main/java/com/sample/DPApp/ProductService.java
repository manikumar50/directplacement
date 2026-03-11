package com.sample.DPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // component
public class ProductService
{
    @Autowired
    private ProductRepository repository; // null

    public List<Product> getProductsDetails()
    {
        return repository.findAll();
    }

    public Product getProductDetailsById(int id)
    {
        return repository.findById(id).get();

//        return repository.findById(id);
    }

    public Product saveProductDetails(int id, String name, int price)
    {
        Product product = new Product(id,name,price);
        return repository.save(product);
    }

    public Product saveProductDetailsNew(Product product)
    {
        return repository.save(product);
    }

    public Product updateProduct(int id, Product newProduct)
    {
        Product product = repository.findById(id).get();

        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());

        return product;
    }

    public String deleteProduct(int id)
    {
        Product product = repository.findById(id).get();
        repository.delete(product);
        return "deleted successfully...";
    }
}