package chap5;

public class test2 {
	String s1 = "12345";
	String s2;
	
	test2(String s){
		s2 = s;
	}
	
	public static void main(String[] args){
		test2 t = new test2("sdf");
		
		System.out.println("s1 is " + t.s1);
		System.out.println("s2 is " + t.s2);
	}
}
