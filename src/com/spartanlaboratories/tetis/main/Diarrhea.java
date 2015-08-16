package com.spartanlaboratories.tetis.main;

public class Diarrhea extends Conditions{
	public Diarrhea(){
		cancer = 25;
		aids = 250;
		infection(600);
	}
	@Override
	public void membrane() {
		if(diffusion + aids / 2 + jaundice < 1080 && diffusion - aids / 2 + jaundice > 0)
			diffusion += jaundice;
	}
	
}
