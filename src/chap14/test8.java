package chap14;

class t81{}
class t82 extends t81{}
class t83 extends t82{}
class t84 extends t83{}

public class test8 {
	
	public static void ShowHisFather(Object obj){
		Class c = obj.getClass();
		while( c != null ){
			System.out.println("class name:" + c.getName());
			c= c.getSuperclass();
		}
	}
	
	public static void main(String[] args){
	
		t84 t = new t84();
		test8.ShowHisFather(t);
		
		
	}

}
