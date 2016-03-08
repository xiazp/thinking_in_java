package chap6;

public class test5 {
	public static void main(String[] args){
		test5_sub t = new test5_sub();
		
		//t.func_private(1);
		t.func_protected(2);
		t.func_public(3);
		
		//System.out.println("private    " + t.a_pri);
		System.out.println("package   " +t.a_only);
		System.out.println("protected " +t.a_pro);
		System.out.println("public    " + t.a_pub);
	}
}
