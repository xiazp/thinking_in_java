package chap15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class New{
	public static <K,V> Map<K,V> map(){
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
}

public class test11 {
	
	public static void main(String[] args){
		Map<String, List<String>> sls = New.map();
		List<String> ls = New.list();
		
		System.out.println( sls.getClass().getSimpleName());
		System.out.println( ls.getClass().getSimpleName());
		
	}
}
