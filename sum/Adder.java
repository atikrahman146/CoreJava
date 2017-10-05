/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author J2EE-33
 */
public class Adder extends Arithmatic{
    public static void main(String[] args) {
        Arithmatic total = new Arithmatic();
        System.out.println("Total sum: " + total.add(1, 10));
    }
}
