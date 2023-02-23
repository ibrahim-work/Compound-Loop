
import java.util.Scanner;
public class compoundLoop {
    public static void main(String[] args) {
        System.out.println("This program receives an integer vector and checks if it has any element divisible by N and M.");
        System.out.println("Note that you should only enter numbers (do not use any letter or space) otherwise the execution will be terminated.");
        System.out.print("Enter an integer value for N: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.print("Enter an integer value for M: ");
        int M = input.nextInt();
        System.out.println("Please enter your vector elements (comma separated) below.");
        String str = input.next();


        long time_start = System.currentTimeMillis();
        String[] arrOfStr = str.split(",", 0);
        int index = 0;




            for (int i = 0; i < arrOfStr.length; i++) {
                int x = Integer.parseInt(arrOfStr[i]);
                if (x % N == 0 && x % M == 0) {
                    index = i;
                    break;
                }

            }
            long time_finish = System.currentTimeMillis();
            System.out.println("Element " + (index + 1) + " of the entered vector is divisible by both " + N + " and " + M);
            System.out.print("The entered vector was processed in " + (time_finish - time_start) + " milliseconds");



        }


    }









