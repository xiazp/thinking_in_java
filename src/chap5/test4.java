package chap5;



class test4 {
	test4(){
		System.out.println("default constructor");
	}
	
	test4(String s){
		System.out.println(s);
	}
	public static void main(String[] args){
		test4 t1 = new test4("sdfsdf");
		test4 t2= new test4();
	}
}
