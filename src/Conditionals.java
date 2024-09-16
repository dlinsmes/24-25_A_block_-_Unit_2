import java.util.Scanner;

public class Conditionals {
    public static void main(String [] args) {

        //simulate flipping a coin and print the result of heads or tails

        //use a random number [1, 2]
        //1 is heads
        //2 is tails

        int r = (int)(Math.random()* 2) + 1;

        //a boolean expression is treated as a condition
        //-when the condition is true, the code in the if-statement
        //will run
        if (r == 1) {
            System.out.println("heads");
        }
        //when the condition for the IF is false, the code in ELSE runs
        else {
            System.out.println("tails");
        }

        //else is optional - if you don't have an ELSE clause,
        //no alternate code will run when the condition isn't true

        //s is just a variable name - use what you want
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 numbers:");

        //user enters 3 ints, program outputs the largest one
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }

        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //these if statements both run independently, so even when a is
        //the largest, the following if/else will always run
        if (b > a && b > c) {
            max = b;
        }
        //this doesn't work as intended bc ELSE will only attach itself
        //to the immediate previous IF
        else {
            max = c;
        }
        System.out.println("max is " + max);


        //when the line of code in an if/else clause is only one line
        //you don't need { }
        if (a > b && a > c)
            max = a;

        //else if allows you to add multiple condition branches to check
        //and run code

        //only the first of any if/else-ifs that's true will run, no others
        //after the first true condition will check or run
        else if (b > a && b > c)
            max = b;
        else
            max = c;

        System.out.println("max is " + max);


        //switching from num input to string input, Scanner will
        // skip the first nextLine()
        s.nextLine();

        String realPW = "*****";
        System.out.println("enter your password: ");
        String userPW = s.nextLine();

        //use .equals() for Strings
        if(userPW.equals(realPW)) {
            System.out.println("wow good job i'm so proud of you A++++++");
        }
        //user put in nothing bc the length (how many characters) is zero
        else if (userPW.length() == 0) {
            System.out.println("you didn't enter anything you dumdum");
        }
        //user's pw is the same length as the real pw
        //-when the password is correct, the first condition is true, and no
        //other else-ifs or ELSE will check or run
        else if (userPW.length() == realPW.length()) {
            System.out.println("nice try but you're wrong, dummy");
        }
        //you can't put any code between conditional branches
        //int x = 2;
        else {
            System.out.println("WRONG!!!!!!!!!!!???!?!?!?1112");
        }

        //get a number and check if it's between 10 and 20, or too low, or too high
        System.out.println("enter a number between 10 and 20");
        int uNum = s.nextInt();

        if (uNum > 10) {

            //if statements can be nested in other if-statements
            if (uNum < 20) {
                System.out.println("good job");
            }
            //> 10 is true, but < 20 is not
            else {
                System.out.println("too big");
            }
        }
        //be careful with where this goes and watch the { }
        //-needs to be outside and after uNum > 10
        else {
            System.out.println("too low");
        }



    }

}
