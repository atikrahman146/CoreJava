/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep28_inheritance;

/**
 *
 * @author J2EE-33
 */
public class Father implements Property{
    private String name;
    private double p;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double property(double p) {
        return p;
    }

}
