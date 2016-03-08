package chap7;

class Cleanser2{
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

class Detergent2{
	
	private Cleanser2 cls = new Cleanser2();
	
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
		Detergent2 x = new Detergent2();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		
		System.out.println("Test base case:");
		Cleanser2.main(args);
	}
}


public class test11 {
	public static void  main(String[] args){
		Detergent2 d = new Detergent2();
		
		System.out.println(d);
	}
	
}

