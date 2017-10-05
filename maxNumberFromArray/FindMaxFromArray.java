package maxNumberFromArray;

import java.util.Scanner;

public class FindMaxFromArray {

    public static void main(String[] args) {

        int num, maxNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        num = sc.nextInt();
        int b[] = new int[num];

        System.out.println("Enter elements of array: ");

        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
        }

        maxNum = b[0];
        for (int i = 0; i < num; i++) {
            if (maxNum < b[i]) {
                maxNum = b[i];
            }
        }
        System.out.println("Maximum valu: " + maxNum);

    }
}
