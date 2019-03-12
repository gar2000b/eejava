package com.onlineinteract.predicatepattern;

import com.onlineinteract.predicatepattern.rules.InputTransfer;
import com.onlineinteract.predicatepattern.rules.RulesEngine;
import com.onlineinteract.predicatepattern.rules.RulesEngine.Cohort;

public class FakeApp {
	public static void main(String[] args) {
		InputTransfer inputTransfer = new InputTransfer();
		inputTransfer.setA("value 1");
		inputTransfer.setB("value 1");
		inputTransfer.setC("value 2");
		inputTransfer.setD("value 3");
		
		RulesEngine rulesEngine = new RulesEngine();
		Cohort cohort = rulesEngine.execute(inputTransfer);
		System.out.println("Cohort: " + cohort);
	}
}
