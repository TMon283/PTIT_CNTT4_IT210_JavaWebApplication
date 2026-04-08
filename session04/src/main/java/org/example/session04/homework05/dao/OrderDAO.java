package org.example.session04.homework05.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {

    public String findOrderById(int id) {
        return "Thông tin đơn hàng số " + id;
    }

    public String createOrder(String description) {
        return "Đã tạo đơn hàng mới với mô tả: " + description;
    }

    public String deleteOrder(int id) {
        return "Đơn hàng số " + id + " đã được hủy!";
    }
}
