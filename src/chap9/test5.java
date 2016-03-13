package chap9;

import debug.chap9_t5;

public class test5 implements chap9_t5{
	public void f1(){
		System.out.println("f1() ");
	}
	
	public void f2(){
		System.out.println("f2() ");
	}
	
	public void f3(){
		System.out.println("f3() ");
	}
	
	public static void main(String[] args){
		test5 t = new test5();
		
		t.f1();
		t.f2();
		t.f3();
	}
}
