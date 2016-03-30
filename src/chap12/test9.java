package chap12;

class T9Exception1 extends Exception{
	
	T9Exception1(){
		System.out.println("T9Exception1 ");
	}
	
	T9Exception1(String s){
		super(s);
	}
	

}

class T9Exception2 extends Exception{
	T9Exception2(){
		System.out.println("T9Exception2 ");
	}
	
	T9Exception2(String s){
		super(s);
	}
}

class T9Exception3 extends Exception{
	T9Exception3(){
		System.out.println("T9Exception3 ");
	}
	
	T9Exception3(String s){
		super(s);
	}
}

public class test9 {
	
	public static void main(String[] args){
		
		for(int i=0; i <3; i++){
			try{
				switch(i){
					case 0: throw new T9Exception1("e1");
					case 1: throw new T9Exception2("e2");
					case 2: throw new T9Exception3("e3");
					default: return;
				}
			}catch(Exception e){
				System.out.println("catch exception: " + e.getMessage());
			}finally{
				System.out.println("finally : " + i);
			}
		}
		
	}
}
