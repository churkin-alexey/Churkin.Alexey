package com.it.source.atm.logic;

import com.it.source.atm.moneys.Hryvna;
import com.it.source.atm.moneys.Money;

public class ATMLogic {
//	IBoxWork box;
//TODO consume;
//TODO checkConterFeit;
//TODO garbage;

//	public ATMLogic (IBoxWork box){
//		this.box = box;
//	}
//	
//	
	public boolean checkCounterfeit (Hryvna bank){	
		for (int k = 0; k < bank.getPar().length; k++) {
			if(bank.getValue() == bank.getPar()[k] ) {
				return true;
			}
		}
		
		return false;
	}
	
	public void consume (Hryvna banknot){
		System.out.println("Спасибо что ввели: " + banknot.getValue());
	}
}
