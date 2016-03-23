package chap12;

public class test3 {
	
	public static void main(String[] args){
		int[] ai = {1,2,3,4,5};
		
		try{
			for(int i=0; i<6; i++)
				System.out.println("i: " +i + " " +ai[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch e " + e.getMessage());
			e.printStackTrace();
		}
	}

}
