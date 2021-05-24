package com.barclays.interview.suitabilitycheck.engine;

import com.barclays.interview.suitabilitycheck.RuleInput;
import com.barclays.interview.suitabilitycheck.RuleOutput;

public class SuitabilityCheckById implements SuitabilityCheck {
	public RuleOutput check(RuleInput ruleInput) {
		RuleOutput ruleOutput = new RuleOutput();
		ruleOutput.setId(ruleInput.getId());
		ruleOutput.setThreadName(ruleInput.getThreadName());
		ruleOutput.setResult(false);
		if (ruleInput.getId() % 4 == 0)
			ruleOutput.setResult(true);
		return ruleOutput;
	}
}
