package chap10;

//	创建一个类，该类持有一个Sting对象，并有一个现实该String对象toString方法。
// 将新类的若干对象添加到squence中

class Sequence{
	private Object[] item;
	private int next= 0;
	Sequence(int i){
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
		Sequence sq = new Sequence(10);
		Sequence.Item it = sq.new Item();
		for(int i=0; i < 10; i++){
			it.s = Integer.toString(i);
			//sq.add(x);
		}
			
		
	}


}
