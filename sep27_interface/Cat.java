/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep27_interface;

/**
 *
 * @author J2EE-33
 */
public abstract class Cat implements Animal{
    
    @Override
    public void eat(){
    
    };
    
    public void jump(){
        
    };
    
    public abstract void speak(); // we can use both default and abstruct method in an abstruct class
}
