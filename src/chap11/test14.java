package chap11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class test14 {
	
	public static void main(String[] args){
		LinkedList<Integer> ld = new LinkedList<Integer>();
		
		
		for(int i=0; i<5; i++){
			ld.add(i);
		}
		System.out.println("ld:" + ld);
		
		ListIterator<Integer> it = ld.listIterator();
		while(it.hasNext()){
			it.add(8);
			it.next();
		}
		
		System.out.println("ld:" + ld);
	}

}

