import java.util.Scanner;

public class WhileLoops {

    public static void main (String [] args) {

        //variable scope - where you declare a variable
        //defines where it can be seen/used

        int a = 2;
        //a is declared in main, and it can be accessed
        //and changed anywhere after that point in main()
        if (a < 5) {
            a = 20;

            //b is declared in the if-statement
            //-it can only be used within the if-statement
            int b = 10;
            System.out.println(b);
        }
        System.out.println(a);

        //b does not exist outside of the if-statement
        //System.out.println(b);

        //a var can be declared without being initialized,
        //then have its value assigned later
        String word;
        if (a > 5) {
            word = "something";
        }
        else {
            word = "banana";
        }
        System.out.println(word);

        System.out.println();

        //loops allow code to be repeated
        //while loops are condition-based
        //-like repeating if-statements - run as long as
        //the condition is true

        int x = 0;
        //before each iteration (turn) of the looped code runs,
        //the condition is checked to see whether it's true
        while (x < 5) {
            System.out.println(x);

            //add one to existing value of x
            x++;
        }
        //last number printed is 4 bc when x is 4, it will print,
        //then add one to become 5, and at that point the condition
        //is no longer true

        System.out.println("x AFTER the loop is " + x);

        x = 0;
        while (x < 5) {
            //the entirety of the code block will run before
            //the condition is checked again
            x++;
            System.out.println(x);
            //5 will be printed bc when x is 4, one gets added and
            //it becomes 5, then the print statement will output 5
        }


        //infinite loop - BAD

        //infinite loops occur when the condition is always true
        //-x always has the same value of 0 and never gets updated
        //to eventually not be less than 5
//        x = 0;
//        while (x < 5) {
//            System.out.println(x);
        //IMPORTANT - include an update step to make sure the
        //variable used in the condition changes so that the condition
        //can eventually become false
//        }

        //while loops are good for when you don't know how many
        //times it needs to run, but limit the repetitions by some
        //other condition

        Scanner s = new Scanner(System.in);
        System.out.println("enter quit to stop or anything else " +
                "to keep going");
        String input = s.nextLine();

        //loop should continue as long as input IS NOT quit
        while(!input.equals("quit")) {
            System.out.println("enter quit to stop or anything else " +
                    "to keep going");
            input = s.nextLine();
        }

        System.out.println("you typed quit");

        System.out.println("enter 1, 2, or 3");
        int num = s.nextInt();

        //can be easier to express what's valid: 1, 2, 3 THEN negate the whole thing
        //       num < 1 || num > 3     equivalent to:
        //     !(num >= 1 && num <= 3)
        //      num != 1 && num != 2 && num != 3 equivalent to:
        while(!(num == 1 || num == 2 || num == 3)) {
            System.out.println("enter 1, 2, or 3");
            num = s.nextInt();
        }
        System.out.println("good job");

        s.nextLine();

        System.out.println("enter 'yes':");
        input = s.nextLine();
        while(!input.equals("yes")) {
            System.out.println("enter 'yes':");
            input = s.nextLine();
        }

        System.out.println("stupid way:");

        //BAD - do not do - I WILL DEDUCT!!!!!
        System.out.println("enter 'yes':");
        input = s.nextLine();
        while (true) {
            if (input.equals("yes")){
                break; //exit the loop
            }
            else {
                System.out.println("enter 'yes':");
                input = s.nextLine();
            }
        }

    }
}
