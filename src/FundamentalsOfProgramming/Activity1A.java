package FundamentalsOfProgramming;

public class Activity1A {
    void call(){
        int n = 15;
        int sum_of_the_square = (n * (n + 1) * (2 * n + 1) / 6);
        int square_of_the_sum = (int) Math.pow((n * (n + 1)) / 2, 2);
        //gauss formula

        int result = square_of_the_sum - sum_of_the_square;
        System.out.println("the difference between two is: " + result);
        System.out.println("sum of the squares: " + sum_of_the_square);
        System.out.println("square of the sum: " + square_of_the_sum);


// for loop
        int sum_square = 0;
        int square_sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum_square = sum_square + (int) Math.pow(i, 2);
        }
        for (int j = 1; j <= 10; j++) {
            square_sum = square_sum + j * (int) Math.pow(j, 2);
        }
        //System.out.println(sumAgain);
        int for_result = square_sum - sum_square;

        System.out.println(for_result);
        System.out.println("sum of square:" + sum_square);
        System.out.println("square sum:" + square_sum);
    }
}
