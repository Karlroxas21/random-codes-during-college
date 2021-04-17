package FundamentalsOfProgramming;

import java.util.Scanner;

public class PregameA {
    void A() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value for q: ");
        int q = scan.nextInt();
        System.out.println("enter a value for s: ");
        int s = scan.nextInt();
        double solve_1 = (9 * (Math.pow(q, 9 / 3) / 3 * (Math.pow(q, 3))));
        double solve_2 = (3 + (4 * (Math.pow(s, -8 / 2) / 4) + 2));
        double solve_3 = (Math.pow(2, 6 / 2) / 8);
        double result_V = solve_1 / solve_2 * solve_3;
        System.out.println("V = " + result_V);
    }
}
