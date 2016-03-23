package chap12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException1 extends Exception{
	private static Logger logger = 
			Logger.getLogger("MyException1 ");
	
	public MyException1(){};
	
	public MyException1(String msg){
		super(msg);
		loggerException(this);
	}
	
	static void loggerException(Exception e){
		StringWriter trace = new StringWriter();
		//将栈的信息输出到trace
		e.printStackTrace(new PrintWriter(trace)); 
		//打印trace的信息
		logger.severe(trace.toString());
	}
}

class MyException2 extends Exception{
	private static Logger logger = 
			Logger.getLogger("MyException2 ");
	
	public MyException2(){};
	
	public MyException2(String msg){
		super(msg);
		loggerException(this);
	}
	
	static void loggerException(Exception e){
		StringWriter trace = new StringWriter();
		//将栈的信息输出到trace
		e.printStackTrace(new PrintWriter(trace)); 
		//打印trace的信息
		logger.severe(trace.toString());
	}
	
}

public class test6 {

	public static void main(String[] args){
		
		try{
			throw new MyException1("exception1 ");
		}catch(Exception e){
			System.out.println("catch " + e.getMessage());
		}
		
		try{
			throw new MyException2("exception2 ");
		}catch(Exception e){
			System.out.println("catch " + e.getMessage());
		}
	}

}
