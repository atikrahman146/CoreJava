/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_collection_list;

/**
 *
 * @author J2EE-33
 */

// Another lisr example about where to use.
public class Person {
    private long id;
    private String name;
    private Gender Gender;

    public Person(long id, String name, Gender Gender) {
        this.id = id;
        this.name = name;
        this.Gender = Gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return Gender;
    }
    
    
    
}
