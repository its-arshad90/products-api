package uk.ac.westminster.products_api.productsapi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        DigitalProduct dp1 = new DigitalProduct(nextId++, "mouse",33.5,"https://example.com",756.56);
        PhysicalProduct pp1 = new PhysicalProduct(nextId++,"laptop",55.5,15.8,"3D");

        products.add(dp1);
        products.add(pp1);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public void deleteProductById(Long id){
        products.removeIf(p -> p.getId().equals(id) );
    }

    public List<Product> findProductsByName(String name){
        return products.stream()
                .filter(p -> p.getName().contains(name) )
                .toList();
    }

    public List<String> getAllSummaries() {
        List<String> summaries = new ArrayList<>();
        for (Product p : products) {
            summaries.add(p.getSummary());
        }
        return summaries;
    }





}
