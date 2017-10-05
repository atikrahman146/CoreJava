/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_collection_list;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        Person man1 = new Person(1, "Atik", Gender.MALE);
        Person man2 = new Person(2, "Ana", Gender.FEMALE);
        Person man3 = new Person(3, "Atik", Gender.MALE);
        Person man4 = new Person(4, "Atik", Gender.MALE);

        List<Person> personList = new ArrayList<>();
        personList.add(man1);
        personList.add(man2);
        personList.add(man3);
        personList.add(man4);

        System.out.println("List size: " + personList.size());
        
        for (Person man : personList) {
            if (man.getGender().equals(Gender.FEMALE)) {
                System.out.println("Female: " + man.getId() + " " + man.getName() + " " + man.getGender());
            }else{
                System.out.println("Male: " + man.getId() + " " + man.getName() + " " + man.getGender());
            }
        }
    }
}
