package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> car = new ArrayList<String>();
		car.add("BMW M3");
		car.add("FERRARI CALIFORNIA");
		car.add("MERCEDES SLR");
		car.add("BUGATTI VERON");
		car.add("MCLAREN MP12");


        //retrieving data using for each loop
		System.out.println("retrieving data using for each loop \n");
		for(String model :car){
			System.out.println(model);
		}
		System.out.println("\n");


		//retrieving data using while loop with iterator
		System.out.println("retrieving data using while loop with iterator\n");
       Iterator iter = car.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
