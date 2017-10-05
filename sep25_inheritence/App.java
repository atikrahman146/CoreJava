/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep25_inheritence;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Manager new_manager = new Manager("j2ee", "Atik", 10000);
        System.out.println(new_manager.getDetails());
        
        Employee new_empm = new Manager("Softwer", "Atik", 0);
        System.out.println(new_empm.getDetails());
        
        Employee new_emp = new Employee("Atik", 20000);
        System.out.println(new_emp.getDetails());
        
    }
}
