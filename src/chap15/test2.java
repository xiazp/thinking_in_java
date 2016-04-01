package chap15;

import java.util.ArrayList;
import java.util.Arrays;

class Holder<T>{
	private T a;
	public Holder(T a){
		this.a  = a;
	}
	
	public T get(){
		return a;
	}
	
	public void set(T a){
		this.a = a;
	}
	
}

public class test2 {
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a", "b", "c"));
		Holder<ArrayList<String>> h = new Holder<ArrayList<String>>(a);
		
		ArrayList<String> b = h.get();
		
		System.out.println(b.get(1) + b.get(2) + b.get(0));
		
	}

}
