/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_innerClass;

/**
 *
 * @author J2EE-33
 */
public class AnotherInner {

    int i = 5;

    void display() {
        class InnerClass {

            void ineerMethod() {
                System.out.println(i);
            }
        }
        InnerClass number = new InnerClass();
        number.ineerMethod();

    }

    public static void main(String[] args) {
        AnotherInner obj = new AnotherInner();
        obj.display();
    }
}
