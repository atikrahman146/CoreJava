/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct09_CreateFile;

import java.io.File;

/**
 *
 * @author J2EE-33
 */
public class FileCreate {

    public static void main(String[] args) throws Exception {
        File newFile = new File("text-file.txt");

        boolean checkFile = newFile.createNewFile();
        if (!checkFile) {
            System.out.println(checkFile + ", not created.");
        }
        newFile.delete();
        
        System.out.println("After deleting the new file");
        printFileDetails(newFile);
        
        System.out.println("Create file again");
        newFile.createNewFile();
        printFileDetails(newFile);
        
        System.out.println("tell JVM to delete on exit");
        newFile.deleteOnExit();
        printFileDetails(newFile);
    }

    public static void printFileDetails(File f) {
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Absolute path: " + f.exists());
    }
    
}
