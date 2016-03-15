package chap9;
import java.util.Random;

public class test10 {

	enum Note{
		MIDDLE_C, C_SHARP, B_FLAT;
	}

	abstract class Instrument{
		
		abstract String what();
		
		abstract void adjust();
	}
	
	interface Playable{
		void play(Note n);
	}

	class Wind extends Instrument implements Playable{
		public void play(Note n){
			System.out.println("Wind.play() " + n);
		}
		
		String what(){
			return "Wind";
		}
		
		void adjust(){
			System.out.println("Adjusting Wind ");	
		}
		
		public String toString(){
			return what();
		}
	}

	class Percussion extends Instrument implements Playable{
		public void play(Note n){
			System.out.println("Percussion.play() " + n);
		}
		
		String what(){
			return "Percussion";
		}
		
		void adjust(){
			System.out.println("Adjusting Percussion ");	
		}
		
		public String toString(){
			return what();
		}
	}


	class Stringed extends Instrument implements Playable{
		public void play(Note n){
			System.out.println("Stringed.play() " + n);
		}
		
		String what(){
			return "Stringed";
		}
		
		void adjust(){
			System.out.println("Adjusting Stringed ");	
		}
		
		public String toString(){
			return what();
		}
	}

	class Brass extends Wind{
		public void play(Note n){
			System.out.println("Brass.play() " + n);
		}
		
		void adjust(){
			System.out.println("Adjusting Brass ");	
		}
	}


	class Woodwind extends Wind{
		public void play(Note n){
			System.out.println("Woodwind.play() " + n);
		}
		
		String what(){
			return "Wind";
		}
	}

	class RandomInstrumentGenerator{
		private Random r = new Random(7);
		public Playable next(){
			switch(r.nextInt(6)){
			default:
			case 0:  return new Wind(); 
			case 1:  return new Percussion(); 
			case 2:  return new Stringed(); 
			case 3:  return new Woodwind(); 
			case 4:  return new Brass(); 
			}
		}
	}

	public static void tune(Playable i){
		i.play(Note.MIDDLE_C);
		//System.out.println("object: " + i);
	}
	
	public static void tuneAll(Playable[] i){
		for(Playable im: i)
			tune(im);
	}
		

	public static void main(String[] args){
		test10 t = new test10();
		RandomInstrumentGenerator r =  t.new  RandomInstrumentGenerator();
		Playable[]  orchestra = new  Playable[10];
		
		for(int i=0; i < orchestra.length; i++){
			orchestra[i] = r.next();
		}
		
		tuneAll(orchestra);
	}
}
