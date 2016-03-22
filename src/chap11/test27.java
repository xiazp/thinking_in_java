package chap11;

import java.util.LinkedList;
import java.util.Queue;

class Command{
	String s;
	public void operation(){
		System.out.println("operation(): " + s);
	}
	
	public Command(String s){
		this.s = s;
	}
}

class QueueA{
	Queue<Command> qe = new LinkedList<Command>();
	
	public Command setMember(Command q){
		qe.offer(q);
		return q;
	}
	
	public Queue<Command> get(){
		return qe;
	}
}


public class test27 {
	
	public static void printQ(Queue<? extends Command> q){
		while(!q.isEmpty()){
			Command c = q.poll();
			c.operation();
		}
	}

	public static void main(String[] args){
		QueueA qa = new QueueA();
		
		qa.setMember(new Command("c1"));
		qa.setMember(new Command("c2"));
		qa.setMember(new Command("c3"));
		
		printQ(qa.get());
		
	}


}
