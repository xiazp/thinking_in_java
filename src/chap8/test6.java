package chap8;

import java.util.Random;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play() " + n);
	}
	
	String what(){
		return "Instrument";
	}
	
	void adjust(){
		System.out.println("Adjusting Instrument ");	
	}
	
	public String toString(){
		return what();
	}
}

class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play() " + n);
	}
	
	String what(){
		return "Wind";
	}
	
	void adjust(){
		System.out.println("Adjusting Wind ");	
	}
}

class Percussion extends Instrument{
	void play(Note n){
		System.out.println("Percussion.play() " + n);
	}
	
	String what(){
		return "Percussion";
	}
	
	void adjust(){
		System.out.println("Adjusting Percussion ");	
	}
}


class Stringed extends Instrument{
	void play(Note n){
		System.out.println("Stringed.play() " + n);
	}
	
	String what(){
		return "Stringed";
	}
	
	void adjust(){
		System.out.println("Adjusting Stringed ");	
	}
}

class Brass extends Wind{
	void play(Note n){
		System.out.println("Brass.play() " + n);
	}
	
	void adjust(){
		System.out.println("Adjusting Brass ");	
	}
}


class Woodwind extends Wind{
	void play(Note n){
		System.out.println("Woodwind.play() " + n);
	}
	
	String what(){
		return "Wind";
	}
}

class RandomInstrumentGenerator{
	private Random r = new Random(7);
	public Instrument next(){
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

class Music3{
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
		System.out.println("object: " + i);
	}
	
	public static void tuneAll(Instrument[] i){
		for(Instrument im: i)
		tune(im);
	}
	
	public static void main(String[] args){
		Instrument[] orchestra  = new Instrument[20];
		RandomInstrumentGenerator r = new RandomInstrumentGenerator();
		
		for(int i=0; i < orchestra.length; i++){
			orchestra[i] = r.next();
		}
		
		tuneAll(orchestra);
	
	}
	
}

public class test6 {
	public static void main(String[] args){
		Music3.main(args);
	}
}
