package chap11;

import java.util.*;



public class test9 {
	
	interface Selector{
		boolean end();
		Object current();
		void next();
	}

	class Sequence{
		private List<String> items = new ArrayList<String>();
		 
		public Sequence(){
			System.out.println("Sequence() ");
		}
		
		public void add(Object x){
			items.add((String)x);
		}
		
		private class SequenceSelector implements Selector{
			private int i = 0;
			public boolean end(){
				return i == items.size();
			}
			public Object current(){
				return items.get(i);
			}
			public void next(){
				if(i < items.size())
					i++;
			}
		}
		
		public Selector selector(){
			return new SequenceSelector();
		}
		
		public Iterator<String> iterator(){
			return items.iterator();
		}
	}

	
	public static void main(String[] args){
		test9 t = new test9();
		Sequence sq = t.new Sequence();
		//Selector sl = sq.selector();

		
		for(int i=0; i<10; i++)
			sq.add(Integer.toString(i));
		
		//while(!sl.end()){
		//	System.out.println(sl.current().toString());
		//	sl.next();
		//}
		
		Iterator<String> it = sq.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
	}
}
