package FundamentalsOfProgramming;

import java.util.Scanner;

public class Activity2C {
    void call(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int first_number = scan.nextInt();
        System.out.println("Enter a second number: ");
        int second_number = scan.nextInt();

        int sum_1 = 0;
        int sum_2 = 0;
        for(int i = 1; i <= first_number; i++){
            if(first_number % i == 0)
                sum_1 += i;
        }
        for(int i = 1; i <= second_number; i++){
            if(second_number % i == 0)
                sum_2 += i;
        }
        if(sum_1 == sum_2) {
            System.out.println("This is amicable pair!");
        }
        else
            System.out.println("This is not a amicable pair");


    }
}
