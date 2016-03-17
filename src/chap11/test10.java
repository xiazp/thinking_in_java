package chap11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class test10 {


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
		
	public static void main(String[] args){
		test10 t = new test10();
		List<Rodent> r = new ArrayList<Rodent>();
		
		r.add(t.new Mouse());		
		r.add(t.new Gerbil());
		r.add(t.new Hamster());

		
		Iterator<Rodent> it = r.iterator();
		
		while(it.hasNext()){
			Rodent rd = it.next();
			System.out.println(rd);
		}
		
	}

	


}
