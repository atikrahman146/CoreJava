/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct04_comparatorInterface;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator c = new NameComp();
        //Comparator d = new GradeComp();
        TreeSet studentSet = new TreeSet(c);
        
        studentSet.add(new Student("Atik", "Rahman", 101, 4.0));
        studentSet.add(new Student("Crik", "Rahman", 103, 3.0));
        studentSet.add(new Student("Bnik", "Rahman", 102, 4.3));
        studentSet.add(new Student("Dsif", "Rahman", 105, 4.1));
        studentSet.add(new Student("Graf", "Rahman", 104, 7.0));
        studentSet.add(new Student("Earif", "Rahman", 106, 4.9));
        
        Object[] studentArray = studentSet.toArray();
        Student s;
        
        for(Object obj : studentArray){
            s = (Student) obj;
            
            System.out.println(s.getFirstName() + " " +  
                    s.getLastName() + ", ID: " +  
                    s.getStudentID() + ", GPA: " +  s.getGPA());
        }
    }
}
