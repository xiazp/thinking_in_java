package chap7;

class t23{
	static int i = printInit("static i");
	private static int j = printInit("j");
	t23(int a){
		System.out.println("t23() " + a);
		j = a;
	}
	
	static int printInit(String s){
		System.out.println(s);
		return 1;
	}
}


public class test23 {
	public static void main(String[] args ){

		System.out.println("test case:");
		System.out.println(t23.i);
		
	}
}
