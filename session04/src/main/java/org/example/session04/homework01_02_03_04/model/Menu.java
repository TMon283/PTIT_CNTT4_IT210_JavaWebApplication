package org.example.session04.homework01_02_03_04.model;

public class Menu {
    private String category;
    private String itemName;

    public Menu() {
    }

    public Menu(String category, String itemName) {
        this.category = category;
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
