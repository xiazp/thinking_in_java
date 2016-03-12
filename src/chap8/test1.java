package chap8;

class Cycle{
	public void ride(){
		System.out.println("Cycle run() ");
		System.out.println("wheels = " + wheels());
	}
	
	public int wheels(){
		return 0;
	}
}

class Unicycle extends Cycle{
	public void ride(){
		System.out.println("UniCycle run() ");
		System.out.println("wheels = " + wheels());
	}
	
	public int wheels(){
		return 1;
	}
}

class Bicycle extends Cycle{
	public void ride(){
		System.out.println("Bicycle run() ");
		System.out.println("wheels = " + wheels());
	}
	
	public int wheels(){
		return 2;
	}
}

class Tricycle extends Cycle{
	public void ride(){
		System.out.println("Tricycle run() ");	
		System.out.println("wheels = " + wheels());
	}
	
	public int wheels(){
		return 3;
	}
}

public class test1 {
	
	public void ride(Cycle c){
		c.ride();
	}
	
	public static void main(String[] args){
		test1 t = new test1();
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		
		t.ride(uc);
		t.ride(bc);
		t.ride(tc);
	}
}
