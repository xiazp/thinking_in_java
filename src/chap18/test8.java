package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class test8 {
	
	public static String listfile(String filename) throws IOException{
		BufferedReader in = new BufferedReader(	new FileReader(filename));
		List<String> l = new LinkedList<String>();
		String s;
		
		while((s = in.readLine()) != null){
			l.add(s);
		}
		in.close();
		
		return l.toString();
	}
	
	public static void main(String[] args){
		
		try{
			System.out.println( listfile(args[0]) );
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
