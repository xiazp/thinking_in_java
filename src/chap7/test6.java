package chap7;

class chap7_6_A{
	chap7_6_A(int i){
		System.out.println("chap7_6_A i=" +i);
	}
}

public class test6 extends chap7_6_A{
	test6(){
		//System.out.println("this is error");
		super(4);
	}
	
	public static void main(String[] args){
		test6 t = new test6();
		
		System.out.println(t);
	}
}
