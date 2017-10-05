/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_AnonymousInnerClasses;

/**
 *
 * @author J2EE-33
 */
public class AnnonymousInnerDemo {
    public static void main(String[] args) {
        B b = new B(){
            @Override
            public void displayMsg(){
                System.err.println("I'm method from class a but in class b");
            }
        };
        b.displayMsg();
    }
}
