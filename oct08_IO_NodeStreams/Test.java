/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct08_IO_NodeStreams;

/**
 *
 * @author J2EE-33
 */
public class Test {
    public static void main(String[] args) {
        class Foo{
            public int i = 3;
            float f[] = new float[]{2.3f , 3.3f};
        }
        Object o = (Object) new Foo();
        Foo foo = (Foo) o;
        System.out.println(foo.i);
    }
}
