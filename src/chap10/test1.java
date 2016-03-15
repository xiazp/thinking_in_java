package chap10;

public class test1 {
	class Inner{
		Inner(){
			System.out.println("Inner() ");
		}
		
		void f(){
			System.out.println("Inner.f() ");
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	
	public static void main(String[] args){
		test1 t = new test1();
		Inner in = t.getInner();
		
		
		in.f();
	}
	

}
