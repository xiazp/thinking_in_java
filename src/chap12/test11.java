package chap12;

class T11Exception1 extends Exception{
	
	T11Exception1(String s){
		super(s);
	}
}

class T11Exception2 extends Exception{
	
	T11Exception2(String s){
		super(s);
	}
}

public class test11 {
	
	public void f() throws T11Exception1{
		throw new T11Exception1("f()");
	}
	
	public void g() throws T11Exception2{
		try{
			f();
		}catch(Exception e){
			throw new  RuntimeException(e);
		}
	}
	
	public static void main(String[] args){
		test11 t = new test11();
		
		try{
			t.g();
		}catch(Exception e){
			//System.out.println("Catch a exception: ");
			e.printStackTrace();
		}
	}

}
