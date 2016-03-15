
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

