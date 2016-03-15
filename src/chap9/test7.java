package chap9;

public class test7 {

	interface Rodent{
		public void eat();
	}

	class Mouse implements Rodent{
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


	public static void main(String[] args){
		test7 t = new test7();
		Rodent[] r ={
				t.new Mouse(),
			    t.new Gerbil(),
				t.new Hamster(),
		};
		
		for(Rodent rd: r){
			rd.eat();
		}
		
	}

}
