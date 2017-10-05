/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

/**
 *
 * @author J2EE-33
 */
public class Subject {
    private String subject;
    private int marks;
    private String status;

    public Subject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public String getStatus() {
        if(getMarks()<70){
            status = "Fail";
        }else{
            status = "Pass";
        }
        return status;
    }
  
}
