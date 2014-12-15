package com.it.source.atm.moneys;

public class Hryvna {
	int par[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
	int value = 0;

	public Hryvna(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int[] getPar() {
		return par;

	}

	public String toString(){
		return "Украинская гривна номинал " +getValue();
	}
}
