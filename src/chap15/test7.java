package chap15;

import java.util.Iterator;
import java.lang.UnsupportedOperationException;

interface Generator<T> { T next(); }



class Fibonacci implements Generator<Integer>{
	private int count;
	private int allcnt;
	IteratorInFb   it = new IteratorInFb();
	
	public Fibonacci(){}
	
	public Fibonacci(int cnt){
		allcnt = cnt;
	}
	
	public Integer next(){
		return fib(count++);
	}
	
	private Integer fib(int cnt){
		if(cnt < 2)
			return 1;
		else 
			return fib(cnt-2) + fib(cnt-1);
	}
	
	public IteratorInFb getIterator(){
		return it;
	}
	
	class IteratorInFb implements Iterator<Integer>{
		public boolean hasNext(){
			return allcnt > 0;
		}
		
		public Integer next(){
			allcnt--;
			return Fibonacci.this.next();
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	
}

class IterableFibonacci extends Fibonacci 
	implements Iterable<Integer>{
	
	private int n;
	public IterableFibonacci(int count){
		n = count;
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public boolean hasNext(){
				return n > 0;
			}
			
			public Integer next(){
				n--;
				return IterableFibonacci.this.next();
			}
			
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
}

public class test7 {
		
	public static void main(String[] args){
		Fibonacci fb = new Fibonacci();
		
		System.out.println("1");
		for(int i=0; i < 5; i++){
			System.out.print(fb.next() + " ");
		}
		
		System.out.println("\r\n2");
		for(int i: new IterableFibonacci(18)){
			System.out.print(i + " ");
		}

		System.out.println("\r\n3");
		fb  = new Fibonacci(5);
		Iterator<Integer> it = fb.getIterator();
		while(it.hasNext()){
			int i = it.next();
			System.out.print(i + " ");
		}
	}

}
