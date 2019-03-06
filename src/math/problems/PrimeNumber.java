package math.problems;

import databases.ConnectToSqlDB;

import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int counter = 0;
		int upToNumber = 1000000;



		int[] primeArray = new int [counter];
		for (int i = 2; i < upToNumber; i++) {
			if (i == 2) {
				System.out.print(i+",");



				counter++;
			} else {
				if (isPrime(i)) {
					System.out.print(i+",");
					counter++;

				}
			}
		}
		System.out.println();
		System.out.println("Total prime numbers as of " + upToNumber + " is " + counter);




//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		connectToSqlDB.insertDataFromArrayToSqlTable(primeNumber,"PrimeNumber","Numbers");
//		try {
//			List<String> list = connectToSqlDB.readDataBase("PrimeNumber","Numbers");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


	}

	public static boolean isPrime(int n) {
		if (n % 2 == 0) return false;
		for (int i = 3; i * i <= n; i = i + 2) {
			if (n % i == 0) return false;
		}
		return true;
	}


}



