package chap10;

interface t10 {
	void f1();
}

public class test10 {
	
	t10 f2(){
		class ta implements t10{
			public void f1(){
				System.out.println("ta.f1() ");
			}
		}
		return new ta();
	}
	
	public static void main(String[] args){
		test10 t = new test10();
		t10 t2 = t.f2();	
		t2.f1();
	}

}