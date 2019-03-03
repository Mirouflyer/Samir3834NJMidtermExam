package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

         FileReader fileReader = null;
		 BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(textFile);
            bufferedReader = new BufferedReader(fileReader);
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("check your path");
		}

		String st ="";
		List<String> linkedList = new LinkedList<String>();
		Stack<String> dataStack = new Stack();
		try{
			while((st = bufferedReader.readLine())!= null){
				linkedList.add(st);
				dataStack.add(st);
				System.out.println(st);
			}

		}catch (IOException ex){
			ex.printStackTrace();
			System.out.println("please check your path");
		}finally {
			if(fileReader!=null){
				fileReader =null;
			}
			if(bufferedReader != null){
				bufferedReader =null;
			}
		}

		System.out.println(dataStack.peek());
		System.out.println(dataStack.pop());
		System.out.println(dataStack.size());
		for(String data:linkedList){
			System.out.println(data);
		}
		Iterator iter = dataStack.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}


	}

}
