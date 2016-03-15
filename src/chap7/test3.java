package chap7;

class Art{
	Art(){
		System.out.println(" Art() ");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println(" Drawing() ");
	}
}

class Cartoon extends Drawing {
	Cartoon(){
		System.out.println(" Cartoon");
	}
}

public class test3 {
	public static void main(String[] args){
		Cartoon c = new Cartoon();
		
		System.out.println(c);
	}
}
