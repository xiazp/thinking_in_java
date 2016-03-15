package chap5;

class Dog{
	void barking(){
		System.out.println("barking");
	}
	
	void barking(int i){
		System.out.println("howling" + i);
	}
}

public class test5 {
	public static void main(String[] args){
		Dog d = new Dog();
		
		d.barking();
		d.barking(4);
	}
}
