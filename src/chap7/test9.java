package chap7;

class Component1{
	Component1(){
		System.out.println("Component1() ");
	}
	
	Component1(int i){
		System.out.println("Component1() " +i);
	}
}

class Component2{
	Component2(){
		System.out.println("Component2() ");
	}
	
	Component2(int i){
		System.out.println("Component2() " +i);
	}
}

class Component3{
	Component3(){
		System.out.println("Component3() ");
	}
	
	Component3(int i){
		System.out.println("Component3() " +i);
	}
}

class Root{
	Component1 c1 = new Component1(1);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(3);
	
	Root(){
		System.out.println("Root() ");
	}
	
	Root(int i){
		System.out.println("Root() " + i);
	}
}

class Stem extends Root{
	Component1 c1 = new Component1(3);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(1);
	
	
	Stem(){
		System.out.println("Stem() ");
	}
	
	Stem(int i){
		System.out.println("Stem() " + i);
	}
}



public class test9 {
	public static void main(String[] args){
		
		Stem s = new Stem(5);
		
		System.out.println(s);
	}
}
