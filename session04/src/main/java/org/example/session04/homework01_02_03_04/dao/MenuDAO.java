package org.example.session04.homework01_02_03_04.dao;

import org.example.session04.homework01_02_03_04.model.Menu;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class MenuDAO {
    public List<Menu> findByCategory(String category) {
        return Arrays.asList(
                new Menu(category, "Món 1"),
                new Menu(category, "Món 2")
        );
    }
}