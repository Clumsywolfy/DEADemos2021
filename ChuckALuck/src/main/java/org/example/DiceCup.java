package org.example;

public class DiceCup {
	private Die[] dice;
	
	public DiceCup(int count) {
		this.dice = new Die[count];

		for(int i = 0; i < count; i++){
			dice[i] = new Die();
		}
	}
	
	public void roll() {
		for(int i = 0; i < dice.length; i++){
			dice[i].roll();
		}
	}
	
	public int diceEqualTo(int number) {
		int equal = 0;
		for(int i = 0; i < dice.length; i++){
			if (number == dice[i].getFaceValue()){
				equal++;
			}
		}
		return equal;
	}

	public String toString() {
		String result="";
		for (int i=0; i<dice.length; i++) {
			result += " " + dice[i].getFaceValue();
		}	
		return result;
	}
	
}
