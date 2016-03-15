package chap9;

public class test8 {
	
	interface Fastfood{
		void eat();
	}
	
	class Meal{
		Meal(){
			System.out.println(" Meal() ");
		}
	}

	class Bread{
		Bread(){
			System.out.println(" Bread() ");
		}
	}

	class Cheese{
		Cheese(){
			System.out.println(" Cheese() ");
		}
	}

	class Lettuce{
		Lettuce(){
			System.out.println(" Lettuce() ");
		}
	}

	class Lunch extends Meal{
		Lunch(){
			System.out.println(" Lunch() ");
		}
	}

	class PortableLunch extends Lunch{
		PortableLunch(){
			System.out.println(" PortableLunch() ");
		}
	}

	class Sandwich implements Fastfood{
		private Bread b = new Bread();
		private Cheese c = new Cheese();
		private Lettuce l = new Lettuce();
		
		public Sandwich(){
			System.out.println(" Sandwich() ");
		}
		
		public void eat(){
			System.out.println("eat by mouse");
		}
	}


	public static void main(String[] args){
		test8 t = new test8();
		Sandwich s = t.new Sandwich();
		s.eat();
	}

}
