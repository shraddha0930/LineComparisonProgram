package day3Practiceproblem;

import java.util.Scanner;

public class CompareToLength {
    public static void main(String arg[]) {

        Integer x1, x2, y1, y2;
        Integer L1, L2;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1 point");

        x1 = sc.nextInt();

        System.out.println("enter y1 point");

        y1 = sc.nextInt();

        System.out.println("enter x2point");

        x2 = sc.nextInt();

        System.out.println("enter y2 point");

        y2 = sc.nextInt();

        L1 = x2 - x1;
        L2 = y2 - y1;

        System.out.println(L1.compareTo(L2));
    }
}
