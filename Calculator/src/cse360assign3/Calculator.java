
package cse360assign3;

public class Calculator {

	private int total;
	private String history = "";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history += "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	public void divide (int value) {
		history += " / " + value;
		if(value == 0){
			total = 0;
			return;
		}
		total /= value;
	}
	
	public String getHistory () {
		return history;
	}
}
