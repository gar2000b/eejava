package com.onlineinteract.predicatepattern.rules;

public class RulesEngine {
	
	public enum Cohort {
		COHORT_2009, COHORT_2010, COHORT_2011, COHORT_2012, PART_TIME_COHORT, PRE_2008_COHORT, SENIOR_COHORT, NO_COHORT;
	}

	public Cohort execute(InputTransfer inputTransfer) {
		if (new Pre2008Cohort().evaluate(inputTransfer))
			return Cohort.PRE_2008_COHORT;
		if (new Cohort2009().evaluate(inputTransfer))
			return Cohort.COHORT_2009;
		if (new Cohort2010().evaluate(inputTransfer))
			return Cohort.COHORT_2010;
		if (new Cohort2011().evaluate(inputTransfer))
			return Cohort.COHORT_2011;
		if (new Cohort2012().evaluate(inputTransfer))
			return Cohort.COHORT_2012;
		if (new PartTimeCohort().evaluate(inputTransfer))
			return Cohort.PART_TIME_COHORT;
		if (new Pre2008Cohort().evaluate(inputTransfer))
			return Cohort.PRE_2008_COHORT;
		if (new SeniorCohort().evaluate(inputTransfer))
			return Cohort.SENIOR_COHORT;
		
		return Cohort.NO_COHORT;
	}
}
