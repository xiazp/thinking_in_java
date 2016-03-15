package chap8;


/*

class Actor{
	public void act(){};
}

class HappyActor extends Actor{
	public void act(){
		System.out.println("HappyActor.act()");
	}
}

class SadActor extends Actor{
	public void act(){
		System.out.println("SadActor.act()");
	}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
	}
	public void performPlay(){
		actor.act();
	}
}

class Transmogrify{
	public static void main(String[] args){
		Stage stage = new Stage();
	
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}*/

class AlterStatus{
	private int status =0;
	
	AlterStatus(int s){
		status = s;
	}
	
	public void display(){
		System.out.println("AlterStatus.display()  " + status);
	}
}

class Starship{
	AlterStatus s = new AlterStatus(1);
	
	public void change(int i){
		s = new  AlterStatus(i);
	}
	
	public void show(){
		s.display();
	}
	
	public static void main(String[] args){
		Starship s = new Starship();
		s.show();
		s.change(2);
		s.show();
		s.change(3);
		s.show();
	}
	
}



public class test16 {
	public static void main(String[] args){
		//Transmogrify.main(args);
		Starship.main(args);
	}
}
