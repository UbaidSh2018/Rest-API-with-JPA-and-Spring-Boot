package com.sprintbootapi.coursesapi.products;

public class Product {

  private Long id;
  private String tag;
  private String name;
  private double price;

    public Product(Long id, String tag, String name , double price) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if ( this == that ) return true;
        if ( !(that instanceof Product) ) return false;

        Product product = (Product)that;
        return this.id != null && this.id.equals(product.id);
    }
}
