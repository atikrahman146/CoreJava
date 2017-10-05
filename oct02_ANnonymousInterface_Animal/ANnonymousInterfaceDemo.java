
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_ANnonymousInterface_Animal;

/**
 *
 * @author J2EE-33
 */
public class ANnonymousInterfaceDemo {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void bite() {
                System.out.println("Animal can bite");
            }

            @Override
            public void run() {
                System.out.println("Animal can run");
            }
        };
        a.bite();
        a.run();
    }
}
