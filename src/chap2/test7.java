package chap2;

class StaticTest{
	static int i;
}

class Incrementable{
	static void increment(){
		StaticTest.i++;
	}
}

public class test7 {
	public static void main(String[] args){
		System.out.println("i=" + StaticTest.i);
		Incrementable.increment();
		System.out.println("i=" + StaticTest.i);
	}
}
