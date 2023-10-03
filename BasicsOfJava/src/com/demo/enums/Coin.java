package com.demo.enums;

public enum Coin {
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25); // usual names for US coins
	// note that the above parentheses and the constructor arguments match
	private int value;
	Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
