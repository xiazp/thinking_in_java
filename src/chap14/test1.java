package chap14;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	//Toy(){}
	Toy(int i){	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy(){
		super(1);
	}
	
}

public class test1 {
	static void printInfo(Class c){
		System.out.println("Class name: " + c.getName() +
				" is interface? " + "[" +c.isInterface() + "]");
		System.out.println("Simple name: " + c.getSimpleName());
		System.out.println("Canonical name: " + c.getCanonicalName());
	}
	public static void main(String[] args){
		Class c = null;
		try{
			c = Class.forName("chap14.FancyToy");
		}catch(ClassNotFoundException e){
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		
		for(Class face: c.getInterfaces()){
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			obj = up.newInstance();
		}catch(InstantiationException e){
			System.out.println("Cannot instantiate");
			System.exit(1);
		}catch(IllegalAccessException e){
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
		
	}

}
