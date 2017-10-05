/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author J2EE-33
 */
public class User {
    private int id;
    private String name;
    private String country;
    private String email;

    public User(int id, String name, String country, String email) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }
}
