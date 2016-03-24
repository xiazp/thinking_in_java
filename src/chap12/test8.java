package chap12;



public class test8 {

	public void f(){
		throw new NullPointerException();
	}
	
	public void h() throws NullPointerException{
		throw new NullPointerException();
	}
	
	public static void main(String[] args){
		test8 t = new test8();
		try{
			t.h();
		}catch(Exception e){
			System.out.println("Catch a exception");
			//e.printStackTrace();
		}finally{
			System.out.println("end");
		}
	}
	
}
