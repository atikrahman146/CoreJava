/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_listClass_collection;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        Peoples p1 = new Peoples("Asa", 5000.0, Country.BANGLADESH);
        Peoples p2 = new Peoples("Imam", 15000.0, Country.BANGLADESH);
        Peoples p3 = new Peoples("Atik", 55000.0, Country.BANGLADESH);
        Peoples p4 = new Peoples("Max", 555000.0, Country.CANADA);
        Peoples p5 = new Peoples("Isabella", 500000.0, Country.UK);
        Peoples p6 = new Peoples("Allison", 9000.0, Country.USA);
        Peoples p7 = new Peoples("Ron", 51000.0, Country.AUSTRALIA);
        Peoples p8 = new Peoples("Todd", 50010.0, Country.UK);
        Peoples p9 = new Peoples("Joe", 2000.0, Country.AUSTRALIA);

        List<Peoples> peopleList = new ArrayList<>();

        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);
        peopleList.add(p6);
        peopleList.add(p7);
        peopleList.add(p8);
        peopleList.add(p9);

        System.out.println("Total people:" + peopleList.size());
        for (Peoples p : peopleList) {
            if (p.getCountry().equals(Country.USA) && p.getSalary() < 10000) {
                System.out.println("From USA and Salary under 10000: " + p.getName() + " " + p.getSalary() + " " + p.getCountry());
                
            } else if (p.getSalary().equals(5000.0)) {
                
                System.out.println("Salary equal 5000: " +  p.getName() + " " + p.getSalary() + " " + p.getCountry());
            }
        }
    }
}
