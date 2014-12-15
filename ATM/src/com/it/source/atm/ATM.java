package com.it.source.atm;

import com.it.source.atm.collections.Box;
import com.it.source.atm.logic.ATMLogic;
import com.it.source.atm.moneys.Hryvna;

public class ATM {
//TODO	Bag bag = new bag();
//TODO	ATMLogic logic = new ATMLogic();
	
//TODO insertClientValue();
//	public Box box;
//	public ATMLogic logic;
//	
//	public ATM(){
//		box = new Box();
//		logic = new ATMLogic(box);
//	}
		
	public void insertClientValue(int clientValue) {
		Hryvna banknote = new Hryvna(clientValue);
		
		
		ATMLogic logic = new ATMLogic();
		boolean checkResult = logic.checkCounterfeit(banknote);
		
	}
	
	
	
	
}
