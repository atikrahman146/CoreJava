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
public abstract class AbstractInherit {
    String name;
    int age;

    public AbstractInherit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}
