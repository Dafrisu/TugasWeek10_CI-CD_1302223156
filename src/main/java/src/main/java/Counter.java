package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count = count + 1;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
        
	public String countToString(){
            String toString = Integer.toString(count);
            return toString;
        }
}
