package com.gtm.generic;

public class Lanceur {

	public static void main(String[] args) {
		
		Paire<String>ps = new Paire<String>("un", "deux");
		Paire<Integer>pi = new Paire<Integer>(1,2);

		Generic gen = new Generic();
		gen.affiche(ps);
		gen.affiche(pi);
		
		Paire<Personne>p1 = new Paire<Personne>(
				new Personne("Dupont", "Jacques", 20), 
				new Personne("Dupuis", "Paul", 22));
		
		Paire<Employe>p2 = new Paire<Employe>(
				new Employe("Dupont", "Jacques", 20), 
				new Employe("Dupuis", "Paul", 22));
		
		p2.getPremier().setEmployeID(1234);
		p2.getSecond().setEmployeID(5678);
		
	//	System.out.println(p1);
	//	System.out.println(p2);
		
		gen.affichePersonnes(p1);
		gen.affichePersonnes(p2);
	}

}
