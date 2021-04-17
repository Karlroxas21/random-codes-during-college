package FundamentalsOfProgramming;

public class MajorleagueB {

    static void reduce(int[][] A, int [][] B) {

        //hindi ko sir makuha kung papaano gawin kapag for loop. kaya minano-mano ko nalang po.
        if(A[0][0] == A[1][0] && A[0][1] == A[1][1]){
            if (B[0][0] == B[1][0] && B[1][0] == B[2][0] && B[2][0] == B[3][0]
                    && B[0][1] == B[1][1] && B[1][1] == B[2][1] && B[2][1] == B[3][1]
                    && B[0][2] == B[1][2] && B[1][2] == B[2][2] && B[2][2] == B[3][2]
                    && B[0][3] == B[1][3] && B[1][3] == B[2][3] && B[2][3] == B[3][3]){
                System.out.println("Hooray");
            }
        }
        else{
        }
    }
    void call() {
        int[][] A = {{1, 2}, {1, 2}};
        int[][] B =  {{1, 1, 2, 2},
                {1, 1, 2, 2},
                {1, 1, 2, 2},
                {1, 1, 2, 2}};
        reduce(A, B);

    }
}
