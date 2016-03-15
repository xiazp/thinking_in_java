package chap8;

class Rodent12{
	public void eat(){};
	Rodent12(){
		System.out.println("Rodent12() ");
	}
}

class Mouse12 extends Rodent12{
	public void eat(){
		System.out.println("Mouse.eat");
	};
	Mouse12(){
		System.out.println("Mouse12() ");
	}
}

class Gerbil12 extends Mouse12{
	public void eat(){
		System.out.println("Gerbil.eat");
	}
	
	Gerbil12(){
		System.out.println("Gerbil12() ");
	}
}

class Hamster12 extends Gerbil12{
	
	public void eat(){
		System.out.println("Hamster.eat");
	}
	
	Hamster12(){
		System.out.println("Hamster12() ");
	}
}


public class test12 {
	
	public static void main(String[] args){
		Hamster12 h =	new Hamster12();
		h.eat();
	}

}
