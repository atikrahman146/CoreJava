/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author J2EE-33
 */
public class UserResult {
    
    
    public static void main(String[] args) {
        User robin = new User(1232383, "Robin", "Bangladesh", "robin@gmail.com");
        
        System.out.println("User ID: " + robin.getName() + " Name: " + robin.getName() + " Country: " + robin.getCountry() + " Email: " + robin.getEmail());
    }
}
