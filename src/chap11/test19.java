package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class test19 {

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
		test19 t = new test19();
		Map<String, test19.Number> m = new HashMap<String, test19.Number>();
		
		m.put("1", t.new Number("one"));
		m.put("5", t.new Number("five"));
		m.put("4", t.new Number("four"));
		m.put("2", t.new Number("two"));
		m.put("3", t.new Number("three"));
		
		System.out.println("1 Numbers: " + m);
		System.out.println("Keys     : " + m.keySet());
		System.out.println("Values   : " + m.values());
		
		Map<String, test19.Number> tm = 
				new LinkedHashMap<String, test19.Number>();
		Iterator<String> it = m.keySet().iterator();
		
		while(it.hasNext()){
			String k = it.next();
			Number n = m.get(k);
			tm.put(k, n);
		}
		System.out.println("2 Numbers: " + tm);
		//System.out.println("Keys   : " + tm.keySet());
		//System.out.println("Values : " + tm.values());
	}

}
