package FundamentalsOfProgramming;

public class MinorleagueA {
    void leagueA(){
        int[] array = {1, 2, 3};
        int n = array.length;
        int i;
        int k;
        int j;
        int x;
        int stock = 0;
        for (i = 0 ; i < n; i++) {
            //System.out.println("i: " + i);
            for (j = 0; j < n; j++ ) {
                //System.out.println("j: " + j + " x: " + x);
                stock += (array[j] * array[i]) + array[j];
            }
        }
        System.out.println(stock);
    }
}
