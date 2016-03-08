package chap7;

public class test18 {
	public static final int INT_V1 = 100;
	public final int i = 1;
	
	test18(int a){
		this.i = a;
	}
	public static void main(String[] args){
		test18 t = new test18();
		
		System.out.println("INT_V1 = " + t.INT_V1);
		System.out.println("i = " + t.i);
	}
	
}
