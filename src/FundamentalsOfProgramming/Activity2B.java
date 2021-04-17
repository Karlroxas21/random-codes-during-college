package FundamentalsOfProgramming;

import java.util.Scanner;

public class Activity2B {
    void call() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value of n: ");
        double n = in.nextDouble();
        int valueOf = (int) Math.pow(2, n);
        int sum = 0;

        while (valueOf > 0) {
            sum = sum + valueOf % 10;
            valueOf = valueOf / 10;
        }
        System.out.println("last sum: " + sum);
    }
}

