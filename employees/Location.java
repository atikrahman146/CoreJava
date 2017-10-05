/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author J2EE-33
 */
public class Location {
    private String locname;
    private Address address;

    public Location(String locname, Address address) {
        this.locname = locname;
        this.address = address;
    }

    public String getLocname() {
        return locname;
    }

    public Address getAddress() {
        return address;
    }
}
