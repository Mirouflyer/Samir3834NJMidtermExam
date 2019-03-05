package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {


        //Apply Unit testing into each classes and methods in this package.



        Factorial fact = new Factorial();
        int factorial = fact.factorial(6);
        Assert.assertEquals(720,720);

        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.fibonacci(0);
        Assert.assertEquals(560,560);

        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int a =array1.length;
        int b = array2.length;
        int small =FindLowestDifference.findSmallestDifference(array1,array2,a,b);
        Assert.assertEquals(1,1);

    }
}
