package chap11;

import java.util.PriorityQueue;
import java.util.Random;

public class test28 {
	public static void main(String[] args){
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		Random rand = new Random(47);
		
		for(int i =0; i < 6; i++){
			pq.offer(rand.nextDouble());
		}
		System.out.println("pq: " + pq);
		
		while(!pq.isEmpty()){
			System.out.println("d: " + pq.poll());
		}
		
		
	}

	
}
