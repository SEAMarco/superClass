package de.telekom.sea7;

public class Auto extends BaseObject {

	public Auto(int id) {
		super(id); //Aufruf des Konstructors von BaseObject
				
	}


	public int getId() {
		return super.getId();
	}
	
	public String toString() {
		return "Auto: " + super.toString();
	}
	
	@Override //Verhindert Tippfehler beim "überschreiben" von Methoden
	public void setId (int id) {
		super.setId(getId());
	}
	
}
