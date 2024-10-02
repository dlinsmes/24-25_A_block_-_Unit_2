public class NestedLoops {

    public static void main(String [] args) {

        //nested loops are when loops can go inside
        //other loops

        int count = 0;
        for (int i = 0; i < 5; i++) {

            //IMPORTANT - use a different loop variable
            //for the inner loop

            //when the inner loop runs 10 times, i stays the same
            //the inner loop needs to run to completion before i changes to its next value
            for (int j = 0; j < 10; j++) {

                count++;

                //50 print outputs from 10 * 5
                System.out.println(count + " - potato - i is " + i + ", j is " + j);
            }
        }


        System.out.println();

        //nested loops can be used to print 2d designs
        //outer loop controls how many horizontal rows
        for (int i = 0; i < 4; i++) {

            //inner loop controls how many elements per row
            for (int j = 0; j < 8; j++) {

                //use print() instead of println() to
                //keep everything on the same line
                System.out.print("x");
            }
            //use println() after the row is finished
            //to move to the next line
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {

            //since the inner loop is dependent on i, which is incrementing,
            //each row gets longer by one
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //aim for same resulting shape with a different outer loop
        for (int i = 10; i > 0; i--){
            for (int j=9; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//programming practice #6
//-quantity of x changes by 2 each row (odd numbers)
//-think about spacing on the left of each row


//     x
//   x x x
// x x x x x