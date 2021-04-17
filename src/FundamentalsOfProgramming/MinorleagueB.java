package FundamentalsOfProgramming;

public class MinorleagueB {
     static String isPalindromic(String A) {
        String enter_string = A;
        String stock_1 = "";
        for (int i = enter_string.length() - 1; i >= 0; i--) {
            stock_1 += enter_string.charAt(i);
        }

        return stock_1;
    }

        void call() {
            if (isPalindromic("mmaad").equals("daamm")) {
                System.out.print("mmaad: " );
                System.out.println("true");
            }

            if (isPalindromic("window").equals("window")) {
                System.out.print("window: ");
                System.out.println("true");
            } else {
                System.out.print("window: ");
                System.out.println("false");
            }


        }

    }

