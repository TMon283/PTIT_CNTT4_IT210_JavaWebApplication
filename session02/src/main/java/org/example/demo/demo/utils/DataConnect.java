package org.example.demo.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {

    // Driver
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // URL
    private static final String URL = "jdbc:mysql://localhost:3306/session02?createDatabaseIfNotExists=trye";
    // USER
    private static final String USER = "root";
    // PASS
    private static final String PASS = "mona32006";

    public static Connection openConnect() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Kết nối thành công!");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối DB: " + e.getMessage());
        }
        return con;
    }
}
