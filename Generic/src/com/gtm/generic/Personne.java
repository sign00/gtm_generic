package com.gtm.generic;

//import java.util.Vector;
import java.util.Collection;;

/**
 * Classe M�tier
 * @author malbranche
 * @version 1.0
 *
 */
public class Personne {

	protected String nom;
	protected String prenom;
	protected int age;
	
/*	
	protected Vector<Voiture> voitures = new Vector<>();
	
	public Vector<Voiture> getVoitures() {
		return voitures;
	}
	
	public void setVoitures(Vector<Voiture> voitures) {
		this.voitures = voitures;
	}
*/	
	
	public Personne() {
		nbPersonnes++;
	}
	
	public Personne(String nom, String prenom, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	
	nbPersonnes++;
}

	protected static int nbPersonnes;
		
	public static int getNbPersonnes() {
		return nbPersonnes;
	}
	public static void setNbPersonnes(int nbPersonnes) {
		Personne.nbPersonnes = nbPersonnes;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}
