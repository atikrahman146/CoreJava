/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct08_IO_NodeStreams;

import java.io.*;

/**
 *
 * @author J2EE-33
 */
public class TestNodeStreams {

    public static void main(String[] args) {
        try {
            FileReader input = new FileReader(args[0]);

            try {
                FileWriter output = new FileWriter(args[1]);

                try {
                    char[] buffer = new char[128];
                    int charsRead;

                    charsRead = input.read(buffer);

                    while (charsRead != -1) {
                        output.write(buffer, 0, charsRead);

                        charsRead = input.read(buffer);
                    }
                } finally {
                    output.close();
                }
            } finally {
                input.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
