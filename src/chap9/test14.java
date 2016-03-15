package chap9;

interface iface1{
	void f1();
	void f2();
}

interface iface2{
	void f3();
	void f4();
}

interface iface3{
	void f5();
	void f6();
}

interface iface4 extends iface1, iface2, iface3{
	void f7();
}

class t14{
	public void f1(){
		System.out.println("t14.f1() ");
	}
}

public class test14  extends t14 implements iface4{
	public void f1(){
		System.out.println("test14.f1() ");
	}
	public void f2(){
		System.out.println("test14.f2() ");
	}
	public void f3(){
		System.out.println("test14.f3() ");
	}
	public void f4(){
		System.out.println("test14.f4() ");
	}
	public void f5(){
		System.out.println("test14.f5() ");
	}
	public void f6(){
		System.out.println("test14.f6() ");
	}
	public void f7(){
		System.out.println("test14.f7() ");
	}
	
	public void f_iface1(iface1 i){
		i.f1();
		i.f2();
	}
	
	public void f_iface2(iface2 i){
		i.f3();
		i.f4();
	}
	
	public void f_iface3(iface3 i){
		i.f5();
		i.f6();
	}
	
	public void f_iface4(iface4 i){
		i.f7();
	}
	
	
	public static void main(String[] args){
		test14 t = new test14();
		
		t.f_iface1(t);
		t.f_iface2(t);
		t.f_iface3(t);
		t.f_iface4(t);
	}
}
