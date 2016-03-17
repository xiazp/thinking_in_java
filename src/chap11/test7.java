package chap11;

import java.util.ArrayList;
import java.util.List;

public class test7 {
	
	class t7{
		private int i = 0;
		
		t7(int i){
			this.i = i;
		}
		
		public void f(){
			System.out.println("f() " + i);
		}
		
		public String toString(){
			return Integer.toString(i);
		}
	}
	
	public t7 getSub(int i){
		return new t7(i);
	}
	
	public static void main(String[] args){
		test7 tm = new test7();
		List<t7> t = new ArrayList<t7>();
		
		for(int i=0; i<5; i++)
			t.add( tm.getSub(i) );
		
		System.out.println("t:" + t);
		
		List<t7> sub = t.subList(1, 3);
		System.out.println("sub:" + sub);
		
	}
}
