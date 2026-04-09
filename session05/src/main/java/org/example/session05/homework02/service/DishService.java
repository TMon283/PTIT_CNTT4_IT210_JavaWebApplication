package org.example.session05.homework02.service;

import org.example.session05.homework02.model.Dish;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class DishService {

    public List<Dish> getAllDishes() {
        return Arrays.asList(
                new Dish(1L, "Phở bò", 45000.0, true),
                new Dish(2L, "Bún chả", 40000.0, true),
                new Dish(3L, "Nem rán", 30000.0, false)
        );
    }
}
