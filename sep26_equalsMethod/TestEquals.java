/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep26_equalsMethod;

import java.util.Date;

/**
 *
 * @author J2EE-33
 */
public class TestEquals {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(12,3,1976);
        MyDate date2 = new MyDate(12,3,1976);
        
        if(date1 == date2){
            System.out.println("Dates1 is identical to date2.");
        }else{
            System.out.println("Dates1 is not identical to date2.");
        }
        
        if(date1.equals(date2)){
             System.out.println("Both Dates are equal ");
        }else{
            System.out.println("Both Dates are not equal ");
        }
        
        System.out.println("set date2 = date1");
        date2 = date1;
        
        if(date1 == date2){
            System.out.println("Dates1 is identical to date2.");
        }else{
            System.out.println("Dates1 is not identical to date2.");
        }
        
        
        String p = "Hello";
        String q = new String(new char[]{'H','e','l','l','o'});
        
        
        String r = "He" + "llo";
        System.out.println(p==q);
        System.out.println(p==r);
        System.out.println(p.equals(q));
        
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.toString());
        
        String str = "100";
        int num = Integer.parseInt(str);
        String str2 = Integer.toString(num);
        
        System.out.println("Int: " + num + " Str: " + str2);
    }
}
