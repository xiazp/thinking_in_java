package chap11;

import java.util.LinkedList;
import java.util.ListIterator;

public class test14 {
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ListIterator it;
		
		for(int i=0; i<6; i++){
			ll.add(i, i);
		}
		System.out.println("ll: " + ll);
		
		
		for(int i=0; i<3; i++){
			ll.add(i * 2, 8); 
		}
		System.out.println("ll: " + ll);
		
	}
}
