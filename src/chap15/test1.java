package chap15;

abstract class animal{
	
	abstract void eat();
}

class dog extends animal{
	public void eat(){
		System.out.println("dog eating");
	}
}

class cat extends animal{
	public void eat(){
		System.out.println("cat eating");
	}
}

class pet<T>{
	private T a;
	
	public pet(T a){
		this.a = a;
	}
	
	public T get(){
		return a;
	}
	
}

public class test1 {
		
	public static void main(String[] args){
		pet<animal> a = new pet<animal>(new dog());
		dog d = (dog)a.get();
		d.eat();
		
		pet<cat> b = new pet<cat>(new cat());
		animal c = b.get();
		c.eat();
 	}

}
