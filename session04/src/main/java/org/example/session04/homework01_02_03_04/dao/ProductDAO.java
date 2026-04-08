package org.example.session04.homework01_02_03_04.dao;

import org.example.session04.homework01_02_03_04.model.Product;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductDAO {
    public List<Product> findAll() {
        return Arrays.asList(
                new Product(1, "Sản phẩm A"),
                new Product(2, "Sản phẩm B")
        );
    }

    public Product findById(int id) {
        return new Product(id, "Sản phẩm số " + id);
    }
}