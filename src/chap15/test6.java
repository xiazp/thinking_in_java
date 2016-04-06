package chap15;

import java.util.ArrayList;
import java.util.Random;

class RandomList<T>{
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	
	public void add(T item){
		storage.add(item);
	}
	
	public T selecte(){
		return storage.get(rand.nextInt(storage.size()));
	}
	
}

public class test6 {
		
	public static void main(String[] args){
		RandomList<Integer> rl = new RandomList<Integer>();
		
		for(String s: "1 12 33 2 3 4 5 6 ".split(" "))
			rl.add(Integer.valueOf(s));
		
		for(int i=0; i<10; i++)
			System.out.println(rl.selecte());
	}

}
