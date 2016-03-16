package chap11;

import java.util.*;

class GerBil{
	int gerbilNumber;
	GerBil(int i){
		gerbilNumber = i;
	}
	public void hop(){
		System.out.println("hop "+ gerbilNumber);
	}
}


public class test1 {
	public static void main(String[] args){
		ArrayList<GerBil> g = new ArrayList<GerBil>();
		
		for(int i=0; i<3; i++){
			g.add(new GerBil(i));
		}
		
		for(int i=0; i<3; i++){
			g.get(i).hop();
		}
		
		for(GerBil c: g){
			c.hop();
		}
	}

}
