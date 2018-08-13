package com.example.duaa.sportier.Objects;

/**
 * Created by AL-Qema on 05/03/18.
 */

public class MenuItemNotification {
    String name ;
    int image ;

    public MenuItemNotification(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
