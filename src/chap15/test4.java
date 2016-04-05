package chap15;

import java.lang.reflect.Array;

// "·ºÐÍ»¯sequence"
class Sequence<T>{
	private T[] item;
	private int next= 0;
	
	Sequence( int i){
		 item = (T[])new Object[i];
	}
	
	Sequence(Class<T> c, int i){
		//item = (T[])new Object[i];
       @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(c, i);
        this.item = a;
	}
	
	public void add(T x){
		if(next < item.length)
			item[next++]=x;
	}
	
	public T get(int i){
		if(i < item.length )
			return item[i];
		else
			return null;
	}
}

class Item{
	public String s = "null";
	
	public String toString(){
		return s;
	}
}


public class test4 {

	public static void main(String[] args){
		Sequence<Item> sq = new Sequence<Item>(10);
		
		for(int i=0; i < 5; i++){
			Item item = new Item();
			item.s = Integer.toString(i);
			sq.add(item);
		}
		
		for(int i=0; i < 5; i++){
			Item it = sq.get(i);
			System.out.println(it.toString());
		}	
	}
}
