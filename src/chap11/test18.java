package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class test18 {

	class Number{
		int num;
		String name;
		
		Number(String s){
			name = s;
		}
		
		public String toString(){
			return  name;
		}	
	}
	
	public static void main(String[] args){
		test18 t = new test18();
		Map<String, test18.Number> m = new HashMap<String, test18.Number>();
		
		m.put("1", t.new Number("one"));
		m.put("5", t.new Number("five"));
		m.put("4", t.new Number("four"));
		m.put("2", t.new Number("two"));
		m.put("3", t.new Number("three"));
		
		System.out.println("Numbers: " + m);
		System.out.println("Keys   : " + m.keySet());
		System.out.println("Values : " + m.values());
		
		Map<String, test18.Number> tm = new TreeMap<String, test18.Number>();
		Iterator<String> it = m.keySet().iterator();
		
		while(it.hasNext()){
			String k = it.next();
			Number n = m.get(k);
			tm.put(k, n);
		}
		System.out.println("Numbers: " + tm);
		//System.out.println("Keys   : " + tm.keySet());
		//System.out.println("Values : " + tm.values());
		
	}

}
