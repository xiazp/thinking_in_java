package chap7;

//��ʾ���Գ�ʼ��

class lazzy{
	private String s1;
	
	public String toString(){
		if(s1 == null)
			s1 = "sdf";
		
		return s1;
	}
	
}

public class test1 {
	
	lazzy lz;
	
	public static void main(String[] args){
			lazzy lz = new lazzy();
			
			System.out.println("s1=" + lz);
	}
}
