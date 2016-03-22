package chap12;

public class test1 {
	
	public static void main(String[] args){
		try{
			throw new Exception("exception in try");
		}catch(Exception e){
			System.out.println("msg: " + e.getMessage());
		}finally{
			System.out.println("finally run");
		}
	}

}
