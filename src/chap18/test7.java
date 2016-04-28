package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(	new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while( (s = in.readLine()) != null){
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}
}


public class test7 {
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
			System.out.println(listfile("./src/test/chap6_test1.java"));
			//System.out.println( BufferedInputFile.read("./src/test/chap6_test1.java"));
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
