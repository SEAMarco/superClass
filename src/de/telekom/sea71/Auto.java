package de.telekom.sea71;

public class Auto {
	
	private String marke;
	private String typ;

	public Auto (String marke, String typ) {
		this.marke = marke;
		this.typ = typ;
	}

	
	
	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	
}
