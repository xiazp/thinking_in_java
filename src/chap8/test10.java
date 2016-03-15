package chap8;

class t10{
	public void f1(){
		System.out.println("t10.f1() ");
		f2();
	}
	
	public void f2(){
		System.out.println("t10.f2()");
	}
}

class t101 extends t10{
	public void f2(){
		System.out.println("t101.f2()");
	}
}

public class test10 {
	public static void main(String[] args){
		t10 t = new t101();
		
		t.f1();
	}
	
}
