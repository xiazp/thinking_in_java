package chap10;

//	创建一个类，该类持有一个Sting对象，并有一个现实该String对象toString方法。
// 将新类的若干对象添加到squence中

class Sequence1 {
	private Object[] item;
	private int next= 0;
	Sequence1(int i){
		Item[] item = new Item[i];
	}
	
	public void add(Object x){
		if(next < item.length)
			item[next++]=x;
	}
	
	class Item{
		public String s;
		
		public String toString(){
			//System.out.println(s);
			return s;
		}
	}
}


public class test2 {

	public static void main(String[] args){
		Sequence1 sq = new Sequence1(10);
		Sequence1.Item it = sq.new Item();
		for(int i=0; i < 10; i++){
			it.s = Integer.toString(i);
			//sq.add(x);
		}
			
		
	}
}
