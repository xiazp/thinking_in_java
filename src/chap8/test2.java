package chap8;

import java.util.Random;

//test2  test3 

class Shape{
	public void draw(){};
	public void earse(){};
	public void showname(){
		System.out.println("Shape()");
	};
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



public class test2 {
	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	
	public static void main(String[] args){
		Shape[] s  = new Shape[9];
		
		for(int i = 0; i < s.length; i++){
			s[i] = gen.next();
		}
		
		for(Shape shp: s){
			//System.out.println("");
			shp.draw();
			shp.earse();
			shp.showname();
			
		}
		
	}
	
	
}
