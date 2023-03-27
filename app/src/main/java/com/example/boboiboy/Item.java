package com.example.boboiboy;

public class Item {
    String name;
    String power;
    int image;

    public Item(String name, String power, int image) {
        this.name = name;
        this.power = power;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}