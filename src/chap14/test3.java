package chap14;

import java.util.Random;


class Shape{
	public void draw(){};
	public void earse(){};
	public void showname(){
		System.out.println("Shape()");
	};
	
	public void rotate(Shape s){
		if(s instanceof Circle){
			System.out.println("rotate s is a circle");
		}else{
			System.out.println("rotate s is not a circle");
		}
	}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("Circle.draw() ");
	}
	@Override
	public void earse(){
		System.out.println("Circle.earse() ");
	};
	@Override
	public void showname(){
		System.out.println("Circle() ");
	};
}

class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Square.draw() ");
	}
	@Override
	public void earse(){
		System.out.println("Square.earse() ");
	};
	@Override
	public void showname(){
		System.out.println("Square() ");
	};
}


class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Triangle.draw() ");
	}
	@Override
	public void earse(){
		System.out.println("Triangle.earse() ");
	};
	@Override
	public void showname(){
		System.out.println("Triangle() ");
	};
}

class Rhombiod extends Shape{
	@Override
	public void draw(){
		System.out.println("Rhombiod.draw() ");
	}
	@Override
	public void earse(){
		System.out.println("Rhombiod.earse() ");
	};
	@Override
	public void showname(){
		System.out.println("Rhombiod() ");
	};
}

class RandomShapeGenerator{
	private Random rand = new Random(47);

	public Shape next(){
		switch(rand.nextInt(3)){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}



public class test3 {
	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	
	public static void main(String[] args){
		Rhombiod rb  = new Rhombiod();
	
		Shape s = rb;
		s.draw();
		
		Rhombiod r2 = (Rhombiod)s;
		r2.draw();
		
		try{
			Circle c = (Circle)s;
			c.draw();
		}catch(Exception e){
			System.out.println("cannot change shape to circle");
		}
		
		//test4
		if( s instanceof Circle){
			Circle c = (Circle)s;
			c.draw();
		}else{
			System.out.println("s is not a circle");
		}
		
		//test5
		s.rotate(s);
		Circle c = new Circle();
		c.rotate(c);
		
		

		
	}

}
