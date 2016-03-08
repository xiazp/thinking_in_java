package chap7;

class Component1{
	Component1(){
		System.out.println("Component1() " + "W");
	}
	
	Component1(int i){
		System.out.println("Component1() " +i);
	}
	
	void dispose(){
		System.out.println("Component1() " + "E");
	}
}

class Component2{
	Component2(){
		System.out.println("Component2() " + "W");
	}
	
	Component2(int i){
		System.out.println("Component2() " +i);
	}
	
	void dispose(){
		System.out.println("Component2() " + "E");
	}
}

class Component3{
	Component3(){
		System.out.println("Component3() " + "W");
	}
	
	Component3(int i){
		System.out.println("Component3() " +i);
	}
	
	void dispose(){
		System.out.println("Component3() " + "E");
	}
}

class Root{
	Component1 c1 = new Component1(1);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(3);
	
	Root(){
		System.out.println("Root() " + "W");
	}
	
	Root(int i){
		System.out.println("Root() " + i);
	}
	
	void dispose(){
		c3.dispose();
		c2.dispose();
		c1.dispose();
		System.out.println("Root() " + "E");
	}
}

class Stem extends Root{
	Component1 c1 = new Component1(3);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(1);
	
	
	Stem(){
		System.out.println("Stem() " + "W");
	}
	
	Stem(int i){
		System.out.println("Stem() " + i);
	}
	
	void dispose(){
		System.out.println("Stem() " + "E");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}



public class test9 {
	public static void main(String[] args){
		
		Stem s = new Stem();
		
		try{
			System.out.println(s);
		}finally{
			s.dispose();
		}
		
		System.out.println(s);
	}
}
