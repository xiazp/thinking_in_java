package chap9;

interface  interface1{
	void f1();
}


interface  interface2{
	void f2();
}

class t13 implements  interface1, interface2{
	public void f1(){
		System.out.println("t13.f1()");
	}
	
	public void f2(){
		System.out.println("t13.f2()");
	}
}

public class test13 {
	public static void main(String[] args){
		t13 t = new t13();
		
		t.f1();
		t.f2();
	}
}
