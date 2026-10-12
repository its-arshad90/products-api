package uk.ac.westminster.products_api.productsapi;

public class product {
    public Long id;
    public String name;
    public double price;

    public product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}