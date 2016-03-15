package chap10;

public class test13 {
	private int i = 0;
	
	private void f(){
		System.out.println("test13.f() " +i);
	}
	

	
	test13 getInner(){
		return new test13(){
			public void f2(int x){
				i = x;
				System.out.println("t13.f2() " + x);
			}
		};
	}

	
	
	public static void main(String[] args){
		test13 t = new test13();
		t.f();
		test13 xx = t.getInner();
		xx.f();
	}
}
