
package util;

import java.util.Collection;



public class Generators{
	public static <T> Collection<T> fill( Collection<T> t, Generator<T> gen,
			 int n){
		
		for(int i =0; i < n; i++){
			t.add(gen.next());
		}
		
		return t;
	}
	
//	public static <T> ArrayList<T>
//	fill(ArrayList<T> arrayList, Generator<T> generator, int n) {
//	  for(int i = 0; i < n; i++)
//	    arrayList.add(generator.next());
//	  return arrayList;
//	}	
}



