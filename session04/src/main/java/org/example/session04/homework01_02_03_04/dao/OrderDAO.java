package org.example.session04.homework01_02_03_04.dao;

import org.example.session04.homework01_02_03_04.model.Order;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class OrderDAO {
    public List<Order> findAll() {
        return Arrays.asList(
                new Order(1, "Đơn hàng số 1"),
                new Order(2, "Đơn hàng số 2")
        );
    }

    public String getAllOrders() {
        return "Danh sách toàn bộ đơn hàng";
    }

    public String getOrderById(int id) {
        return "Thông tin đơn hàng số " + id;
    }
}

