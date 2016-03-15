package chap10;

 

public class test7 {
	private int i = 0;
	
	private void f(){
		System.out.println("test7.f() " +i);
	}
	
	class t7{
		public void f2(int x){
			i = x;
			System.out.println("t7.f2() " + x);
		}
	}
	
	
	public static void main(String[] args){
		test7 t = new test7();
		t7  tt = t.new t7();
		t.f();
		tt.f2(4);
	}
}
