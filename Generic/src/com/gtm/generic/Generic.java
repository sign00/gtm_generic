package com.gtm.generic;

public class Generic {

	public <T> void affiche(Paire<T> p) {
		
		System.out.println(p);
	}
/*	
	public void affichePersonnes(Paire<Personne>p) {
		
		System.out.println(p);
	}
*/	
	public void affichePersonnes(Paire<? extends Personne>p) {
		
		System.out.println(p);
	}

}
