/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct04_comparableInterface;

import java.util.TreeSet;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {

        //Student st = new Student("Atik", "Rahman", 1, 2.5);
        //Student st1 = new Student("Atik", "Rahman", 1, 5.5);
        //System.out.println(st.compareTo(st1));
        TreeSet studentSet = new TreeSet();
        studentSet.add(new Student("Atik", "Rahman", 1, 2.5));
        studentSet.add(new Student("Allison", "Rahman", 1, 48.5));
        studentSet.add(new Student("Xoxo", "Rahman", 1, 3.5));
        studentSet.add(new Student("Max", "Rahman", 1, 4.5));
        studentSet.add(new Student("Ethan", "Rahman", 1, 7.5));

        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;

            System.out.println(s.getFirstName() + " " +  
                    s.getLastName() + ", ID: " +  
                    s.getStudentID() + ", GPA: " +  
                    s.getGPA()
            );
            
        }

    }
}
