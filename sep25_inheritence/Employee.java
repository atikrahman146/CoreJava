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
public class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDetails() {
        return "From Employee {" + "name=" + name + ", salary=" + salary + '}';
    }
    
    
}
