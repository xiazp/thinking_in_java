package chap9;

abstract class sup_t4{	
}

class sub_t4 extends sup_t4{
	public static void f( sup_t4 s){
		System.out.println("sub_t4.f() " );
	}
	
	
}


public class test4 {
	public static void main(String[] args){
		sub_t4 t = new sub_t4();
		sub_t4.f(t);
	}
}
