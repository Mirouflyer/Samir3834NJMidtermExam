package datastructure;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> tools = new LinkedList<>();
		tools.add("Screwdriver");
		tools.add("Hammer");
		tools.add("Wrench");
		tools.add("Meter");
		tools.add("Pliers");
		tools.add("brakes");
		tools.remove("brakes");







		for(String out: tools){
			System.out.println(out);
		}

		System.out.println();

		System.out.println(tools.peek());

		System.out.println();
        Iterator<String> itr = tools.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}

}
