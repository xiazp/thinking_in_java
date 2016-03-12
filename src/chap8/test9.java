package chap8;

class Rodent{
	public void eat(){};
}

class Mouse extends Rodent{
	public void eat(){
		System.out.println("Mouse.eat");
	};
}

class Gerbil extends Mouse{
	public void eat(){
		System.out.println("Gerbil.eat");
	}
}

class Hamster extends Gerbil{
	public void eat(){
		System.out.println("Hamster.eat");
	}
}


public class test9 {
	
	public static void main(String[] args){
		Rodent[] r ={
				new Mouse(),
				new Gerbil(),
				new Hamster(),
		};
		
		for(Rodent rd: r){
			rd.eat();
		}
		
	}

}
