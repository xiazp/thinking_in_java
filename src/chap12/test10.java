package chap12;

class T10Exception1 extends Exception{
	
	T10Exception1(String s){
		super(s);
	}
}

class T10Exception2 extends Exception{
	
	T10Exception2(String s){
		super(s);
	}
}

public class test10 {
	
	public void f() throws T10Exception1{
		throw new T10Exception1("f()");
	}
	
	public void g() throws T10Exception2{
		try{
			f();
		}catch(Exception e){
			throw new  T10Exception2("g()");
		}
	}
	
	public static void main(String[] args){
		test10 t = new test10();
		
		try{
			t.g();
		}catch(Exception e){
			//System.out.println("Catch a exception: ");
			e.printStackTrace();
		}
	}

}
