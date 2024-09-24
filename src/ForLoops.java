import java.util.Scanner;
public class ForLoops {

    public static void main(String [] args) {
        //warm up
        //keep asking the user to enter a number until they
        //enter a multiple of 7
        Scanner s = new Scanner(System.in);

//        System.out.println("enter a number");
//        int uNum = s.nextInt();
//        //run the loop when uNum is NOT a multiple
//        while ( uNum % 7  != 0 ) {
//            System.out.println("enter a number");
//            uNum = s.nextInt();
//        }
//        System.out.println(uNum + " is a multiple of 7");

        //while loop - condition-based - may or may not have a predetermined
        //quantity of iterations to run
        //for loop - iteration-based - you know (or the program knows) how many
        //times to run

        //initialization - int i = 0 - start a variable at a value
        //condition - i < 10 - loop will continue to run if the condition is true
        //advancement/increment = i++ - updates the looping variable so that the condition
        //will eventually become false to stop the loop
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //before an iteration (turn) of the loop, the condition is checked
        //to decide whether the looped code runs
        //the advancement step (i++) is applied after each iteration of the loop

        //9 is the last value output bc when i increments to 10, the condition
        //becomes false

        //i is only defined within the scope of the for loop
        //System.out.println(i);

        //-you can have multiple consecutive for loops that all use an i variable
        System.out.println();

        //advancement step add 2 every time, so 8 is the last i value within the loop
        for (int i = 0; i < 10; i+= 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //count down from 20 to 15
        //advancement step can subtract instead of add
        for (int i = 20; i > 14; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //for loops can be rewritten as while loops
        int x = 20;
        while (x > 14) {
            System.out.print(x + " ");
            x--;
        }

        //while loops can't necessarily always be written as for loops
        //-see warmup for example - you don't know how many times
        //the loop needs to run for
        System.out.println();

        //using a loop, ask the user for 3 numbers, then print
        //the sum of numbers

        //declare a sum variable before loop
//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("enter a number");
//            int num = s.nextInt();
//            sum = sum + num;
//            //same as sum += num
//        }
//        System.out.println("sum is " + sum);

        //ask the user for what num they want multiples of and how many
        //multiples to print
        //ex: 3 then 5
        //out: 3 6 9 12 15
//        System.out.println("what do you want multiples of?");
//        int mult = s.nextInt();
//        System.out.println("how many multiples?");
//        int quantity = s.nextInt();
//
//        //times to iterate depends on quantity
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(mult * (i+1));
//        }

        //prompt the user for a number
        //output whether the number is prime or not
        System.out.println("enter a number");
        int lauren = s.nextInt();
        //check whether the number is divisible by any number between
        //2 and lauren - 1
        //if it IS divisible by any of those numbers, NOT PRIME

        boolean isPrime = true;
        for (int i = 2; i < lauren; i++) {
            //check if divisible
            if (lauren % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println("not prime");
        else
            System.out.println("prime");



    }

}
