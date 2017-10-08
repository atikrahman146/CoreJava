/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct07_TestThrows;

/**
 *
 * @author J2EE-33
 */
public class TestThrows {

    public static void main(String a[]) {
        try {
            TestThrows met = new TestThrows();
            System.out.println("Dhaka lebgth: " + met.getStringSize("Dhaka"));
            System.out.println("Dhaka lebgth: " + met.getStringSize(null));
            System.out.println("Dhaka lebgth: " + met.getStringSize("CTG"));
            System.out.println("Dhaka lebgth: " + met.getStringSize("Feni"));

        } catch (Exception ex) {
            System.out.println("Exception msg:" + ex.getMessage());
        }

    }

    public int getStringSize(String str) throws Exception {
        if (str == null) {
            throw new CustomException("String can not be nulled");
        }
        return str.length();
    }
}
