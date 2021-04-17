package FundamentalsOfProgramming;

public class Activity2A {
    void call() {
        long y = 0;
        for(long i = 2; i < 2000000; i++){
            if(isPrime(i)){
                y += i;
            }
        }
        System.out.println(y);
    }

    private static boolean isPrime(long n) {
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
