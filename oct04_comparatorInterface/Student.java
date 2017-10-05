/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct04_comparatorInterface;

/**
 *
 * @author J2EE-33
 */
public class Student {

    public String firstName, lastName;
    int studentID = 0;
    double GPA = 0.0;

    public Student(String firstName, String lastName, int studentID, double GPA) {

        if (firstName == null || lastName == null || studentID == 0 || GPA == 0.0) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGPA() {
        return GPA;
    }

}
