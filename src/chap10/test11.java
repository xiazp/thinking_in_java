package chap10;

interface func{
	func f();
}


public class test11 {
	private class Inner implements func{
		public func f(){
			System.out.println("Inner.f() ");
			return new Inner(); // Inner ����ת��Ϊ�ӿ�
		}
	}
	
	public static void main(String args){
		test11 test = new test11();
		func fn = test.new Inner();
		fn.f();
	}
	
}
