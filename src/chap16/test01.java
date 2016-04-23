package chap16;

import java.util.Arrays;

class BerylliumSphere{
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "Sphere " + id;
	}
}



public class test01 {
	
	public static void funcarrays(BerylliumSphere[] sb){
		StringBuilder sbf = new StringBuilder();
		for(int i=0; i < sb.length; i++){
			sbf.append(sb[i].toString());
			sbf.append(", ");
		}
		System.out.println(sbf.toString());
	}
	
	public  static void main(String[] args){
		
		BerylliumSphere[] array = new BerylliumSphere[4];
		
		for(int i=0; i< array.length; i++){
			array[i] = new BerylliumSphere();
		}
		
		funcarrays(array);
		
		System.out.println(Arrays.toString(array));
	}

}
