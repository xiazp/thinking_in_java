package chap5;

public class test8 {
	
	void func1(){
		func2();
		this.func2();
	}
	
	void func2(){
		System.out.println("func2");
	}
	
	public static void main(String[] s){
		test8 t = new test8();
		t.func1();
	}

}
