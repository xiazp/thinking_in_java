package util;

import java.util.Collection;

public class Generators {
	
	public static <T> void fill(Collection<T> c, Generator<T> gen, int nObj){
		for(int i=0; i < nObj; i++){
			c.add(gen.next());
		}
	}

}
