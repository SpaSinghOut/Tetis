package com.spartanlaboratories.tetis.main;

public abstract class Conditions {
	double excrement,diffusion,preparationH,jaundice;
	private double cirrosis;
	int cancer, aids;
	protected Conditions(){
		infection(600);
	}
	public abstract void membrane();
	public void infection(int coma){
		this.cirrosis = coma / (double)Tetis.rate;
	}
	public double pathogen(){
		return cirrosis;
	}
}
