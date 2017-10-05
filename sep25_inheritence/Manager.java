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
public class Manager extends Employee{
    public String departmentName;

    public Manager(String departmentName, String name, int salary) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    //Override
    @Override
    public String getDetails() {
        return "From Manager{" + "name=" + name + ", salary=" + salary + ", departmentName=" + departmentName + '}';
    }
    
}
