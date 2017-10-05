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
public class EmpConstract {
    public static void main(String[] args) {
        
        Address AddA = new Address("E-66","Bajar Road","Savar","Dhaka");
        
        Location LocA = new Location("Dhaka",AddA);
        
        Department DeptA = new Department("Java", LocA);
        
        Employees empA = new Employees(1232383, "Atik", DeptA, 60000);
        
        System.out.println("Id: "              + empA.getId());
        System.out.println("Name: "            + empA.getName());
        System.out.println("Salary: "          + empA.getSalary());
        System.out.println("Department Name: " + empA.getDepartment().getDeptName());
        System.out.println("Location Name: "   + empA.getDepartment().getLocation().getLocname());
        System.out.println("House : "          + empA.getDepartment().getLocation().getAddress().getHouse());
        System.out.println("Road : "           + empA.getDepartment().getLocation().getAddress().getRoad());
        System.out.println("Thana : "          + empA.getDepartment().getLocation().getAddress().getThana());
        System.out.println("District : "       + empA.getDepartment().getLocation().getAddress().getDistrict());
                
    }
}
