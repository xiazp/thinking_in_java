package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test5 {
	class ListFeatures{
		public void main(String[] args){
			
			List<Integer> li = new ArrayList<Integer>();
			li.addAll(Arrays.asList(5,4,3,2,1,9,1,2,3,4,4,11,12,14));
		
			
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
			System.out.println("8:" + li);
			
			li.add(3, 5);
			System.out.println("9:" + li);
			
			List<Integer> sub = li.subList(1, 4);
			System.out.println("sublist:" + sub);
			
			System.out.println("10:" + li.containsAll(sub));
			Collections.sort(sub);
			System.out.println("sort sublist:" + sub);
			
			System.out.println("11:" + li.containsAll(sub)); 
			
			// ???
			//Collections.shuffle(sub, rand);
			//System.out.println("shuffled subList:" + sub);
			//System.out.println("12:" + li.containsAll(sub));
			
			List<Integer> copy = new ArrayList<Integer>(li);
			System.out.println("copy:" + li);
			
			sub = Arrays.asList(li.get(1), li.get(3));
			System.out.println("sub:" + sub);
			
			copy.retainAll(sub);
			System.out.println("13:" + copy);
			
			copy = new ArrayList<Integer>(li);
			copy.remove(2);
			System.out.println("14:" + copy);
			
			copy.removeAll(sub);
			System.out.println("15:" + copy);
			
			copy.set(1, 9);
			System.out.println("16:"+copy);
			
			copy.addAll(2, sub);
			System.out.println("17:" + copy);
			
			System.out.println("18:" + copy.isEmpty());
			
			copy.clear();
			System.out.println("19:" + li);
			System.out.println("20:" + copy.isEmpty());
			
			Object[] o = li.toArray();
			System.out.println("22:" + o[2]);
			
			Integer[] pa = li.toArray(new Integer[0]);
			System.out.println("23:" + pa[2].intValue());
			
			
			
			
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
