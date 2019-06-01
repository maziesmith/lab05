package com.mad.mylibrary;

public class DishItem {
    private String name;
    private String desc;
    private float price;
    private int quantity;
    private String photo;
    private int frequency;

    public DishItem() {
        this.name = "";
        this.desc = "";
        this.price = 0;
        this.quantity = 0;
        this.photo = null;
        this.frequency = 0;
    }

    public DishItem(String name, String desc, float price, int quantity, String photo, int frequency) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
        this.photo = photo;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPhoto() {
        return photo;
    }

    public int getFrequency() {
        return frequency;
    }
}
