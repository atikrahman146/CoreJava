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
public class Dog extends Animal{
    public String faithful;

    public Dog(String faithful, String bark, String run) {
        super(bark, run);
        this.faithful = faithful;
    }

    public String getFaithful() {
        return faithful;
    }

    @Override
    public String getDetails() {
        return bark + ", " + run  + " and it " + faithful + '.';
    }
    
}
