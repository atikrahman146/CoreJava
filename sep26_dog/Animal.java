/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep26_dog;

/**
 *
 * @author J2EE-33
 */
public class Animal {
    public String bark;
    public String run;

    public Animal(String bark, String run) {
        this.bark = bark;
        this.run = run;
    }

    public String getBark() {
        return bark;
    }

    public String getRun() {
        return run;
    }

    public String getDetails() {
        return bark + " and "+ run + '.';
    }
    
    
}
