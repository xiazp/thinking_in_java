package chap9;


interface Processor{
	String name();
	Object process(Object input);
}

class Apply{
	public static void process(Processor p, Object s){
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}

class exchange implements Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	
	public String process(Object s){
		StringBuffer sb = new StringBuffer( (String)s );
		return sb.reverse().toString();
	}
}

public class test11 {
	public static void main(String[] args){
		Apply.process(new exchange(), "123");
	}
}
