package chap9;

abstract class t2{
	public void f(){
		System.out.println("t2.f()");
	}
}

class t2_sub extends t2{
	public void f(){
		System.out.println("t2_sub.f()");
	}
	public void f2(){
		System.out.println("t2_sub.f2()");
	}
}

public class test2 {
	public static void main(String[] args){
		//t2 t = new t2();
		t2_sub t = new t2_sub();
		t.f();
		
		
	}
}
