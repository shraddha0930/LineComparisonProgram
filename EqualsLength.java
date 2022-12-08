package day3Practiceproblem;

import java.util.Scanner;

public class EqualsLength {
    public static void main(String arg[]) {

        Long x1, x2, y1, y2;
        Long L1, L2;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1 point");

        x1 = sc.nextLong();

        System.out.println("enter y1 point");

        y1 = sc.nextLong();

        System.out.println("enter x2point");

        x2 = sc.nextLong();

        System.out.println("enter y2 point");

        y2 = sc.nextLong();

        L1 = x2 - x1;
        L2 = y2 - y1;

        if(L1.equals(L2))
            System.out.println("Both length are equal");
            else
            System.out.println("Both length are not equal");


    }
}
