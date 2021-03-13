package org.example;

import java.util.Scanner;

public class ChuckALuckGame {
	private int balance = 100;
	private DiceCup cup;
	
	public void startGame() {
		cup = new DiceCup(3);
	}
	
	public void playLuckyNumber(int lucky, int cash) {
		if(balance - cash >= 0) {
			balance -= cash;
			cup.roll();
			int equal = cup.diceEqualTo(lucky);
			updateBalance(equal, cash);
		}
		else{
			System.out.println("Je hebt niet genoeg geld.");
		}
	}
	
	private void updateBalance(int equal, int amount) {
		if(equal == 1){
			balance += amount;
		}
		if(equal == 2) {
			balance += 2 * amount;
		}
		if(equal == 3){
			balance += 10 * amount;
		}
	}
	
	public String diceCupAsString() {
		return cup.toString();
	}
	
	public int getBalance() {
		return balance;
	}
	
}
