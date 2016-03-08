package chap7;

class Amphibian{
	String name = " Amphibian ";
	void A( Amphibian a){
		System.out.println("A() in Amphibian " + a.name);
	}
	
	void B( Amphibian a){
		System.out.println("A() ");
	}
}

class Frog extends Amphibian{
	
	String name = " Frog ";
	void A(String s){
		System.out.println("A() in Frog " + s);
	}
}


public class test16 {
	public static void main(String[] args){
		Frog f = new Frog();
		
		f.A(f);
		f.A("d");
	}
}
