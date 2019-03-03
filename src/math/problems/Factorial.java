package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
     int n ,fact= 1;
     int factorialNumber = 5;

      for(n=1;n<=factorialNumber;n++){
          fact=fact*n;

      }
        System.out.println("The factorial of "+factorialNumber+" is "+fact);


    }
}
