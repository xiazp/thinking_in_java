package chap12;

public class test5 {
	
	public static void main(String[] args){
		int[] ai={1,2,3,4};
		
		int i = 0;
		while(true){
			try{
				if( ai[i++] < 4 )
					throw new Exception("value " +Integer.toString(i));
				break;
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end");
	}
	
}
