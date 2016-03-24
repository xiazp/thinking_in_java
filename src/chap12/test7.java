package chap12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


class MyException3 extends Exception {
	private static Logger logger = 
			Logger.getLogger("MyException3 ");
	
	public MyException3(){};
	
	public MyException3(String msg){
		super(msg);
		loggerException(this);
	}
	
	static void loggerException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace)); 
		logger.severe(trace.toString());
	}
}

public class test7 {
	
	public static void main(String[] args){
		int[] ai = {1,2,3,4,5};
		
		try{
			for(int i=0; i<6; i++)
				System.out.println("i: " +i + " " +ai[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch e ");
			new MyException3(e.getMessage());
		}
	}

}
