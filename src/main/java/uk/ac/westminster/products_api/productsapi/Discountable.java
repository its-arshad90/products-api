package uk.ac.westminster.products_api.productsapi;

public interface Discountable {

    void applyDiscount(double rate);
    double getDiscountedPrice();
}
