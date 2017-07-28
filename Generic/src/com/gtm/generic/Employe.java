package com.gtm.generic;

public class Employe extends Personne {

	private int employeID = 0;
	
	public Employe() {
		super(); 
	}

	public Employe(String nom, String prenom, int age) {
		super(nom, prenom, age);

		
	}

	@Override
	public String toString() {
		return "Employe [employeID=" + employeID + "] " + super.toString();
	}

	public int getEmployeID() {
		return employeID;
	}

	public void setEmployeID(int employeID) {
		this.employeID = employeID;
	}

	
}
