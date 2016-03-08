package chap7;

class A_t13{
	public void A(){
		System.out.println(" A() ");
	}
	
	public void A(int i){
		System.out.println(" A(int i) ");
	}
	
	public void A(String s){
		System.out.println(" A(String s) ");
	}
}

class B_t13 extends A_t13{
	public void  A(float f){
		System.out.println(" A(float f) ");	
	}
}


public class test13 {
	public static void main(String[] args){
		B_t13 t = new B_t13();
		
		t.A();
		t.A(1);
		t.A("sdf");
		t.A(0.1f);
	}
}
