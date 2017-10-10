/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct09_CreateFile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author J2EE-33
 */
public class FileCreation2 extends FileCreate{
    public static void main(String[] args) throws IOException {
            
        File newFile = new File("text-file.txt");
        File secondFile = new File("text-file.doc");

        
        boolean createFile = newFile.createNewFile();
        if(createFile || newFile.exists()){
            printFileDetails(newFile);
            printFileDetails(secondFile);
            
            boolean renameFile = newFile.renameTo(secondFile);
            if(!renameFile){
                System.out.println(newFile + "Could not rename.");
            }
            
            printFileDetails(newFile);
            printFileDetails(secondFile);
        }
        
    }
    public static void printFileDetails(File f) {
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Absolute path: " + f.exists());
    }
}
