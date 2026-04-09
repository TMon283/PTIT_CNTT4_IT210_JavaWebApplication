package org.example.session05.homework03.service;

import org.example.session05.homework03.model.Dish;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdminDishService {

    private static final List<Dish> dishes = Arrays.asList(
            new Dish(4L, "Phở bò", 45000.0, true),
            new Dish(5L, "Bún chả", 40000.0, true),
            new Dish(6L, "Nem rán", 30000.0, false)
    );

    public Optional<Dish> findById(Long id) {
        return dishes.stream().filter(d -> d.getId().equals(id)).findFirst();
    }
}
