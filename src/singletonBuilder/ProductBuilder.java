package singletonBuilder;

import java.time.LocalDate;

public class ProductBuilder {
    private int productId;
    private String name;
    private int price;
    private LocalDate date;
    //build method is called for creating the final product obj
    public ProductBuilder withProductId(int productId) {  //sets id
        this.productId = productId;
        return this;
    }

    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder withYear(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder withLocalDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Product build() { //creates and returns a new obj of product type
        Product product = new Product();
        product.setProductId(this.productId);
        product.setName(this.name);
        product.setPrice(this.price);
        product.setDate(this.date);
        return product;
    }
}

