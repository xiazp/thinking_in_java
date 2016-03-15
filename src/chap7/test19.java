<<<<<<< HEAD
package chap7;

class t19{
	public final int i;
	public final String s;
	
	t19(){
		i = 1;
		s = "123";
	}
	
	t19(int i){
		this.i = i;
		s = "321";
	}
}

public class test19 {
	public static void main()
}
=======
package chap7;

class t19{
	final int a;
	static final int b = 1;
	public final String c;
	
	t19(int i){
		if(i > 5)
			a = 1;
		else
			a = 0;
		c = "123";
	}
}

public class test19 {
	public static void main(String[] args){
		t19 t = new t19(1);
		t19 t2 = new t19(8);
		System.out.println("t.a = " +t.a +" t.a = "+ t2.a);
	}
}
>>>>>>> d50a335b730f914c049cfc100b95955736929e6b
