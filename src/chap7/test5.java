package chap7;


class A{
	A(int i){
		System.out.println(" A() " + i);
	}
}

class B{
	B(int i){
		System.out.println(" B() " + i);
	}
}

class C extends A{
	B b;
	
	C(){
		super(1);
		b = new B(1);
	
	}
}

public class test5 {
	public static void main(String[] args){
		C c = new C();
		System.out.println(c);
	}
}
