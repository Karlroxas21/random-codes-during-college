package FundamentalsOfProgramming;

public class Activity1B {
    void call() {
        //Smallest number that can be divided
        int a = 2520;
        //Initialized a value
        int counter = 1;

        //Infinite loops is intentional
        //boolean (test)
        while (true) {

            if (a % counter == 0) {
                counter++; //Increment the value of counter
                if (counter == 20) {
                    System.out.println(a);//print the smallest positive number
                    break;
                } // break the run

            } else {
                a++;
                counter = 1;
            }
        }
    }
}

