package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test17 {
	
	class GerBil{
		int gerbilNumber;
		GerBil(int i){
			gerbilNumber = i;
		}
		public void hop(){
			System.out.println("hop "+ gerbilNumber);
		}
		
		public String toString(){
			return "GerBil" +Integer.toString(gerbilNumber);
		}
	}
	
	
	
	public static void main(String[] args){
		test17 t = new test17();
		
		Map<String, test17.GerBil> m=new HashMap<String, test17.GerBil>();
		
		m.put("g1", t.new GerBil(1));
		m.put("g2", t.new GerBil(2));
		m.put("g3", t.new GerBil(3));
		m.put("g4", t.new GerBil(4));
		
		System.out.println("GerBil: " + 	m);
		System.out.println("Keys  : " + 	m.keySet());
		System.out.println("Values: " +  	m.values());
		
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()){
			String name = it.next();
			GerBil g= m.get(name);
			System.out.println( " g: " + g);
			g.hop();
		}
		
	}

}
