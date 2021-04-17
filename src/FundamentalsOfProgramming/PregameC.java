package FundamentalsOfProgramming;

public class PregameC {
    void C() {
        int x = 0;
        int M = 10;
        int N = 11;

        System.out.println("Fibonacci sequence are series of: ");
        for (int i = 1; i <= 10; i++) {
            x = M;
            M = N;
            N = x + M;
            System.out.print(x + " ");
        }
    }
}
