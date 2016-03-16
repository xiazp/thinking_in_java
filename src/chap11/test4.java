package chap11;

import java.util.*;

class ElemGenerator{
	private int i = 0;
	List<String> l = new ArrayList<String>();
	
	ElemGenerator(Collection<String> c){
		 l.addAll(c);
	}
	
	public String next(){
		if(i >= l.size())
			i = 0;
		return l.get(i++);
	}
	
}

public class test4 {
	public static void main(String[] args){
		ElemGenerator eg = new ElemGenerator(Arrays.asList("a4", "a3", "a2", "a1"));
		
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<10; i++)
			al.add( eg.next());
		System.out.println(al);
		
		LinkedList<String> ll = new LinkedList<String>();
		for(int i=0; i<10; i++)
			ll.add( eg.next());
		System.out.println(ll);
		
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<10; i++)
			hs.add( eg.next());
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		for(int i=0; i<10; i++)
			lhs.add( eg.next());
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0; i<10; i++)
			ts.add( eg.next());
		System.out.println(ts);

	}
	
}
