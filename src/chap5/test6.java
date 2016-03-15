package chap5;

class Dog2{
	void barking(int i, String s){
		System.out.println("barking");
	}
	
	void barking(String s, int i){
		System.out.println("howling" + i);
	}
}

public class test6 {
	public static void main(String[] s){
		Dog2 d = new Dog2();
		d.barking(1,"barking");
		d.barking("howling", 2);
	}
}
