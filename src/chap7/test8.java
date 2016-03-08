package chap7;

class chap7_8_A{
	chap7_8_A(int i){
		System.out.println("chap_7_8() " + i);
	}
	
	chap7_8_A(String s){
		System.out.println("chap_7_8() " + s);
	}
}

public class test8 extends chap7_8_A{
	test8(){
		super(4);
	}
	
	public static void main(String[] args){
		test8 t = new test8();
		System.out.println(t);
	}
}
