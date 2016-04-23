package chap16;

import java.util.Arrays;

public class test02 {
	
	public static BerylliumSphere[] genArray(int n){
		
		BerylliumSphere[] result = new BerylliumSphere[n];
		
		for(int i=0; i < n; i++){
			result[i] = new BerylliumSphere();
		}
		
		return result;
	};
	
	
	public static void main(String[] args){
		
		BerylliumSphere[] sb = genArray(4);
		
		System.out.println("1: " + Arrays.toString(sb));
	}

}
