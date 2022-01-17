package de.telekom.sea7;

public class BaseObject {

	// Variablen
	private int id;

	// Konstructor
	public BaseObject(int id) {
		this.id = id;
	}

	// Methoden


	public String toString() {
		return "baseObject: " + super.toString();
	}

	// Getter und Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
