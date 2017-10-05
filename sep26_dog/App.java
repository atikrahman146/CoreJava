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
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("can bark", "can run");
        Dog dog = new Dog("is faithful", "can bark", "runs fast");
        Tommy tommy = new Tommy("is friend", "faithful", "can not bark", "runs fast");
        
        Animal a = new Tommy("is not a friend", "sometimes faithful", "can make sound", "runs slow");
        Dog b = new Tommy("is a friend", "sometimes faithful", "can make sound", "runs fast");

        Cat cat = new Cat("steal food", "doesn't bark", "runs silently");
        Cat mini = new Mini("doesn't steal food", "doesn't bark", "runs slowly");
        
        
        Dog dog1 = (Tommy) tommy;
        System.out.println("c0 " + dog1.getDetails());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Animal " + animal.getDetails());
        System.out.println("Dog " + dog.getDetails());
        System.out.println("Tommy " + tommy.getDetails());
        System.out.println("Ben " + a.getDetails());
        System.out.println("Max " + b.getDetails());
        
        System.out.println("Cat " + cat.getDetails());
        System.out.println("Mini " + mini.getDetails());
        
    }
}
