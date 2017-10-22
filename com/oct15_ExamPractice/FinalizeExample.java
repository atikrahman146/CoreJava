/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

/**
 *
 * @author J2EE-33
 */
class FinalizeExample {

    @Override
    public void finalize() throws Throwable {
        try {
            System.out.println("finalize called");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample f1 = new FinalizeExample();
        FinalizeExample f2 = new FinalizeExample();
        f1 = null;
        f2 = null;
        System.gc();
    }
}
