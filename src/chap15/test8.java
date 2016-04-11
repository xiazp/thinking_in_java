package chap15;

import java.util.Iterator;
import java.util.Random;

class StoryCharacter{
	private static long counter=0;
	private final  long id = counter++;
	
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

class Duck extends StoryCharacter{
}

class Bear extends StoryCharacter{
	
}

class Fox extends StoryCharacter{
	
}

class Monkey extends StoryCharacter{
	
}

class CharacterGenerator implements Iterable<StoryCharacter>{
	private Class[] types = {Duck.class, Bear.class, Fox.class,Monkey.class};
	private Random rand = new Random(47);
	private int size = 0; // create how many object
	
	//Contructor
	public CharacterGenerator(){};
	public CharacterGenerator(int sz){
		size = sz;
	};
	
	public StoryCharacter next(){
		try{
			return (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e){
			System.out.println("catch a exception");
			throw new RuntimeException(e);
		}
	}
	
	
	
	class CharacterIterator implements Iterator<StoryCharacter>{
		int count = size;
		
		public boolean hasNext(){
			return count > 0;
		}
		
		public StoryCharacter next(){
			count--;
			return CharacterGenerator.this.next();
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	
	public Iterator<StoryCharacter> iterator(){
		return new CharacterIterator();
	}
}


public class test8 {
	
	public static void main(String[] args){
		CharacterGenerator cg = new CharacterGenerator();
		
		for(int i=0; i< 5; i++){
			System.out.println(cg.next());
		}
		
		
		for(StoryCharacter sc: new CharacterGenerator(5)){
			System.out.println(sc);
		}
		
	}
}
