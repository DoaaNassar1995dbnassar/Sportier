package com.example.duaa.sportier.Objects;

/**
 * Created by AL-Qema on 28/02/18.
 */

public class SubSection {
    String name ;
    String newPrice;
    String oldPrice;

    public SubSection(String name, String newPrice, String oldPrice) {
        this.name = name;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }
}
