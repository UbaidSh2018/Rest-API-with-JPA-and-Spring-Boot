package com.sprintbootapi.coursesapi.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroceryProductsData {
   private HashMap<String, List<Product>> listOfProducts;

   private List<Product> meat;
   private List<Product> dairy;
   private List<Product> vegetables;
   private List<Product> drinks;
   private List<String> tags;

   public GroceryProductsData(){
       addProducts();
       addToMap();
   }

   private void addTags(){
       tags = new ArrayList<>();
       tags.add("meat");
       tags.add("dairy");
       tags.add("vegetables");
       tags.add("drinks");
   }

   private void addToMap(){
       listOfProducts = new HashMap<>();
       listOfProducts.put("meat" , meat);
       listOfProducts.put("dairy" , dairy);
   }

   private void addProducts(){
       addTags();
       addMeat();
       addDairy();
   }

   private void addMeat(){
       meat = new ArrayList<>();
       Product beef = new Product(1L, "meat" ,"Steak" , 15.0);
       Product lamb = new Product(2L, "meat" ,"Leg Of Lamb" , 25.0);
       Product chicken = new Product(3L, "meat" ,"Whole Chicken" , 8.0);
       meat.add(beef);
       meat.add(lamb);
       meat.add(chicken);
   }

    private void addDairy(){
        dairy = new ArrayList<>();
        Product milk = new Product(4L, "dairy" ,"Whole Milk" , 3.0);
        Product cream = new Product(5L, "dairy" ,"Fresh Cream" , 5.0);
        Product cheese = new Product(6L, "dairy" ,"Blue Cheese" , 8.0);
        dairy.add(milk);
        dairy.add(cream);
        dairy.add(cheese);
    }

   public void print(){
       System.out.println(listOfProducts);
       meat.forEach(System.out::println);
       dairy.forEach(System.out::println);

   }

    public HashMap<String, List<Product>> getListOfProducts() {
        return listOfProducts;
    }

    public List<Product> getMeat() {
        return meat;
    }

    public List<Product> getDairy() {
        return dairy;
    }

    public List<Product> getVegetables() {
        return vegetables;
    }

    public List<Product> getDrinks() {
        return drinks;
    }

    public List<String> getTags() {
        return tags;
    }

    public static void main(String[] args) {
        GroceryProductsData gp = new GroceryProductsData();
        // gp.print();
    //    List<Product> nea = gp.listOfProducts.get("meat");
    //    System.out.println(nea);


    }
}
