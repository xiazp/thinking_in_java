package chap10;

public class test8 {
	private int a = 1;
	public  int aa = 3;
	
	class t8{
		private int b = 2;
		public int c = 3;
		
		t8(){
			System.out.println("t8() a = " + a);
		}
	}
	
	public void f1(){
		System.out.println("a = " + a);
		//System.out.println("b = " + t8.this.b);
	//	System.out.println("c = " + t8.c);
	}
	
	
	public static void main(String[] args){
		test8 t = new test8();
		System.out.println("");
	}
}
