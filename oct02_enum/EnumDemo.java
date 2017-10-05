/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_enum;

/**
 *
 * @author J2EE-33
 */
public class EnumDemo {
    public static void main(String[] args) {
        Person p = new Person("Atik", 27, Gender.MALE);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getGender());
    }
}
