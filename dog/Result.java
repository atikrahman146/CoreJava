/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author J2EE-33
 */
public class Result {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog max = new Dog("Max", "Black", "Hound", 500.00);
        
        System.out.println("Name: " + max.getName() + " Color: " + max.getColor() + " Race: " + max.getRace() + " Price:" + max.getPrice());
    }
    
}
