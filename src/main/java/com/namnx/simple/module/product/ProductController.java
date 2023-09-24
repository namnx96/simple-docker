package com.namnx.simple.module.product;

import com.namnx.simple.base.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/all")
    private ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/mock")
    private ResponseEntity<String> mockData() {
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setDescription("This is just example!");

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setDescription("This is just example 2!");
        productRepository.saveAll(List.of(product1, product2));

        return ResponseEntity.ok("Success");
    }
}
