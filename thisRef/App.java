/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisRef;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        MyDate test = new MyDate(1, 1, 1111);
        
        System.out.println(test.addDays(5));
        System.out.println(test.toString());
    }
}
