package chap5;

public class test10 {
	private int i;
	
	test10(){
	}
	
	test10(int i){
		this.i = i;
	}
	
	protected void finalize(){
	
		System.out.println("finalize i is " + i);
	
	}
	
	public static void main(String[] args){
		test10 t = new test10();
		
		new test10(5);
		
		System.out.println("i is " + t.i);
		
		System.gc();
	}
}
