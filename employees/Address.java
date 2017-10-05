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
public class Address {
    private String house;
    private String road;
    private String thana;
    private String district;

    public Address(String house, String road, String thana, String district) {
        this.house = house;
        this.road = road;
        this.thana = thana;
        this.district = district;
    }

    public String getHouse() {
        return house;
    }

    public String getRoad() {
        return road;
    }

    public String getThana() {
        return thana;
    }

    public String getDistrict() {
        return district;
    }
    
    
}
