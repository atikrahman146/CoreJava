/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author J2EE-33
 */
public class EmpSetterResult {
    public static void main(String[] args) {
        EmpSetter EmpB = new EmpSetter();
        EmpB.setId(1232383);
        EmpB.setName("Atik");
        EmpB.setDepartment("j2ee33");
        EmpB.setSalary(60000);
        
        System.out.println("Id: " + EmpB.getId());
        System.out.println("Name: " + EmpB.getName());
        System.out.println("Department: " + EmpB.getDepartment());
        System.out.println("Salary: " + EmpB.getSalary());
    }
}
