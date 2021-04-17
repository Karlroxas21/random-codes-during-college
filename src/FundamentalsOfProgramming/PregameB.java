package FundamentalsOfProgramming;

public class PregameB {
    void B() {
        int sum = 0;
        int counter = 0;
        while (counter < 1000) {
            if (counter % 3 == 0 || counter % 5 == 0) {
                if (counter % 6 == 0) {
                } else {
                    System.out.println("c" + counter);
                    sum = sum + counter;
                }
            }
            counter++;
        }
        System.out.println("sum:" + sum);
    }
}

