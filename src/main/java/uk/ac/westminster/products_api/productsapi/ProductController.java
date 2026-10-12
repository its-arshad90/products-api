package uk.ac.westminster.products_api.productsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public product getById(@PathVariable Long id) {
        return new product(id, "Laptop", 999.99);
    }
}
