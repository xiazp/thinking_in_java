package chap8;

class Shared{
	private int refcount = 0; //引用计数
	private static long counter = 0;  //对象计数
	private final long id = counter++;
	
	public Shared(){
		System.out.println("Shared() ");
	}
	
	public void addRef(){
		refcount++;
	}
	
	protected void dispose(){
		if(--refcount == 0)
			System.out.println( "Disposing  " + this);
	}
	
	public String toString(){
		return "shared " + id;
	}
}

class Composing{
	private Shared shared; //共享对象
	private static long counter =0;
	private final long id = counter++;
	
	public Composing(Shared shared){
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose(){
		System.out.println("disposing " + this);
		shared.dispose();
	}
	
	public String toString(){
		return "Composing " + id;
	}
}

class ReferenceCounting{
	public static void main(String[] args){
		Shared shared = new Shared();
		Composing[] composing = new Composing[4];
		
		for(int i=0; i < composing.length; i++)
			composing[i] = new Composing(shared);
		
		for(Composing s: composing){
			s.dispose();
		}
	}
}

public class test13 {
	public static void main(String[] args){
		ReferenceCounting.main(args);
	}
}
