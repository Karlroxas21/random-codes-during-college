package FundamentalsOfProgramming;

public class MinorleagueD {
    static boolean threeIndices(int X[], int arr_size, int sum) {

        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; j++) {
                    if (X[i] + X[j] + X[k] == sum) {
                        System.out.println(i + " , " + j + " , " + k + "");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    void call(){
        int X[] = {10, 20, 10, 40, 50, 60, 70};
        int sum_1 = 40;
        int sum_2 = 80;
        int arr_size = X.length;

        threeIndices(X, arr_size, sum_1);
        threeIndices(X, arr_size, sum_2);
    }
}
