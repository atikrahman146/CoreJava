/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep28_bycycle;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        ACMEBicycle test = new ACMEBicycle();
        
        test.changeCadence(5);
        test.changeGear(3);
        test.speedUp(4);
        test.applyBrakers(2);
        
        System.out.println(test.printStates());
    }
}
