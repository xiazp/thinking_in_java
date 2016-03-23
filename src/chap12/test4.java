package chap12;

class MyException extends Exception{
	private String msg;
	
	public MyException(String s){
		msg = s;
	}
	
	public void ShowMsg(){
		System.out.println("msg: "+ msg);
	}
}

public class test4 {
	
	public static void main(String[] args){
		try{
			throw new MyException(" error 1");
		}catch(MyException e){
			e.ShowMsg();
		}	
	}
	
}
