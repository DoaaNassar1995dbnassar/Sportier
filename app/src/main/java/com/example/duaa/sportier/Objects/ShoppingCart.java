package com.example.duaa.sportier.Objects;

/**
 * Created by AL-Qema on 01/03/18.
 */

public class ShoppingCart {

    String number ;
    String price;
    String image ;

    public ShoppingCart(String number, String price, String image) {
        this.number = number;
        this.price = price;
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
