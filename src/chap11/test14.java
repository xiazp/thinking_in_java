package chap11;

import java.util.LinkedList;
import java.util.ListIterator;

public class test14 {
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ListIterator<Integer> it;
		
		for(int i=0; i<4; i++){
			ll.add(i, i);
		}
		System.out.println("ll: " + ll);
		
		
		it = ll.listIterator();
		while(it.hasNext() ){
			
			it.add(9);
			System.out.println("cur:" + it.next() );
			//it.next();
		}
		System.out.println("ll: " + ll);
		
		
		
	}
}
