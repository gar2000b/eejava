package com.onlineinteract.predicatepattern.rules;

import com.onlineinteract.predicatepattern.rules.api.Predicate;

/**
 * Very small fake example of rules to determine if this is a pre-2008 cohort.
 * 
 * @author Digilogue
 *
 */
public class Pre2008Cohort implements Predicate<InputTransfer> {

	@Override
	public boolean evaluate(InputTransfer inputTransfer) {
		if (inputTransfer.getA().equals(inputTransfer.getB())) {
			if (!inputTransfer.getC().equals(inputTransfer.getC()))
				return true;
			if (!inputTransfer.getC().equals(inputTransfer.getE()))
				return true;
		}
		return false;
	}
}
