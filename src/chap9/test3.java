package chap9;

abstract class sup{
	abstract void print();
	
	sup(){
		print();
	}
}

class sub extends sup{
	private int i = 2;
	void print(){
		System.out.println("sub.i= " + i);
	}
}

public class test3 {
	public static void main(String[] args){
		sub s = new sub();
		s.print();
	}
}
