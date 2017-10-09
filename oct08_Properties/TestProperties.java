/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct08_Properties;

import java.util.Properties;

/**
 *
 * @author J2EE-33
 */
public class TestProperties {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        String pro = System.getProperty("java","IDB");

        System.out.println(pro);
    }

}
