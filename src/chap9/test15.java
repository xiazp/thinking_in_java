package chap9;




abstract class iface151{
	abstract void f1();
	abstract void f2();
}

abstract class  iface152 extends iface151{ 
	abstract void f3();
	abstract void f4();
}

abstract class iface153 extends iface152{
	abstract void f5();
	abstract void f6();
}

abstract class iface154 extends iface153{
	abstract void f7();
}



public class test15  extends iface154{
	public void f1(){
		System.out.println("test15.f1() ");
	}
	public void f2(){
		System.out.println("test15.f2() ");
	}
	public void f3(){
		System.out.println("test15.f3() ");
	}
	public void f4(){
		System.out.println("test15.f4() ");
	}
	public void f5(){
		System.out.println("test15.f5() ");
	}
	public void f6(){
		System.out.println("test15.f6() ");
	}
	public void f7(){
		System.out.println("test15.f7() ");
	}
	
	public void f_iface1(iface151 i){
		i.f1();
		i.f2();
	}
	
	public void f_iface2(iface152 i){
		i.f3();
		i.f4();
	}
	
	public void f_iface3(iface153 i){
		i.f5();
		i.f6();
	}
	
	public void f_iface4(iface154 i){
		i.f7();
	}
	
	
	public static void main(String[] args){
		test15 t = new test15();
		
		t.f_iface1(t);
		t.f_iface2(t);
		t.f_iface3(t);
		t.f_iface4(t);
	}

}
