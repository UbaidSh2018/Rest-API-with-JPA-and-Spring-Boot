package com.sprintbootapi.coursesapi.products;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public Map<String, List<Product>> listOfProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping("/products/{tag}")
    public List<Product> getProductsByTag(@PathVariable String tag){
        return productService.getProductByTag(tag);
    }

    @RequestMapping("/products/{tag}/{id}")
    public Product getProductById(@PathVariable String tag , @PathVariable Long id){
        return productService.getProductByID(tag , id);
    }

/*    @RequestMapping("/products/{tag}/{id}")
    public double getProductPriceById(@PathVariable String tag , @PathVariable Long id){
        return productService.getProductPriceByID(tag, id);
    }*/




}
