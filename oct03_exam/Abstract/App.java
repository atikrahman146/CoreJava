/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_exam.Abstract;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        AbstractResult test = new AbstractResult("Atik", 27, 5000);
        
        System.out.println("Name: " + test.getName() + " Age: " + test.getAge() + " Salary: " + test.getSalary()) ;
    }
}
