package chap7;

class t15{
	private int i;
	
	protected void A(){
		System.out.println("A() protecetd method");
	}
}

public class test15 extends t15{
	public static void main(String[] args){
		test15 t = new test15();
		t.A();
	}
}
