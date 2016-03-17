package chap11;



import java.util.*;

public class test8 {
	
	class GerBil{
		int gerbilNumber;
		GerBil(int i){
			gerbilNumber = i;
		}
		public void hop(){
			System.out.println("hop "+ gerbilNumber);
		}

	}
	
	public static void main(String[] args){
		ArrayList<GerBil> g = new ArrayList<GerBil>();
		test8 t = new test8();
		
		for(int i=0; i<3; i++){
			g.add(t.new GerBil(i));
		}
		
		Iterator<GerBil> it = g.iterator();
		while( it.hasNext()){
			GerBil sb = (GerBil)it.next();
			sb.hop();
		}
		
		for(GerBil c: g){
			c.hop();
		}
	}

}
