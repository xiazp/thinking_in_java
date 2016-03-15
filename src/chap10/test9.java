package chap10;

interface t9 {
	void f1();
}

public class test9 {
	
	t9 f2(){
		class ta implements t9{
			public void f1(){
				System.out.println("ta.f1() ");
			}
		}
		return new ta();
	}
	
	public static void main(String[] args){
		test9 t = new test9();
		t9 t2 = t.f2();	
		t2.f1();
	}

}
