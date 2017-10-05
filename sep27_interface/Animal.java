/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep27_interface;

/**
 *
 * @author J2EE-33
 */
public interface Animal {
    //All methods in interface are abstract method. they don't have body

    public abstract void eat(); //we don't need to write abstract as it's already abstract. public is also optional

    void drink();

    void run();

    void walk();

    void sleep();

    void bite();

}
