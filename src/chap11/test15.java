package chap11;

import java.util.LinkedList;

class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T v){ 
		storage.addFirst(v);
	}
	
	public T peek(){
		return storage.getFirst();
	}
	
	public T pop(){
		return storage.removeFirst();
	}
	
	public boolean empty(){
		return storage.isEmpty();
	}
	
	public String toString(){
		return storage.toString();
	}
}

public class test15 {
	
	public static void main(String[] args){
		Stack<String>  st = new Stack<String>();
		
		st.push("U");
		st.push("n");
		st.push("c");
		st.pop();
		st.pop();
		st.pop();
		st.push("e");
		st.push("r");
		st.push("t");
		st.pop();
		st.pop();
		st.pop();
		st.push("a");
		st.pop();
		st.push("i");
		st.pop();
		st.push("n");
		st.push("t");
		st.push("y");
		st.pop();
		st.pop();
		st.pop();
		st.push("-");
		st.push("r");
		st.push("u");
		st.pop();
		st.pop();
		st.push("l");
		st.push("e");
		st.push("s");
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println("st: " + st);
		
	
	}
}
