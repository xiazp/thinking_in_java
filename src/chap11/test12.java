package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class test12 {
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		ListIterator<Integer> it1 = l1.listIterator(l1.size());
		ListIterator<Integer> it2 = l2.listIterator();
		
		System.out.println("l1:" + l1);
		System.out.println("l2:" + l2);
		
		while(it1.hasPrevious()){
			it2.add(it1.previous());
		}
		
		System.out.println("l2:" + l2);
		
		
		
	}
}
