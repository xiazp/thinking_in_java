package chap15;

class LinkedStack<T> {
	private  class Node{
		T item;
		Node next;
		
		//constructor
		Node(){
			item = null; 
			next = null;
		}
	
		//constructor
		Node(T item, Node next){
			this.item = item;
			this.next = next;
		}
		
		//stack is null
		boolean end(){
			return item == null && next == null;
		}
	}
	
	private Node top = new Node();
	
	public void push(T item){
		top = new Node(item, top);
	}
	
	public T pop(){
		T result = top.item;
		if(!top.end())
			top = top.next;
		return result;
	}
	
}

public class test5 {
		
	public static void main(String[] args){
		LinkedStack<String> ls = new LinkedStack<String>();
		
		for(String s: "12 23 34 23 34 34".split(" ")){
			ls.push(s);
		}
		
		String el;
		while( ( el= ls.pop()) != null ){
			System.out.println(el);
		}
		
	}

}
