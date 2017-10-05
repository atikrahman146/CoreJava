/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep25_instanceof;

/**
 *
 * @author J2EE-33
 */
public class InstanceOf {
    
public static void main(String[] args) {
    System.out.println("Ref is employee and constructor is employee");
    Employee e = new Employee();
    doSomething(e);
    
    System.out.println("Ref is employee and constructor is Manager");
    Employee eMn = new Manager();
    doSomething(eMn);
    
    System.out.println("Ref is employee and constructor is engineer");
    Employee eEn = new Engineer();
    doSomething(eEn);
    
    System.out.println("Ref is Engineer and constructor is Engineer");
    Engineer eng = new Engineer();
    doSomething(eng);
    
    System.out.println("Ref is Manager and constructor is Manager");
    Manager m = new Manager();
    doSomething(m);
    
}

 public static void doSomething (Employee e){
    if(e instanceof Manager){
         System.out.println("Manager");
    }else if(e instanceof Engineer){
         System.out.println("Engineer");
    }else{
         System.out.println("Employee");
    }
 }   
}
