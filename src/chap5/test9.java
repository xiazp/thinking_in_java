package chap5;

public class test9 {
	int i;
	String s;
	
	test9(){
		this(0, "0123");
		System.out.println("default contractor");
	}
	
	test9(int i, String s){
		this.i = i;
		this.s = s;
	}
	
	public static void main(String[] s){
		test9 t = new test9();
		System.out.println("i=" + t.i +" s = " + t.s);
	}
	
}
