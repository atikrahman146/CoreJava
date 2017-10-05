/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author J2EE-33
 */
public class Dog {

    private String name;
    private String color;
    private String race;
    private double price;

    public Dog(String name, String color, String race, double price) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }

    public double getPrice() {
        return price;
    }
    
}
