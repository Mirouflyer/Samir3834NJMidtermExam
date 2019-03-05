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



    }
}
