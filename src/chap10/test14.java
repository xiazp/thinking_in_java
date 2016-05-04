package chap10;

interface Monster{
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal{
	void kill();
}

class DragonZilla implements DangerousMonster{
	public void menace(){
		System.out.println("DragonZilla.menace() ");
	}
	public void destroy(){
		System.out.println("DragonZilla.destroy() ");
	}
}

interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace(){
		System.out.println("VeryBadVampire.menace() ");
	}
	public void destroy(){
		System.out.println("VeryBadVampire.destroy() ");
	}
	public void kill(){
		System.out.println("VeryBadVampire.kill() ");
	}
	public void drinkBlood(){
		System.out.println("VeryBadVampire.drinkBlood() ");
	}
}

class HorrorShow{
	 static void u(Monster b){
		 b.menace();
	 }
	 
	 static void v(DangerousMonster d){
		 d.menace();
		 d.destroy();
	 }
	 
	 static void w(Lethal l){
		 l.kill();
	 }
}

public class test14 {
	public static DangerousMonster getDangerMonster(){
		return new DangerousMonster(){
			public void menace(){
				System.out.println("getDangerMonster.menace() ");
			}
			public void destroy(){
				System.out.println("getDangerMonster.destroy() ");
			}
		};
	}
	
	public static void main(String[] args){
		DangerousMonster d =  getDangerMonster();
		HorrorShow.u(d);
		HorrorShow.v(d);
		
		Vampire v = new VeryBadVampire();
		HorrorShow.v(v);
		HorrorShow.w(v);
	}
}
