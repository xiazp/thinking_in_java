package chap10;

class Outer{
	private int i = 11;
	Outer(){
		System.out.println("Outer() i=" + i);
	}
	
	class Inner{
		Inner(){
			System.out.println("Inner() i=" + i);
			i++;
		}
	}

}

public class test5 {
	public static void main(String[] args){
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}
