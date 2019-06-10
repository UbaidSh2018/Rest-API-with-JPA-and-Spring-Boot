package com.sprintbootapi.coursesapi.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ProductService {

    private GroceryProductsData groceryProductsData;

    ProductService(){
        groceryProductsData = new GroceryProductsData();
    }

    public Map<String , List<Product>> getAllProducts(){
       return groceryProductsData.getListOfProducts();
    }

    public List<Product> getProductByTag(String tag){
        return groceryProductsData.getListOfProducts().get(tag);
    }

    public List<String> getAllTags(){
        return groceryProductsData.getTags();
    }

    public Product getProductByID(String tag , Long id){
      return  getProductByTag(tag).stream().filter(product->product.getId().equals(id)).findFirst().get();
    }

    public double getProductPriceByID(String tag , Long id){
       return getProductByID(tag , id).getPrice();
    }



    public static void main(String[] args) {
        ProductService ps = new ProductService();
        System.out.println(ps.getAllProducts());
        System.out.println("...........");
        System.out.println(ps.getProductByTag("dairy"));
        System.out.println(ps.getAllTags());

        System.out.println("eiuhfiuehiufefhiuefhiuehfuih");

        System.out.println(ps.getProductByID("meat" , 1L));

        System.out.println("eiuiuehfuih");

        System.out.println(ps.getProductPriceByID("dairy", 4L));
    }
}
