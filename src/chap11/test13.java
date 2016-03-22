package chap11;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



abstract class Event {
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	
	public void start(){
		eventTime = System.nanoTime() +delayTime;
	}
	
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();
}


class Controller{
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event c){
		eventList.add(c);
	}
	
	public void run(){
		
		Iterator<Event> it = eventList.iterator();
		while( it.hasNext()){
			Event e = it.next();
			if( e.ready() ){
				System.out.println(e);
				e.action();
				eventList.remove(e);
			}
		}

//		for(Event e: new LinkedList<Event>(eventList)){
//			if( e.ready() ){
//				System.out.println(e);
//				e.action();
//				eventList.remove(e);
//			}
//		}
	
	}
}

class GreenhouseControls extends Controller{

	// light
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			light = true;
		}
		
		public String toString(){
			return "Light is on";
		}
	}
	
	public class LightOff extends Event {
		public LightOff(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			light = false;
		}
		
		public String toString(){
			return "Light is off";
		}
	}
	
	// water
	private boolean water = false;
	public class WaterOn extends Event{		
		public WaterOn(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			water = true;
		}
		
		public String toString(){
			return "Greenhouse water is on";
		}
	}
	
	public class WaterOff extends Event{
		public WaterOff(long delayTime ){
			super(delayTime);
		}
		
		public void action(){
			water = false;
		}
		
		public String toString(){
			return "Greenhouse water is off";
		}
	}
	
	// bell
	public class Bell extends Event{
		public Bell(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			addEvent(new Bell(delayTime));
		}
		
		public String toString(){
			return "Bing!";
		}
	}
	
	// all cro
	public class Restart extends Event {
		
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList){
			super(delayTime);
			this.eventList = eventList;
			
			for(Event e: eventList){
				addEvent(e);
			}
		}
		
		public void action(){
			for(Event e: eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		public String toString(){
			return "Restarting system";
		}
	}
	
	
	public static class Terminate extends Event{
		public Terminate(long delayTime){
			super(delayTime);
		}
		
		public void action(){
			System.exit(0);
		}
		
		public String toString(){
			return "Restarting system";
		}
		
		
	}
}

class GreenhouseController{
	public static void main(String[] args){
		GreenhouseControls gc = new GreenhouseControls();
		
		gc.addEvent(gc.new Bell(900));
		
		Event[] eventList={
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
		};
		
		gc.addEvent(gc.new Restart(2000, eventList));
		
		System.out.println(eventList);
		
		if(args.length == 1)
			gc.addEvent(new GreenhouseControls.Terminate(
					new Integer(args[0])) 
			);
		
		gc.run();
	}
}

public class test13 {
	
	public static void main(String[] args){
		GreenhouseController.main(args);
	}
	
}

