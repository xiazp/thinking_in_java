package chap7;

public class test18 {
	public static final int INT_V1 = 1;
	public final int i;
	
	test18(int a){
<<<<<<< HEAD
		System.out.println(" test18(int a) constructor");
	}
	
=======
		i = a;
		System.out.println("test18() constructor");
	}
	
	
>>>>>>> d50a335b730f914c049cfc100b95955736929e6b
	public static void main(String[] args){
		test18 t = new test18(1);
		
		System.out.println("INT_V1 = " + test18.INT_V1);
		System.out.println("i = " + t.i);
	}
	
}
