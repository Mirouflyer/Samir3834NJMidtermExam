package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int next = 0;
         int previous = 1;
         for(int i= 0 ; i<40 ; i++){
             System.out.println(next);
             next =next+previous;
             previous=next-previous;
         }

    }
}
