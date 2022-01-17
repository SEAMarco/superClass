package de.telekom.sea71;

public class Application2 extends BaseObject{

	public Application2() {
		super(1);
		
	}
	public void run(String[] args) {
		Auto auto = new Auto ("BMW", "X5");
		
		System.out.println(auto); 
	}
}
