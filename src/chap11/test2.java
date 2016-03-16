package chap11;

import java.util.*;

class simpleCollection{
	public static void main(String[] args){
		Collection<Integer> c = new ArrayList<Integer>();
		
		for(int i=0; i<5; i++){
			c.add(i); //auto boxing
		}
		
		for(Integer i: c){
			System.out.print(i +",");
		}
		
		System.out.println("");
		for(int i=4; i<6; i++){
			c.add(i); //auto boxing
		}
		
		for(Integer i: c){
			System.out.print(i +",");
		}
	}	
}

class simpleSet{
	public static void main(String[] args){
		Collection<Integer>  c = new HashSet<Integer>();
		
		for(int i=0; i<5; i++){
			c.add(i); //auto boxing
		}
		for(Integer i: c){
			System.out.print(i +",");
		}
		
		System.out.println("");
		for(int i=4; i<6; i++){
			c.add(i); //auto boxing
		}
		
		for(Integer i: c){
			System.out.print(i +",");
		}
		
	}	
}

public class test2 {
	public static void main(String[] args){
		System.out.println("\r\n-------simpleCollection------------");
		simpleCollection.main(args);
		System.out.println("\r\n-------simpleSet------------");
		simpleSet.main(args);
	}
}
