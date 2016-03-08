package chap7;

class Cleanser{
	private String s = "Cleanser ";
	
	public void append(String a){
		s += a;
	}
	
	public void dilute(){
		append( " dilute() ");
	}
	
	public void apply(){
		append( " apply() ");
	}
	
	public void scrub(){
		append( " scrub() ");
	}
	
	public String toString(){
		return s;
	}
	
	public static void main(String[] args){
		Cleanser s = new Cleanser();
		s.dilute();
		s.apply();
		s.scrub();
		System.out.println(s);
	}
}

class Detergent{
	
	private Cleanser cls = new Cleanser();
	
	public void dilute(){
		cls.dilute();
	}
	
	public void apply(){
		cls.apply();
	}
	
	public void scrub(){
		cls.scrub();
	}
	
	public void foam(){
		cls.append(" foam() ");
	}
	
	public String toString(){
		return cls.toString();
	}
	
	public static void main(String[] args){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		
		System.out.println("Test base case:");
		Cleanser.main(args);
	}
}


public class test7 {
	public static void  main(String[] args){
		Detergent d = new Detergent();
		
		System.out.println(d);
	}
	
}
