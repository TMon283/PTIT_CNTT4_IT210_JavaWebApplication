package org.example.btth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AccountManagement {
    private Map<String, Double> person = new HashMap<>();

    @Autowired
    private NormalNotify normalNotify;

    @Autowired
    private VIPNotify vipNotify;

    public AccountManagement(Map<String, Double> person) {
        this.person = person;
    }

    public AccountManagement() {
    }

    public void checkYourComputer(String username, String area) {
        if (username == null || username.isEmpty()) {
            System.err.println("[ERROR] Tai khoan khong duoc de trong");
            return;
        }

        if (!person.containsKey(username)) {
            System.err.println("[ERROR] Tai khoan khong ton tai");
            return;
        }

        Double balance = person.get(username);
        if (balance < 0) {
            System.err.println("[ERROR] Tai khoan khong du tien");
            return;
        }

        if (balance < 5000) {
            if (area.equals("VIP")) {
                vipNotify.sendNotify(username, "Em mời fuong/fuba nạp tiền ạ");
            } else if (area.equals("Normal")) {
                normalNotify.sendNotify(username, "Nạp tiền vào bạn eii");
            }
        }
    }
}
