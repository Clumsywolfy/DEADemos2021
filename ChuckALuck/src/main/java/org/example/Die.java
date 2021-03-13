package org.example;

import java.util.Random;

public class Die {
	private int faceValue;
	private Random rand = new Random();
	
	public void roll() {
		faceValue = rand.nextInt(6)+1;
	}
	
	public int getFaceValue() {
		return faceValue;
	}

}
