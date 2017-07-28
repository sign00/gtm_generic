package com.gtm.generic;

public class Paire<T> {

	private T premier;
	private T second;
	
	public Paire(T a, T b) {
		premier = a; second = b;		
	}

	public T getPremier() {
		return premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Paire [premier=" + premier + ", second=" + second + "]";
	}
	
}
