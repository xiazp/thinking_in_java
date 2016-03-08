package chap7;

class Cleanser{
	private String s = "Cleanser";
	public void append(String a) { 
		s+=a;
	}
	public void dilute(){ 
		append(" dilute() "); 
	}
	public void apply(){ 
		append(" apply() "); 
	}
	public void scrub(){ 
		append( " scrub() ");
	}
	public String toString(){
		return s;
	}
	
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}

class Detergent extends Cleanser{
	
	public void scrub(){
		append( " Detergent.scrub() ");
		super.scrub();
	}
	
	public void foam(){
		append( " foam() " );
	}
	
	public static void main(String[] args){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class£º");
		Cleanser.main(args);
	}
}

public class test2 extends Detergent{
	public void scrub(){
		append( " test scrub() " );
	}
	public void sterilize(){
		super.main(null);
		append( " test sterilize() " );
	}
	
	public static void main(String[] args){
		test2 t = new test2();

		t.scrub();
		t.sterilize();
		
		System.out.println(t);
	}
}
