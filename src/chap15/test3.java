package chap15;

class TwoTuple<A, B>{
	public final A first;
	public final B second;
	
	public TwoTuple(A a, B b){
		first = a;
		second = b;
	}
	
	public String toString(){
		return ("( " + first + " " + second+" )");
	}
}


class ThreeTuple<A, B, C> extends TwoTuple<A,B>{
	public final C third;
	
	public ThreeTuple(A a,B b,C c){
		super(a,b);
		third = c;
	}
	
	public String toString(){
		return ("( " + first + " " + second + " " + third +" )");
	}
}

public class test3 {
		
	public static void main(String[] args){
		TwoTuple<Integer, String> tw = new TwoTuple<Integer, String>(3, "sdf");
		ThreeTuple<Integer, String, Integer> tr = 
				new ThreeTuple<Integer, String, Integer>(2, "three", 23);
		
		System.out.println(tw.toString());
		System.out.println(tr.toString());
	}

}
