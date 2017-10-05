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
public class Cat extends Animal{
    public String steal;

    public Cat(String steal, String bark, String run) {
        super(bark, run);
        this.steal = steal;
    }

    public String getSteal() {
        return steal;
    }

    @Override
    public String getDetails() {
        return "Cat{" + bark + " and "+ run + " and steal=" + steal + '}';
    }
    
    
}
