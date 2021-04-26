package BookRentalSystem;

import java.util.Scanner;

public class books {
    Scanner scan = new Scanner(System.in);
    String toDisplay = """
            ELECTRONIC BOOK RENTAL SYSTEM
            *****************************
            0 System Analysis and Design, Gary B. Shelly
            1 Android Application, Corine Hoisington
            2 Programming Concepts and Logic Formulation, Rasauro E. Manuel
            *****************************
            CHOSSE A NUMBER TO RENT YOUR FAVORITE BOOK:
            """;
    String[] indexofBooks = {"System Analysis and Design", "Android Application", "Programming Concepts and Logic Formulation"};
    boolean isValid = true;
    int copies_0;
    int copies_1;
    int copies_2;
    boolean temp = true;
    String yes_no = "";
    String rent = "RENT AGAIN? Y/N";
    books(){
        while(isValid){
            System.out.print(toDisplay);
            int option = scan.nextInt();
            if(option > 2){
                try {
                    System.out.println(indexofBooks[option]);
                    System.out.println(rent);
                    yes_no = scan.next();
                }catch(Exception e){
                    scan.close();
                    System.out.println("INDEX DOES NOT EXIST. Try Again!");
                }
                isValid = false;
            }
            if (option == 0) {
                if (copies_0 < 2) {
                    copies_0 += 1;
                    System.out.println("You Rented " + indexofBooks[0]);
                    System.out.println(rent);
                    yes_no = scan.next();
                } else {
                    System.out.println("NO COPIES AVAILABLE");
                    System.out.println(rent);
                    yes_no = scan.next();
                }
            }
            if (option == 1) {
                if (copies_1 < 3) {
                    copies_1 += 1;
                    System.out.println("You Rented " + indexofBooks[1]);
                    System.out.println(rent);
                    yes_no = scan.next();
                } else {
                    System.out.println("NO COPIES AVAILABLE");
                    System.out.println(rent);
                    yes_no = scan.next();
                }
            }
            if (option == 2) {
                if (copies_2 < 4) {
                    copies_2 += 1;
                    System.out.println("You Rented " + indexofBooks[2]);
                    System.out.println(rent);
                    yes_no = scan.next();
                } else {
                    System.out.println("NO COPIES AVAILABLE");
                    System.out.println(rent);
                    yes_no = scan.next();
                }
            }
//            System.out.println(rent);
//              yes_no = scan.next();
            if (yes_no.equals("N")) {
                isValid = false;
                System.out.println("PROGRAM ENDS");
            }
        }
    }
}