/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct07_iterator;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class Iteratorss {
    public static void main(String[] args) {

        List<Student> listS = new ArrayList<>();
        listS.add(new Student("Atik",15));
        listS.add(new Student("Asik",55));
        listS.add(new Student("Atif",43));
        
        Iterator<Student> elements = listS.iterator();
        
        //for (Iterator<Student> it = listS.iterator(); it.hasNext();) {
            //System.out.println(it.next().getName());
            //System.out.println(it.next().getNumber());
        //}
        
        while(elements.hasNext()){
            System.out.println(elements.next().getName());
            //System.out.println(elements.next().getNumber());
        }
    }
}
