package chap15;

interface Iface{
	void f1();
	void f2();
}

class Iclass implements Iface{
	public void f1(){
		System.out.println("Iclass.f1() ");
	}
	
	public void f2(){
		System.out.println("Iclass.f2() ");
	}
}

class Iclass2{
	
	public  Iface get(){
		return new Iclass();
	}
	
	public  <T extends Iface> void  f(T t){
		t.f1();
	}
}

public class test20 {
	
	public static void main(String[] args){
		Iclass2 cl2 = new Iclass2();
		cl2.f(new Iclass());
	}
}
