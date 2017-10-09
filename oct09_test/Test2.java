/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct09_test;

/**
 *
 * @author J2EE-33
 */
class TestSuper {

    TestSuper(int i) {
    }
}

class TestSub extends TestSuper {

    public TestSub(int i) {
        super(i);
    }
}

class TestAll {

    public static void main(String[] args) {
        new TestSub(5);
    }
}
