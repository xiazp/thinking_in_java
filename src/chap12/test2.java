package chap12;

public class test2 {
	

	
	public static void main(String[] args){
		String s = null;
		
		try{
			System.out.println("s:" + s.toLowerCase());
		}catch(Exception e){
			System.out.println("catch a exception");
			e.printStackTrace();
		}finally{
			System.out.println("finally run");
		}
		
	}
}
