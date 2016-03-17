package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class test6{
	class ListFeatures{
		public void main(String[] args){
			
			List<String> li = new ArrayList<String>();
			
			for(int i =0; i<6; i++){
				
				li.add("e"+Integer.toString(i));
			}
		
			
			System.out.println("1: " +li);
			
			li.add("e4");
			System.out.println("2: " +li);
			System.out.println("3: " +li.contains(9));
			
			li.remove("e4");
			String s1 = li.get(2);
			System.out.println("4: " +s1 + " " + li.indexOf(s1));
			
			System.out.println("cur: " +li);
			String s2 = "e3";
			System.out.println("5:" + li.indexOf(s2));
			System.out.println("6:" + li.remove(s2));
			
			System.out.println("7:" + li.remove(s1));
			System.out.println("8:" + li);
			
			li.add(3, "e5");
			System.out.println("9:" + li);
			
			List<String> sub = li.subList(1, 4);
			System.out.println("sublist:" + sub);
			
			System.out.println("10:" + li.containsAll(sub));
			Collections.sort(sub);
			System.out.println("sort sublist:" + sub);
			
			System.out.println("11:" + li.containsAll(sub)); 
			
			// ???
			//Collections.shuffle(sub, rand);
			//System.out.println("shuffled subList:" + sub);
			//System.out.println("12:" + li.containsAll(sub));
			
			List<String> copy = new ArrayList<String>(li);
			System.out.println("copy:" + li);
			
			sub = Arrays.asList(li.get(1), li.get(3));
			System.out.println("sub:" + sub);
			
			copy.retainAll(sub);
			System.out.println("13:" + copy);
			
			copy = new ArrayList<String>(li);
			copy.remove(2);
			System.out.println("14:" + copy);
			
			copy.removeAll(sub);
			System.out.println("15:" + copy);
			
			copy.set(1, "elem9");
			System.out.println("16:"+copy);
			
			copy.addAll(2, sub);
			System.out.println("17:" + copy);
			
			System.out.println("18:" + copy.isEmpty());
			
			copy.clear();
			System.out.println("19:" + li);
			System.out.println("20:" + copy.isEmpty());
			
			Object[] o = li.toArray();
			System.out.println("22:" + o[2]);
			
			String[] pa = li.toArray(new String[0]);
			System.out.println("pa" + pa);
			System.out.println("23:" + pa[2].hashCode());
			
			
			
			
		}
	}
	
	public ListFeatures getListFeatures(){
		return new ListFeatures();
	}
	
	public static void main(String[] args){
		test6 t = new test6();
		ListFeatures l = t.getListFeatures();
		
		l.main(args);
	}
}
