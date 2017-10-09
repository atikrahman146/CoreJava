/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_createArray;

/**
 *
 * @author J2EE-33
 */
public class ArrayCreate {

    public static void main(String[] args) {
        //Array declaration
        int[] x = new int[2];
        int[] y = new int[2];
        int z[] = new int[2];
        int[] p = {1, 2, 3};

        //Array declaration another way
        args = new String[3];
        args[0] = "1";
        args[1] = "2";
        args[2] = "3";
        
        
        //Two dimentional array
        int[][] array2d = new int[2][3];
        array2d[0][0] = 1;
        array2d[0][1] = 3;
        array2d[0][2] = 5;

        array2d[1][0] = 2;
        array2d[1][1] = 6;
        array2d[1][2] = 9;

        //Two dimentional array different wat declaration
        int[][] array2d2 = {{1, 3, 5, 6}, {2, 6, 9, 3}, {1, 3, 5, 9}, {2, 6, 9}, {1, 3, 5}, {2, 6, 9}};

        //Three dimentional array
        int[][][] array3d = {
            {{1, 2}, {3, 4, 4, 2}, {5, 6}},
            {{1, 2, 3}, {3, 4}, {5, 6, 7}}
        };

        for (int[] array1D : array2d) {
            for (int item : array1D) {
                //System.out.print(" " + item);
            }
            //System.out.println(" ");
        }
        
        for (int[][] array2dFrom3d : array3d) {
            for (int[] array1DFrom3d : array2dFrom3d) {
                for (int itemFrom3d : array1DFrom3d) {
                    System.out.print(" " + itemFrom3d);
                }
                System.out.println(" ");
            }
        }
        
    }
}
