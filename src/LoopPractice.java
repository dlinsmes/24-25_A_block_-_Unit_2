import java.util.Scanner;
public class LoopPractice {
    public static void main(String [] args) {
        //warm up
        //prompt the user to enter 5 numbers using a loop
        //output the largest number and the smallest number
        Scanner s = new Scanner (System.in);

        //these are the limits of what the int data type can hold
        //-don't need to memorize the values
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

//        System.out.println("int min is " + big);
//        System.out.println("int max is " + small);
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("enter a number");
//            int num = s.nextInt();
//
//            //when the newest number is larger than big, update
//            //big to be that new number
//            if (num > big) {
//                big = num;
//            }
//
//            if (num < small) {
//                small = num;
//            }
//        }
//
//        System.out.println("largest is " + big);
//        System.out.println("smallest is " + small);


        //if a number goes outside the range of Int min or max, the value
        //will behave unexpectedly and may possibly switch signs
        System.out.println(Integer.MAX_VALUE + 1);


        String word = "banana";

        //a string's length is how many chars it is
        System.out.println(word.length());

        //a substring is a part of a string that you specify with an index or indices
        //-an index is a position
        //-indexing starts at 0

        //since the first letter is at index 0, n is at index 2
        System.out.println(word.substring(2));

        //another version of substring accepts two indices: the starting and ending,
        //but the ending index is exclusive
        //na from banana
        System.out.println(word.substring(2, 4));

        //anana
        //the last index is the length - 1. length is 6, last index is 5
        System.out.println(word.substring(1, 6));
        System.out.println(word.substring(1, word.length()));
        System.out.println(word.substring(1));

        //b
        //when isolating just one char, use two consecutive indices
        System.out.println(word.substring(0,1));

        //output each char of word to its own line using a loop
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, i+1));
        }
        System.out.println();

        //a palindrome is a word that's spelled the same forward and backward
        word = "racecar";
        //use a loop to solve whether or not word is a palindrome

        boolean isPal = true;

        //int div is fine - if the length is odd, the single middle letter doesn't
        //get checked but it doesn't need to be checked
        for (int i = 0; i < word.length()/2; i++) {
            String leftLet = word.substring(i, i+1);

            String rightLet = word.substring(word.length()-1-i, word.length()-i);
            //System.out.println(rightLet);

            //when any two paired letters don't match, the whole word is
            //NOT a palindrome
            if (!leftLet.equals(rightLet)) {
                isPal = false;
            }
            //no else - once a word is proven not to be a palindrome, it cannot
            //then go back to being a palindrome

        }


        //same as isPal == true
        if (isPal) {
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }


    }
}
