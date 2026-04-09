package org.example.session05.homework05.repository;

import org.example.session05.homework03.model.Dish;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class OrderRepository {
    public List<Dish> findAllDishes() {
        return Arrays.asList(
                new Dish(1L, "Phở bò", 45000.0, true),
                new Dish(2L, "Bún chả", 40000.0, true),
                new Dish(3L, "Nem rán", 30000.0, false)
        );
    }
}
