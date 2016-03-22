package chap11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test16 {
	public static void main(String[] args){
		Set<Character> set = new HashSet<Character>(
				Arrays.asList('a','o','e','i','u'));
		Set<String> world = new HashSet<String>();
		world.addAll(Arrays.asList("abc", "efg", "adsfsdfo", "123ECA", "23E"));
		
		Iterator<String> it = world.iterator();
		
		while(it.hasNext()){
			String s = it.next();
			int cnt = 0;
			for(int i =0; i< s.length(); i++){
				if( set.contains(Character.toLowerCase(s.charAt(i))) )
					cnt++;
			}
			System.out.println(s + ": " + cnt);
		}

	}

}
