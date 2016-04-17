package chap15;



import java.util.ArrayList;
import java.util.Random;

import util.Generator;
import util.Generators;

class Good{
	private final int id;
	private String desc;
	private double price;
	
	public Good(int id, String desc, double price){
		this.id = id;
		this.desc = desc;
		this.price = price;
		
		System.out.println(toString());
	}
	
	public String toString(){
		return id + ": " + desc + " " + price;
	}
	
	public void changePrice(double change){
		price += change;
	}
	
	public static Generator<Good> generator = 
			new Generator<Good>(){
		private Random rand = new Random(47);
		
		public Good next(){
			return new Good(rand.nextInt(1000), "Test", 
					Math.round( rand.nextDouble() * 1000.0 ) +0.99 );
		}
	};
}

class Box extends ArrayList<Good> {
	public Box(int nGoods){
		Generators.fill(this, Good.generator,nGoods);
	}
}

class Ship extends ArrayList<Box>{
	public Ship(int nBox, int nGoods){
		for(int i=0; i < nBox; i++)
			add(new Box(nGoods));  //add is ship 的父类 ArrayList的方法
	}
}

class Ships extends ArrayList<Ship>{


	public Ships(int nShips, int nBoxs, int nGoods){
		for(int i=0; i <nShips; i++){
			add(new Ship(nBoxs, nGoods));
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(Ship sh: this){
			for(Box b: sh){
				for(Good g: b){
					sb.append(g);
					sb.append("\n");
				}
			}
		}
		
		return sb.toString();
	}
}




public class test15 {
	
	public static  void main(String[] args){
		
		System.out.println(new Ships(2,4,5));
		
	}
	

}
