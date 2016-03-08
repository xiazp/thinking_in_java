package chap6;

public class test5_sub {
	public int a_pub;
	protected int a_pro;
	private int a_pri;
	int		 a_only;
	
	public void func_public(int i){
		System.out.println("public " + i);
	}
	
	protected void func_protected(int i){
		System.out.println("protected " + i);
	}
	
	private void func_private(int i){
		System.out.println("private " + i);
	}
}
