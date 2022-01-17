package de.telekom.sea7;

public class AutoTestMain {

	public static void main(String[] args) {
		Auto auto = new Auto(5);
		
		System.out.println(auto.getId());
		
		System.out.println(auto.toString());
		//alle Klassen hintereinander... Auto, BaseObject, Object

	}

}
