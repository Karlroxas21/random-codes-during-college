package FundamentalsOfProgramming;

public class MinorleagueC {
    static void whatArray(int[][] A) {

        int n = 0;
        int m = 0;
        for (n = 0; n < A.length; n++) {
            for (m = 0; m < A[n].length; m++) {
            }
        }
        System.out.println(n + " n");
        System.out.println(m + " m");
        if (m == n) {
            System.out.println("square");
        }
        if (m > n) {
            System.out.println("skinny");
        }
        if (m < n) {
            System.out.println("fat");
        }

    }

    void call() {
        int[][] A = {{1, 3, 21, 9}, {2, 8, 7}, {12, 12, 12, 1}};
        whatArray(A);
    }
}
