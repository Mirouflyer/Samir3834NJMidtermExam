package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

           *
          * *
         * * *
        * * * *
       * * * * *
      * * * * * *
     * * * * * * *
     * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *

         */


          int a = 10;
        for (int i = 0; i< a; i++) {


            for (int j = a-i; j>1; j-- ){
                System.out.print(" ");

            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
  }

