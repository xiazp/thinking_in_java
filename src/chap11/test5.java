package chap11;

import java.lang.reflect.Array;
import java.util.*;

import util.Print;

public class test5 {
	class ListFeatures{
		public void main(String[] args){
			
			List<Integer> li = new ArrayList();
			li.addAll(Arrays.asList(5,4,3,2,1));
		
			
			System.out.println("1: " +li);
			
			li.add(4);
			System.out.println("2: " +li);
			System.out.println("3: " +li.contains(9));
			
			li.remove(4);
			Integer i1 = li.get(2);
			System.out.println("4: " +i1 + " " + li.indexOf(i1));
			
			System.out.println("cur: " +li);
			Integer i2 = new Integer(3);
			System.out.println("5:" + li.indexOf(i2));
			System.out.println("6:" + li.remove(i2));
			
			System.out.println("7:" + li.remove(i1));
			
			
		}
	}
	
	public ListFeatures getListFeatures(){
		return new ListFeatures();
	}
	
	public static void main(String[] args){
		test5 t = new test5();
		ListFeatures l = t.getListFeatures();
		
		l.main(args);
	}
}
