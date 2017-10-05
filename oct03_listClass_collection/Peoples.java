/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_listClass_collection;

/**
 *
 * @author J2EE-33
 */
public class Peoples {
    String Name;
    Double salary;
    Country country;

    public Peoples(String Name, Double salary, Country country) {
        this.Name = Name;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return Name;
    }

    public Double getSalary() {
        return salary;
    }

    public Country getCountry() {
        return country;
    }
    
    
}
