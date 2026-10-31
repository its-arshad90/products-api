package uk.ac.westminster.products_api.productsapi;
//this PhysicalProduct is a product
//A PhysicalProduct IS-A Product because it extends from product class
public class PhysicalProduct extends Product implements Discountable{

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){};

    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg(){return weightKg;}
    public String getDimensions(){return dimensions;}

    @Override
    public String getSummary() {
        return "physical: " + getName()+
                " | weightKg" + weightKg;
    }

    @Override
    public void applyDiscount(double rate){
       double capped = Math.min(rate, 0.20);
       this.discountedPrice = getPrice() * (1 - capped);

    }

    @Override
    public  double getDiscountedPrice(){
        return discountedPrice;
    }
}
